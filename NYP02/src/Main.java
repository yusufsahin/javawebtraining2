import model.Araba;
import model.Arac;
import model.Motosiklet;

public class Main {
    public static void main(String[] args) {
        Arac mercedes= new Araba();
        Araba bmw= new Araba();

        mercedes.setMarka("Mercedes");
        mercedes.setModel("E320");
        mercedes.setRenk("Siyah");


        bmw.setMarka("BMW");
        bmw.setModel("320");
        bmw.setRenk("Lacivert");
        bmw.setHiz(120);

        bmw.hizlan(30);
        //mercedes.bil

        bmw.bilgileriGoster();

        Motosiklet suzuki= new Motosiklet("Suzuki","Hayabusa","Beyaz",360);
        suzuki.bilgileriGoster();
        suzuki.yavasla(100);
        suzuki.bilgileriGoster();

        bmw.LastikHavaBasıncı();
        suzuki.LastikHavaBasıncı();
        bmw.YorgunlukAlgı();

    }
}