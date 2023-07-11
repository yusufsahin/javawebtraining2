import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int sayi = 5;
        int[] sayilar = new int[5];
        sayilar[0] = 10;
        sayilar[1] = 20;
        sayilar[2] = 30;
        sayilar[3] = 40;
        sayilar[4] = 50;
        System.out.println(sayilar[4]);

        String[] renkler = {"Mavi", "Beyaz", "Siyah" };
        System.out.println("Dizinin birinci elemanı : " + renkler[0]);
        System.out.println("Dizinin ikinci elemanı : " + renkler[1]);
        System.out.println("Dizinin üçüncü elemanı : " + renkler[2]);

        //for each
        for (String renk:renkler)
        {
            System.out.println("Renk : " + renk);
        }

        int sayilarBoyut= sayilar.length;
        System.out.println("sayialr boyut : "+ sayilarBoyut);

        sayilar[4]=sayilar[4]*2;

        System.out.println(sayilar[4]);
//Index 5 out of bounds for length 5
//Hata verir
       // sayilar[5]=60;
       //  System.out.println(sayilar[5]);

        List<Integer> sayilar2= new ArrayList<>();

        sayilar2.add(10);
        sayilar2.add(20);
        sayilar2.add(30);
        sayilar2.add(40);
        sayilar2.add(50);
        sayilar2.add(60);
        for (int k:sayilar2) {
            System.out.println(k);
        }
        int size= sayilar2.size();

        System.out.println(size);
        sayilar2.add(70);
        sayilar2.add(80);

        for (int k:sayilar2) {
            System.out.println(k);
        }
        size= sayilar2.size();
        System.out.println(size);

    }
}