package model;

public class Araba  extends Arac implements LastikKontrol,SurusKontrol{
    private int hiz;

    public Araba() {
    }

    public Araba(String marka, String model, String renk, int hiz) {
        super(marka, model, renk);
        this.hiz = hiz;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public void  hizlan(int hizArtisi){
        this.hiz+=hizArtisi;
    }

    public  void  yavasla(int hizAzaltma){
        this.hiz-=hizAzaltma;
    }

    public void  dur()
    {
        this.hiz=0;
    }

    public void  bilgileriGoster()
    {
        System.out.println("Marka : "+this.getMarka());
        System.out.println("Model : "+ this.getModel());
        System.out.println("Renk : "+ this.getRenk());
        System.out.println("Hiz : "+this.getHiz());
    }

    @Override
    public void LastikHavaBasıncı() {
        System.out.println("Araba - Lastik Hava basıncı kontrol ediliyor");
    }

    @Override
    public void YorgunlukAlgı() {
        System.out.println("Yorgunluk kontrol ediliyor");
    }
}
