import product.Shirt;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setSize(Shirt.Size.SMALL);
        shirt.setBrand("Nike");
        shirt.setPrice(49.99);
        shirt.setColor("BLUE");

        shirt.fold();

    }

}
