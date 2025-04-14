package org.example.modell;

public class Festmenyek extends Mukincs{
    private String stilus;

    public Festmenyek(String alkoto, String cim, Kategoria kategoria, String stilus) {
        super(alkoto, cim, kategoria);
        this.stilus = stilus;
    }

    public String getStilus() {
        return stilus;
    }

    public void setStilus(String stilus) {
        this.stilus = stilus;
    }

    @Override
    public String toString() {
        return "Festmenyek{" +
                "stilus='" + stilus + '\'' +
                '}';
    }
}
