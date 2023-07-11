import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
///if yapısı
        System.out.println("Bir sayi giriniz");
        Scanner scanner= new Scanner(System.in);
        int sayi= scanner.nextInt();
        scanner.nextLine();
        if(sayi>0)
        {
            System.out.println("Sayı pozitif");
        }else {
            System.out.println("Sayı sıfır veya negatif");
        }
//Switch
        System.out.println("Haftanın gününü sayı olarak giriniz");
        int gun= scanner.nextInt();
        scanner.nextLine();
        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz Gün");
        }
        //2 den 20 kadar 2 şer saydıralım
        for (int i=0;i<=20;i+=2) // i++-> i=i+1 / / i+=2->i=i+2;
        {
            System.out.println("Sayı : "+i);
        }

        System.out.println("x değerini giriniz");
        int x= scanner.nextInt();
        scanner.nextLine();
        while (x<=5)
        {
            System.out.println("x : "+x);
            x++;
        }
        System.out.println("y değeri giriniz");
        int y = scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.println("y : "+y);
            y++;
        }while (y<10);


    }
}