package gr.uom.gtgh.example.vaccination.models;

public class Insured {

    private String afm;
    private String amka;

    public Insured(String afm, String amka) {
        this.afm = afm;
        this.amka = amka;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    @Override
    public String toString() {
        return "Insured{" +
                "afm='" + afm + '\'' +
                ", amka='" + amka + '\'' +
                '}';
    }

}
