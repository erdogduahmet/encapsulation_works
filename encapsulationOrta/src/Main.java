public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setHesap_id(1);
        bankAccount.setKullanici_adi("Ahmet");
        bankAccount.setKullanici_soyadi("ERDOĞDU");
        bankAccount.setBakiye(5000);

	BankAccountManager bankAccountManager=new BankAccountManager();
    bankAccountManager.paraYatir(bankAccount,1000);
    bankAccountManager.paraCek(bankAccount,2000);
    bankAccountManager.bakiyeGor(bankAccount);
    }
}
