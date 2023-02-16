public class Wine extends  Product{
    int zapreminaBoce;

    public final double dodatniPorez = 1.1;

    public Wine(String nazivProizvoda, int barKod, double osnovnaCijena, int zapreminaBoce){
        super(nazivProizvoda, barKod, osnovnaCijena);
        this.zapreminaBoce = zapreminaBoce;
    }

    @Override
    public double cijenaSaPorezom() {
        return super.cijenaSaPorezom() * dodatniPorez;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"+
                "Zapremina boce: " + zapreminaBoce;
    }

}
