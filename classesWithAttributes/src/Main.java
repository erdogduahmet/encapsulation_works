public class Main {

    public static void main(String[] args) {
        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        System.out.println(product.getName());

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }
}
