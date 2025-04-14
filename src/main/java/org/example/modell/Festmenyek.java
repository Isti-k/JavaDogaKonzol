package org.example.modell;

public class Festmenyek extends Mukincs{
    private String stilus;

    public Festmenyek(String stilus) {
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
