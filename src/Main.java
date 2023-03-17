import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        Scanner oku= new Scanner(System.in);
        int right=5;
        int guess;
        boolean isWin=false;

        while (right>0){
            System.out.println("\nTahmininizi giriniz : ");
            guess=oku.nextInt();

            if(guess>99 || guess<0){
                System.out.println("Lütfen 0 ile 100 arasinda bir deger giriniz.");
                continue;
            }

            if(guess==number){
                System.out.println("Tebrikler! Doğru Tahmin Ettiniz. Sayi ="+number);
                isWin=true;

            }else {
                right--;
                System.out.println("Tahmininiz Yanlış");
                if(guess>number){
                    System.out.println(guess+" sayisi, gizli sayidan büyüktür.");
                }else if(guess<number){
                    System.out.println(guess+" sayisi, gizli sayidan kücüktür.");
                }
            }

            System.out.println("Kalan hakkiniz : "+right);



        }

        if(!isWin){
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli Sayi = "+number);
        }


    }
}