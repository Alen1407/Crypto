public class Five {public static int modPow(int a, int p, int m) {
    final int k = a % m;
    int q = k;
    for (int i = 0; i < p - 1; i++) {
        q = (q * k) % m;
    }
    return q;
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

    public static void findD_E(int phi, int[] de) {// поиск d и e
        int d = 2;
        while (d < phi) {
            if (isPrime(d)) {
                int e = 2;
                while (e < phi) {
                    if (e == d) {
                        e++;
                        continue;
                    }
                    if ((e * d) % phi == 1) {
                        System.out.format("d=%d e=%d\n", d, e);
                        de[0] = d;
                        de[1] = e;
                        return;
                    }
                    e++;
                }
            }
            d++;
        }
        System.out.println("не найдено");
    }

    public static void RSA_signature() {
        final int HOrig = 26;
        int p = 31;
        int q = 23;
        int n = p * q;
        int fi = (p - 1) * (q - 1);// функция Эйлера
        int[] de = {0, 0};
        findD_E(fi, de);
        int d = de[0];
        int e = de[1];
        System.out.println("Проверка ключей");
        System.out.println("Открытый ключ: " + "(" + d + "," + n + ")");
        System.out.println("Секретный ключ: " + "(" + e + "," + n + ")");
        int s = modPow(HOrig, d, p * q);
        int H = modPow(s, e, p * q);
        System.out.println("s=" + s);
        System.out.println("H=" + H);
        if (H == HOrig) {
            System.out.println("Подпись подлинная");
        } else {
            System.out.println("Подпись фальшивая");
        }
    }
    public static void main(String[] args) {
        RSA_signature();
    }

}
