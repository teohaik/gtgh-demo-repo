package gr.uom.gtgh.example.vaccination.models;

public class Doctor {

    private String name;
    private String amka;

    public Doctor(){}

    public Doctor(String name, String amka) {
        this.name = name;
        this.amka = amka;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }
}
