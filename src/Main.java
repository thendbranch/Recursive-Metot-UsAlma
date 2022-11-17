// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Recursive Metotlar ile Üslü Sayı Hesaplama
            Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
            "Recursive" metot kullanarak yapan programı yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int a = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int b = input.nextInt();

        System.out.println("Recusive Metot : " + recusAlma(a,b));
        System.out.println("For Döngüsü : " +usAlma(a,b));

    }
    // For Döngüsü
    static int usAlma (int t,int us){
        int a = 1;
        for (int i = 1; i <= us ; i++) {
            a*=t;
        }
        return a;
    }
    // Recursive metot
    static int recusAlma (int t,int s) {
        int a = 1;
        if (s == 0){
            return 1;
        }
        else if(t==1) {
            return 1;
        }
        return t * recusAlma(t, s-1);
    }

}