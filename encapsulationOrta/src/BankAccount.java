public class BankAccount {

    private String kullanici_adi;
    private String kullanici_soyadi;
    private int hesap_id;
    private double bakiye;

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getKullanici_soyadi() {
        return kullanici_soyadi;
    }

    public void setKullanici_soyadi(String kullanici_soyadi) {
        this.kullanici_soyadi = kullanici_soyadi;
    }

    public int getHesap_id() {
        return hesap_id;
    }

    public void setHesap_id(int hesap_id) {
        this.hesap_id = hesap_id;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
