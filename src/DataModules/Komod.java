package DataModules;

import java.io.Serializable;
import java.util.ArrayList;

public class Komod implements Serializable {
    private static final int TEDAD_RADIF = 30;
    private static final int TEDAD_KOMOD_DAR_HAR_RADIF = 16;
    private int radif;
    private int shomare;
    private Daneshjoo owner;

    public Komod(int radif, int shomare){
        this.radif = radif;
        this.shomare = shomare;
        this.owner = Daneshjoo.KHALI;
    }

    public Komod(int radif, int shomare, Daneshjoo saheb){
        this.radif = radif;
        this.shomare = shomare;
        this.owner = saheb;
    }


    public Daneshjoo getOwner() {
        return owner;
    }
    public String getId() {
        return radif + "-" + shomare;
    }


    public static ArrayList<Komod> generateKomodData(){
        ArrayList<Komod> kd = new ArrayList<>(480);
        for (int i = 0; i < 480; i++) {
            int radif = (i/TEDAD_KOMOD_DAR_HAR_RADIF + 1);
            int shomare = (i%TEDAD_KOMOD_DAR_HAR_RADIF) + 1;
            kd.add(new Komod(radif, shomare));
        }
        return kd;
    }


    @Override
    public String toString() {
        return "Komod: " + this.getId() + ",\n\tOwner: " + this.owner.toString();
    }
}
