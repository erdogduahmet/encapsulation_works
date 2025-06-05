public class Product {
    //attributes | fields
    private int id;
     private String name;
     private String description;
     private double price;
     private int stockAmount;

     private String kod;// kod isim baş harif+id olsun dersen read only olur sadece okur kullanıcı: read only sadece get i yazmak, write only sadece set i yazmak

    //getter
    public int getId(){
        return id;
    }

    //setter
    public void setId(int id){
        this.id=id;//this.id=id >> this.id tanımlanan bloğun yanı porduct classın attribute u// ya da _id=id
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+ id;
    }


    // kod sadece okunur olsun diye setter ı sildik
    /*public void setKod(String kod) {
        this.kod = kod;
    }*/
}
