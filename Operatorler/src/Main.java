public class Main {
    public static void main(String[] args) {
       int a = 10;
       int b = 5;
       //Aritmetik Operatorler
       int toplam= a+b;
       System.out.println("Toplama = "+toplam);

       int fark = a-b;
       System.out.println("Çıkartma = "+ fark);
       int carpim = a*b;
       System.out.println("Çarpma = "+carpim);
       int bolum = a/b;
       System.out.println("Bölme = "+bolum);
       int kalan = a%b;
       System.out.println("Mod = "+ kalan);

       //Atama Operatörleri
        int x= 5;
        System.out.println(x);
        x+=3; //-> x = x+3;
        System.out.println(x);
        x-=2; // ->x=x-2;
        System.out.println(x);
        x*=4; // ->x=x*4;
        System.out.println(x);
        x/=3; // x=x/3;
        System.out.println(x);
        x%=5; //x=x%5;
        System.out.println(x);
        x*=x;// ->x= x*x;
        System.out.println(x);

        //Karşılaştırma operatörleri
        boolean esitMi=(a==b);
        System.out.println(esitMi);
        boolean esitDegilmi= (a!=b);
        System.out.println(esitDegilmi);
        boolean buyukMu=(a>b);
        System.out.println(buyukMu);
        boolean kucukMu=(a<b);
        System.out.println(kucukMu);
        boolean buyukEsitMi=(a>=b);
        System.out.println(buyukEsitMi);
        boolean kucukEsitMi=(a<=b);
        System.out.println(kucukEsitMi);

        // Mantıksal Operatörler
        System.out.println("Mantıksal Operatörler");
        boolean durum1= true;
        boolean durum2= false;
        boolean sonuc1= durum1 && durum2;
        System.out.println(sonuc1);
        boolean sonuc2 =  durum1 || durum2;
        System.out.println(sonuc2);
        boolean sonuc3= !durum1;
        System.out.println(sonuc3);

    }
}