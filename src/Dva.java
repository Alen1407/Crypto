public class Dva {static int[] g28147 = {//Таблица перестановки
        1, 13, 4, 6, 7, 5, 14, 4,
        15, 11, 11, 12, 13, 8, 11, 10,
        13, 4, 10, 7, 10, 1, 4, 9,
        0, 1, 0, 1, 1, 13, 12, 2,
        5, 3, 7, 5, 0, 10, 6, 13,
        7, 15, 2, 15, 8, 3, 13, 8,
        10, 5, 1, 13, 9, 4, 15, 0,
        4, 9, 13, 8, 15, 2, 10, 14,
        9, 0, 3, 4, 14, 14, 2, 6,
        2, 10, 6, 10, 4, 15, 3, 11,
        3, 14, 8, 9, 6, 12, 8, 1,
        14, 7, 5, 14, 12, 7, 1, 12,
        6, 6, 9, 0, 11, 6, 0, 7,
        11, 8, 12, 3, 2, 0, 7, 15,
        8, 2, 15, 11, 5, 9, 5, 5,
        12, 12, 14, 2, 3, 11, 9, 3


};


    public static String xor(String a, String b) { //мод 2
        if (a.length() != b.length())
            return null;
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < a.length(); k++) {
            if (a.charAt(k) != b.charAt(k))
                sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }


    public static String ph_1(final int bits, String initData) {// 33 русские буквы, начиная с кода 192

        if (initData.length() * 8 < bits) {
            System.out.println("Не хвататет данных для формирования ключа");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bits / 8; i++) {
            char letter = initData.charAt(i);
            if (!(letter >= 'А' && letter <= 'Я' || letter == 'Ё'|| letter == ' ')) {
                System.out.println("Ожидались заглавные русские буквы");
                return null;
            }
            int offset = letter - 'А';// [192...224]

            String b = Integer.toBinaryString(192 + offset);

            sb.append(b);

        }

        return sb.toString();
    }



    public static String sumMod32(String a, String b) {
        //Сумма по мод 2^32
        if (a.length() != b.length()) {
            System.out.println("Размеры слагаемых должны быть равны: ");
            return null;
        }
        int carry = 0;
        StringBuilder sb = new StringBuilder(a.length());
        for (int k = a.length() - 1; k >= 0; k--) {
            int sum = a.charAt(k) - 48 + b.charAt(k) - 48 + carry;
            sb.append((char) (sum % 2 + 48));
            carry = sum / 2;
        }
        for (int k = 0; k < a.length() / 2; k++) {
            char tmp = sb.charAt(k);
            sb.setCharAt(k, sb.charAt(a.length() - 1 - k));
            sb.setCharAt(a.length() - 1 - k, tmp);
        }
        return sb.toString();
    }


    public static String gosttablesub(String a) {
    /*          if (a.length() != 32) {
               return null;
           }*/
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < 8; k++) {
            int z = 8 * (a.charAt(k * 4) - 48) + 4 * (a.charAt(k * 4 + 1) - 48) + 2 * (a.charAt(k * 4 + 2) - 48) + 1 * (a.charAt(k * 4 + 3) - 48);
            int d = g28147[8 * z + k];
            String b = Integer.toBinaryString(d);
            while (b.length() < 4) {
                b = "0" + b;
            }
            sb.append(b);
        }
        return sb.toString();
    }

    public static String cyclicShiftLeft(String a, int d) {// Циклический сдвиг
        StringBuilder sb = new StringBuilder(a.length());
        for (int i = 0; i < a.length(); i++) {
            sb.append('.');
        }
        for (int k = 0; k < a.length(); k++) {
            int k2 = k - d;
            if (k2 < 0)
                sb.setCharAt(a.length() + k2, a.charAt(k));
            else
                sb.setCharAt(k2, a.charAt(k));

        }
        return sb.toString();
    }

    public static void GOST2817() {

        String L0 = ph_1(32, "БУЛГ");
        String R0 = ph_1(32, "АЯРОВА");
        String X0 = ph_1(32, "ДМИТ");
        System.out.println("L0: " + L0);
        System.out.println("R0: " + R0);
        System.out.println("X0: " + X0);
        String N2_1 = sumMod32(R0, X0);
        System.out.println("S=: " + N2_1);//Сумма по мод 2 в 3
        String N2_2 = gosttablesub(N2_1);//перестановка
        System.out.println(N2_2);
        String N2_3 = cyclicShiftLeft(N2_2, 11);//Сдвиг кода на 11 бит влево
        System.out.println(N2_3);
        String resultN2_4 = xor(N2_3, L0);//Ищем R1
        System.out.println("R1=: " + resultN2_4);
        System.out.println("GOST: " + R0 + resultN2_4);// Итог

    }
    public static void main(String[] args) {
        GOST2817();
    }

}
