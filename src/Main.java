import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // dizinin max ve min bulma
        /*int[] list = {1, 5, -8, 99, 15896, -985};
        int max = list[0];
        int min = list[0];

        for (int i: list) {
            if (i<min){
                min=i;

            }
            if (i>max){
                max=i;
            }

        }
        System.out.println("max eleman: "+max);
        System.out.println("min eleman: "+min);

         */
        //ÖDEV
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
        // en büyük en yakın sayıyı bulan programı yazınız.
        //ÖRN
        //Dizi : {15,12,788,1,-1,-778,2,0}
        //Girilen Sayı : 5
        //Girilen sayıdan küçük en yakın sayı(kys) : 2
        //Girilen sayıdan büyük en yakın sayı (bys): 12

        Scanner scan = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("lütfen bir sayı giriniz: ");
        int girilen = scan.nextInt();
        int kys = Integer.MIN_VALUE;
        int bys = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < girilen && i > kys) {
                kys = i;
            }
            if (i > girilen && i < bys) {
                bys = i;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+kys);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+bys);
    }
}