package org.example.modell;

import java.util.UUID;

public class Mukincs {
    private UUID id;
    private String alkoto;
    private String cim;
    private Kategoria kategoria;

    public Mukincs(String alkoto, String cim, Kategoria kategoria) {
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
        this.id = UUID.randomUUID();
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

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Mukincs{" +
                "id=" + id +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}
