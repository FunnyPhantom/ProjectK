package DataModules;

import java.io.Serializable;
import java.util.Date;

public class KomodRequest implements Serializable {

    private static long numOfCodeRahgiri = 0;
    // ^ possible bug: vagthi narm azfar bazo baste mishe in shomare reset she.
    private long codeRahgiri;

    private Daneshjoo requestingDaneshjoo;
    private boolean residegiShode;
    private Vaziat vaziat;
    private String description;
    private Date zamaneDarkhast;


    KomodRequest( Daneshjoo requestingDaneshjoo){
        this.requestingDaneshjoo = requestingDaneshjoo;
        this.residegiShode = false;
        this.vaziat = Vaziat.MOSHAHEDE_NASHODE;
        this.description = "-";
        zamaneDarkhast = new Date();
        this.codeRahgiri = numOfCodeRahgiri++;
    }



    enum Vaziat{ MOSHAHEDE_NASHODE, TAEED, RAD, ENTEZAR}
}
