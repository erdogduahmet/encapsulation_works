public class Main {

    public static void main(String[] args) {
	Urun urun=new Urun();
    urun.setIsim("Püskevit");
    urun.setUrunId(1);
    urun.setStokMiktari(5);
    urun.setFiyat(50);


    UrunManager urunManager=new UrunManager();
    urunManager.satUrun(urun);

    System.out.println(urun.getSatisFiyati());

    }

}
