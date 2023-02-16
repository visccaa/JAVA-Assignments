public class Main {
    public static void main(String[] args) {
        Product product = new Product("Coca cola", 32133123, 3);
        System.out.println(product.getInfo());
        System.out.println();
        Chocolate chocolate = new Chocolate("Cokolada", 323233, 4, 100);
        System.out.println(chocolate.getInfo());
        System.out.println();
        Wine wine = new Wine("Vino", 59554, 5, 1);
        System.out.println(wine.getInfo());
    }
}
