public class Four {public static int modPow(int a,int p,int m){ //Поиск остатка
    final int k = a%m;
    int q= k;
    for (int i=0; i<p-1;i++){
        q=(q*k)%m;
    }
    return q;
}
    public static void Hashing () {
        int[] numbers = {2,21,13,4,1,33,18,16,3,1};//Фамилия
        int H0 = 5;
        int h = H0;
        for (int k=0;k< numbers.length;k++) {
            int nh = ((h+numbers[k])*(h+numbers[k])) %  299;
            System.out.format("H%d = %d\n", k+1,nh);
            h=nh;
        }
    }
    public static void main(String[] args) {
        Hashing();
    }

}
