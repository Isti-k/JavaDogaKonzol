package org.example.modell;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Gyujtemeny {
    private UUID id;
    private String alkoto;
    private String cim;
    private String kategoria;

    private List<Mukincs> mukincs;

    public Gyujtemeny() {
        mukincs = new ArrayList<>();
        mukincs.add(new Szobrok("márvány", 16);
        mukincs.add(new Szobrok("bronz", 19);
        mukincs.add(new Festmenyek("impressionista");
        mukincs.add(new Festmenyek("szürrealista");
        mukincs.add(new Festmenyek("kubista");
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public void setAlkoto(String alkoto) {
        this.alkoto = alkoto;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "id=" + id +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}
