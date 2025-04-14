package org.example.modell;

public class Szobrok extends Mukincs implements Comparable<Szobrok>{
    private String anyag;
    private int sz;

    public Szobrok(String anyag, int sz) {
        this.anyag = anyag;
        this.sz = sz;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public int getSz() {
        return sz;
    }

    public void setSz(int sz) {
        if (sz > 21) {
            throw new NemLehetTobbException("Nem lehet nagyobb, mint 21!");
        }
        this.sz = sz;
    }

    @Override
    public String toString() {
        return "Szobrok{" +
                "anyag='" + anyag + '\'' +
                ", sz=" + sz +
                '}';
    }

    @Override
    public int compareTo(Szobrok más) {
        return 0;
    }
}
