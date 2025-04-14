package org.example.modell;

import java.util.List;

public class Gyujtemeny {
    private List<Mukincs> mukincs;

    public Gyujtemeny() {
        mukincs.add(new Szobrok("Michelangelo", "Dávid", Kategoria.EREDETI, "márvány", 16));
        mukincs.add(new Szobrok("Rodin", "A gondolkodó", Kategoria.MASOLAT, "bronz", 19));
        mukincs.add(new Festmenyek("Monet", "Tavirózsák", Kategoria.EREDETI, "impressionista"));
        mukincs.add(new Festmenyek("Renoir", "Fürdőzők", Kategoria.MASOLAT, "impressoanista"));
        mukincs.add(new Festmenyek("Dali", "Hattyúk", Kategoria.KIS_ERTEKU, "szürrealista"));
        mukincs.add(new Festmenyek("Picasso", "Dora", Kategoria.EREDETI, "kubista"));
    }

}
