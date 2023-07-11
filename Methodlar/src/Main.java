import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir isim giriniz");
        Scanner scanner= new Scanner(System.in);
        String isim= scanner.nextLine();
        System.out.println("Merhaba dünya!,"+isim);
        selamla();
        selamla(isim);
        System.out.println(topla(5,3));
        System.out.println(selam());
        System.out.println(selam(isim));
    }
    public static  void selamla(){
        System.out.println("Merhaba Dünya!");
    }
    public static  void selamla(String isim){
        System.out.println("Merhaba dünya!,"+isim);
    }
    public static  int topla(int a ,int b){
        return a+b;
    }
    //method adı değişemesi lazım
    //  public static String selamla()
    //   {
    //     return "Merhaba Dünya!";
    //  }
    public static  String selam()
    {
        return "Merhaba Dünya";
    }

    public static  String selam(String isim)
    {
        return "Merhaba Dünya "+isim;
    }
}