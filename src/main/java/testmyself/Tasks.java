package testmyself;

import java.util.Scanner;

public class Tasks {
    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */
    public static   int count=1;

    public static void main(String[] args) {
Tasks.productList();
    }
    public static void productList(){
        Scanner scan=new Scanner(System.in);

do{
    System.out.println("would you like anything?");
    String yesNo=scan.next();
        if (yesNo.equalsIgnoreCase("yes")) {
            System.out.println("What would you like?");
            String choice = scan.next();
            System.out.println("How many pounds?");
           int pounds = scan.nextInt();
        count= count*pounds;
        }else{
            break;
        }
        }while(true);

        System.out.println("Your total is $"+Tasks.cashier());
    }
    public static double cashier(){
return count;
    }
}
