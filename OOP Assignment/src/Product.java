public class Product {
    String nazivProizvoda;
    int barKod;
    double osnovnaCijena;

    public final double porez = 1.2;

    public Product(){

    }

    public Product(String nazivProizvoda, int barKod, double osnovnaCijena){
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCijena = osnovnaCijena;

    }
    public double cijenaSaPorezom(){
        return osnovnaCijena * porez;
    }
    public String getInfo(){
        return "Naziv proizvoda: " + nazivProizvoda + "\n"+
                "Bar-kod: " + barKod + "\n"+
                "Osnovna cijena: " + osnovnaCijena + "\n"+
                "Cijena sa porezom: " + cijenaSaPorezom();
    }
}
