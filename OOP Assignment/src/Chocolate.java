public class Chocolate extends Product{
    int tezina;

    public Chocolate (String nazivProizvoda, int barKod, double osnovnaCijena, int tezina){
        super(nazivProizvoda, barKod, osnovnaCijena);
        this.tezina = tezina;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"\n"+
                "Tezina: " + tezina;
    }
}
