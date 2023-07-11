import model.Araba;

public class Main {
    public static void main(String[] args) {
        Araba araba= new Araba();
        araba.setMarka("Mercedes");
        araba.setModel("C200");
        araba.setRenk("Gece Mavisi");
        araba.setHiz(200);
        System.out.println("Araba : " + araba.getMarka()+" "+araba.getModel()+" "+araba.getRenk()+" "+araba.getHiz());
        Araba araba2= new Araba("BMW","320","Beyaz",220);
        System.out.println("Araba2 : " + araba2.getMarka()+" "+araba2.getModel()+" "+araba2.getRenk()+" "+araba2.getHiz());
        araba.yavasla(60);

        araba.bilgileriGoster();
        araba.hizlan(20);
        araba.bilgileriGoster();

        araba2.dur();
        
        araba2.bilgileriGoster();

    }
}