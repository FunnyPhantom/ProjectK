package DataModules;

public class Komod {
    private final int TEDAD_RADIF = 30;
    private final int TEDAD_KOMOD_DAR_HAR_RADIF = 16;
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
}
