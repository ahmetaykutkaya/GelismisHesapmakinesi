import com.sun.source.tree.BinaryTree;

import java.sql.PreparedStatement;
import java.util.Scanner;
public class Main {

    static int collect(int n1,int n2){
        int result = n1 + n2;
        System.out.println("Toplam :"+n1 +"+"+ n2+"="+ result);
        return result;
    }
    static int extraction(int n1 ,int n2){
        int result = n1 -n2;
        System.out.println("Farki :"+n1 +"-"+ n2+"="+ result);
        return result;
    }
    static int times(int n1,int n2){
        int result = n1*n2;
        System.out.println("Carpma :"+n1 +"*"+ n2+"="+ result);
        return result;
    }
    static int division(int n1 ,int n2){
        if (n2 == 0){
            System.out.println("Hıc bir sayi 0 a bolunemez ...");
            return 1;
        }
        int result = n1*n2;
        System.out.println("Bolum :"+n1+"/"+n2+"="+result);
        return result;
    }
    static int power(int n1 , int n2){
        int result = 1;
        for (int i =1;i <= n2;i++){
            result *= n1;
        }
        System.out.println("Carpim :"+n1+ " uzeri "+n2+" = "+result );
        return result;
    }
    static int factorial(int x){
        Scanner data= new Scanner(System.in);
        System.out.print("Faktoriyeli giriniz : ");
        x = data.nextInt();

        int result = 1;
        for(int i = 1 ;i <=x;i++){
            result *=i;
        }
        System.out.println(x +" Faktoriyel : "+ " = "+ result);
        return result;
    }
    static int mod(int n1 , int n2){
        int result = n1 %n2;
        System.out.println(n1+" Mod "+n2 +" = "+ result);
        return result;
    }
    static void calc(int n1 , int n2 ){
        System.out.println("Cevresi : "+(2*(n1+n2)));
        System.out.println("Alani :"+ (n1*n2));

    }

    public static void main(String[] args)
    {
        Scanner data =new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";
        System.out.println(menu);
        int x = 0;
        while (true){
            System.out.println("Yapilacak islemi seciniz : ");
            select=data.nextInt();
            if (select ==0 ){
                System.out.println("Programdan cikildi ...");
                break;
            }else if (select < 0 || select > 8){
                System.out.println("lutfen dogru secim yapiniz..");
                continue;

            }
                System.out.print("Birinci sayiyi giriniz : ");
                int n1 = data.nextInt();
                System.out.print("Ikinci sayiyi giriniz : ");
                int n2 = data.nextInt();

            switch (select){

                case 1:
                    collect(n1,n2);
                    break;
                case 2:
                    extraction(n1,n2);
                    break;
                case 3:
                    times(n1,n2);
                    break;
                case 4:
                    division(n1,n2);
                    break;
                case 5:
                    power(n1,n2);
                    break;
                case 6:
                    factorial(x);
                    break;
                case 7:
                    mod(n1,n2);
                    break;
                case 8:
                    calc(n1,n2);
                    break;
                default:
            }
        }
    }
}