public class Main {
    public static void main(String[] args) {
        //Değişken
        String isim = "John Doe";

        //Sabit
        final String mesaj = "Hello World!,";
        System.out.println(mesaj+isim);
        //Tekrar isime atama yapıldı.
        isim="Jane Doe";

        System.out.println(isim);

        //Çemberin çevresi Ç = 2*pi*r

        final float PI_SAYISI=3.14F;
        int r = 5;

        float cevre= 2*PI_SAYISI*r;

        System.out.println("Çemberin Çevresi = "+cevre);

        //float alan = PI_SAYISI *r*r;
        double alan = PI_SAYISI* Math.pow(r,2);

        System.out.println("Çemberin Alanı : "+ alan);

        byte b = 127;
        b=126;
        short b2= -128;
        b2=-129;
        short sayi1= 512;
        int sayi2= sayi1;
       //atama gerçekleşmez
      //  sayi1=sayi2;
        System.out.println(b);
        System.out.println(b2);
        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}