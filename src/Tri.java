import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Tri {

    public static int modPow(int a, int p, int m) {//Поиск остатка
        final int k = a % m;
        int q = k;
        for (int i = 0; i < p - 1; i++) {
            q = (q * k) % m;
        }
        return q;
    }

    public static int generateD(int num) {
        Random rand = new Random();
        int d;
        do {
            d = rand.nextInt(num - 1) + 1;
        } while (gcd(d, num) != 1);

        return d;
    }

    public static int[] generateDE(int num) {
        Random rand = new Random();
        int d;
        int e;
        do {
            d = rand.nextInt(num - 1) + 1;
        } while (gcd(d, num) != 1);
        e = 265/d;
        while ((5 * e - 1)%264 != 0) {
            do {
                d = rand.nextInt(num - 1) + 1;
            } while (gcd(d, num) != 1);
            e = 265/d;
        }
        int[] result = {d, e};
        return result;
    }

    // Helper function to calculate the greatest common divisor (gcd) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void RSA_EncodeDecode() {


// Create a new instance of the Random class
        Random random = new Random();


// Исходные данные
        int[] data = {2, 1, 5};
        int[] encodedData = {0, 0, 0};
        int p = 23;
        int q = 13;
        int n = p * q;
        int fi = (p - 1) * (q - 1);
        int d = generateDE(fi)[0];
        int e = generateDE(fi)[1];

// Проверка ключей
        System.out.println("Проверка ключей: (d*e) mod 80 = " + (e * d) % fi);

// Вывод открытого и секретного ключей
        System.out.println("Открытый ключ: " + "(" + e + "," + n + ")");
        System.out.println("Секретный ключ: " + "(" + d + "," + n + ")");

// Шифрование
        for (int i = 0; i < data.length; i++) {
            int x = modPow(data[i], e, n); // Вычисление значения C
            System.out.format("C%d = %d\n", i + 1, data[i], e, n, x);
            encodedData[i] = x;
        }

// Дешифрование
        for (int i = 0; i < data.length; i++) {
            int x = modPow(encodedData[i], d, n); // Вычисление значения M
            System.out.format("M%d = %d\n", i + 1, encodedData[i], e, n, x);
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        int k = 2;
        while (k * k < n) {
            if (n % k == 0) {
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        RSA_EncodeDecode(); // Запуск алгоритма RSA
    }

}