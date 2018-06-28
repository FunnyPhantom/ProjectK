package DataModules;

import java.io.Serializable;
import java.util.Date;

public class KomodRequest implements Serializable, Comparable<KomodRequest> {

    private static long numOfCodeRahgiri = 0;
    // ^ possible bug: vagthi narm azfar bazo baste mishe in shomare reset she.
    private long codeRahgiri;

    private Daneshjoo requestingDaneshjoo;
    private boolean residegiShode;
    private Vaziat vaziat;
    private String description;
    private Date zamaneDarkhast;


    public KomodRequest( Daneshjoo requestingDaneshjoo){
        this.requestingDaneshjoo = requestingDaneshjoo;
        this.residegiShode = false;
        this.vaziat = Vaziat.MOSHAHEDE_NASHODE;
        this.description = "-";
        zamaneDarkhast = new Date();
        this.codeRahgiri = numOfCodeRahgiri++;
    }


    public static void setNumOfCodeRahgiri(long numOfCodeRahgiri) {
        KomodRequest.numOfCodeRahgiri = numOfCodeRahgiri;
    }

    enum Vaziat implements Serializable{ MOSHAHEDE_NASHODE, TAEED, RAD, ENTEZAR}


    @Override
    public String toString() {
        return "RequestID: " + this.codeRahgiri + ",\n\t Daneshjoo: \n\t" + this.requestingDaneshjoo + "\n\t vaziat: " +
                vaziat + "\n\t Tarikh:" + zamaneDarkhast;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if (obj instanceof  KomodRequest)
            return ((KomodRequest) obj).codeRahgiri == this.codeRahgiri;
        return false;
    }

    @Override
    public int compareTo(KomodRequest o) {
        if ( this.codeRahgiri - o.codeRahgiri > 0 )
            return -1;
        else if (this.codeRahgiri == o.codeRahgiri){
            return 0;
        }
        else
            return  1;
    }
}
