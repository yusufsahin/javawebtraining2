import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bölünen sayıyı giriniz");
        int bolunen= scanner.nextInt();
        System.out.println("Bolen sayıyı giriniz");
        int bolen= scanner.nextInt();
        try {
            int sonuc=bolme(bolunen,bolen);
            System.out.println("Sonuc : " +sonuc);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Bir hata oluştu : "+e.getMessage());
        }

    }
    public static  int bolme(int bolunen,int bolen) throws ArithmeticException
    {
        if (bolen==0){
            throw  new ArithmeticException("Bölen sıfır olamaz!");
        }
        return bolunen/bolen;
    }
}