public class Urun {

    private int urunId;
    private String isim;
    private double fiyat;
    private int stokMiktari;
    private double satisFiyati;

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat=fiyat;
        if (fiyat>0){
            this.fiyat=fiyat;
        }else {// burada uyarı metniyle sistemden çıkma yerine hata fırlatma kodu yazdık
            throw new IllegalArgumentException("fiyat 0 veya negatif olamaz");
            //System.out.println("Geçersiz fiyat girdiniz");
            //System.exit(0);

        }
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public double getSatisFiyati() {
        return getFiyat()*1.18;
    }


}
