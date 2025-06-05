public class BankAccountManager {

    public void paraYatir(BankAccount bankAccount,double miktar){
        bankAccount.setBakiye(bankAccount.getBakiye()+miktar);
    System.out.println("yeni bakiye:"+ bankAccount.getBakiye());
    }

    public void paraCek(BankAccount bankAccount,double miktar){
        if (bankAccount.getBakiye()>miktar){
            bankAccount.setBakiye(bankAccount.getBakiye()-miktar);
            System.out.println("yeni bakiye: "+bankAccount.getBakiye());
        }else {
            System.out.println("yetersiz bakiye");
        }
    }

    public void bakiyeGor(BankAccount bankAccount){
        System.out.println("Hesap ve bakiye :"+ bankAccount.getHesap_id()+ ";"+ bankAccount.getBakiye());
    }
}
