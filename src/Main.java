public class Main {
    static int[] Table1 = {58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20,
        12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8,
        57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53,
        45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};//Таблицы перестановок

    static int[] S1 = {14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7,
            0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8,
            4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0,
            15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13};//Таблицы перестановок

    static int[] S2 = {15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10,
            3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5,
            0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15,
            13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9};//Таблицы перестановок

    static int[] S3 = {10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8,
            13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1,
            13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7,
            1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12};//Таблицы перестановок

    static int[] S4 = {7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15,
            13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9,
            10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4,
            3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14};//Таблицы перестановок

    static int[] S5 = {2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9,
            14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6,
            4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14,
            11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3};//Таблицы перестановок

    static int[] S6 = {12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11,
            10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8,
            9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6,
            4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13};//Таблицы перестановок

    static int[] S7 = {4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1,
            13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6,
            1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2,
            6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12};//Таблицы перестановок

    static int[] S8 = {
            13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7,
            1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2,
            7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8,
            2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11};//Таблицы перестановок


    static int[] P = {
            16, 7, 20, 21, 29, 12, 28, 17,
            1, 15, 23, 26, 5, 18, 31, 10,
            2, 8, 24, 14, 32, 27, 3, 9,
            19, 13, 30, 6, 22, 11, 4, 25//Таблицы перестановок
    };

    static int[] ReverseP = {
            40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31,//Таблицы перестановок
            38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29,
            36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27,
            34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25

    };



    static String Extend32to48(String a) {
        if (a.length() != 32) {
            System.out.println("Этап 4-неправильный размер данных");
            return null;
        }

        StringBuilder sb = new StringBuilder(48); //емкость 48
        for (int i = 0; i < 48; i++) {
            sb.append('.');

        }
        int k = 31;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                sb.setCharAt((6 * i) + j, a.charAt(k));
                k = (k + 1) % 32;
            }
            k = (i + 1) * 4 - 1;
        }
        return sb.toString();
    }

    public static String ph_6(int[] s, String data) {
        int v1 = 2 * (data.charAt(0) - '0') + (data.charAt(5) - '0');

        int v2 = 8 * (data.charAt(1) - '0') +
                4 * (data.charAt(2) - '0') +
                2 * (data.charAt(3) - '0') +
                (data.charAt(4) - '0');

        int code = s[v1 * 16 + v2];

        String result = Integer.toBinaryString(code);
        while (result.length() < 4) {
            result = "0" + result;
        }
        return result;
    }

    public static String permut(int[] tpermut, String bits) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < tpermut.length; k++) {
            sb.append(bits.charAt(tpermut[k] - 1));
        }
        return
                sb.toString();
    }

    public static String xor(String a, String b) {
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
            char bukva = initData.charAt(i);
            if (!(bukva >= 'А' && bukva <= 'Я' || bukva == 'Ё')) {
                System.out.println("Ожидались заглавные русские буквы");
                return null;
            }
            int offset = bukva - 'А';// [192...224]

            String b = Integer.toBinaryString(192 + offset);

            sb.append(b);

        }

        return sb.toString();
    }

    public static String ph_3(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 8 == 7) continue;
            sb.append(s.charAt(i));
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i % 8 == 7) continue;
            sb2.append(sb.charAt(i));
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    public static String ph_6_7(String result5) {
        StringBuilder sb = new StringBuilder();
        sb.append(ph_6(S1, result5.substring(0, 6)));
        sb.append(ph_6(S2, result5.substring(6, 12)));
        sb.append(ph_6(S3, result5.substring(12, 18)));
        sb.append(ph_6(S4, result5.substring(18, 24)));
        sb.append(ph_6(S5, result5.substring(24, 30)));
        sb.append(ph_6(S6, result5.substring(30, 36)));
        sb.append(ph_6(S7, result5.substring(36, 42)));
        sb.append(ph_6(S8, result5.substring(42, 48)));
        return sb.toString();
    }

    public static void DES() {
        String key_1 = ph_1(64, "АКОПОВИЧ");//Ключ
        System.out.println("Key: " + key_1);
        String block_1 = ph_1(64, "НАЗАРЯНГ");//То, что шифруем
        System.out.println("Orig: " + block_1);
        String block_2 = permut(Table1, block_1);// Результат пункта 1
        System.out.println("Perm: " + block_2);
        String L0 = block_2.substring(0, 32);
        String R0 = block_2.substring(32, 64);
        System.out.println("L0: " + L0);// Результат пункта 2
        System.out.println("R0: " + R0);
        String k48 = ph_3(key_1);// Результат пункта 3
        System.out.println("key48bit: " + k48);
        String R48 = Extend32to48(R0);// Результат пункта 4
        System.out.println("R(48): " + R48);
        String result5 = xor(k48, R48);// Результат пункта 5
        System.out.println("R48xorX0: " + result5);

        String result_7 = ph_6_7(result5);// Результат пункта 6
        System.out.println("result7: " + result_7);// Результат пункта 7
        String result_8 = permut(P, result_7);
        System.out.println("result8 = " + result_8);// Результат пункта 8
        String R1 = xor(result_8, L0);// Результат пункта 9
        System.out.println("R1 = " + R1);
        String L1 = R0;
        String L1R1 = L1 + R1;//склейка
        ;
        String finalResult = permut(ReverseP, L1R1);
        System.out.println("DES64: " + finalResult);// Результат пункта 10
    }


    public static void main(String[] args) {
        DES();
    }
}
