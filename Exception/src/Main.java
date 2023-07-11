import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Bolunecek sayıyı giriniz");
                int bolunen = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Bolen sayıyı giriniz");
                int bolen = scanner.nextInt();
                scanner.nextLine();
                int sonuc = bolme(bolunen, bolen);
                System.out.println("Sonuc = " + sonuc);
            }catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }finally{
                System.out.println("---Finally block executed---");
            }
        }
    public static int bolme(int bolunen, int bolen)
    {
        return  bolunen/ bolen;
    }
}