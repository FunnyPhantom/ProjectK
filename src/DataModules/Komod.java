package DataModules;

import java.io.Serializable;
import java.util.ArrayList;

public class Komod implements Serializable {
    private static final int TEDAD_RADIF = 30;
    private static final int TEDAD_KOMOD_DAR_HAR_RADIF = 16;
    private int[] id;
    private Daneshjoo owner;

    Komod(int radif, int shomare){
        this.id = new int[2];
        this.id[0] = radif;
        this.id[1] = shomare;
        this.owner = Daneshjoo.KHALI;
    }

    Komod(int radif, int shomare, Daneshjoo saheb){
        this.id = new int[2];
        this.id[0] = radif;
        this.id[1] = shomare;
        this.owner = saheb;
    }


    public Daneshjoo getOwner() {
        return owner;
    }
    public String getId() {
        return id[0] + "-" + id[1];
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
}
