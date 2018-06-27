package DataModules;

public class KomodRequest {

    private static long numOfCodeRahgiri = 0;
    // ^ possible bug: vagthi narm azfar bazo baste mishe in shomare reset she.
    private long codeRahgiri;

    private Komod requestedKomod;
    private Daneshjoo requestingDaneshjoo;
    private boolean residegiShode;
    private Vaziat vaziat;
    private String description;


    KomodRequest(Komod requestedKomod, Daneshjoo requestingDaneshjoo){
        this.requestedKomod = requestedKomod;
        this.requestingDaneshjoo = requestingDaneshjoo;
        this.residegiShode = false;
        this.vaziat = Vaziat.MOSHAHEDE_NASHODE;
        this.description = "-";
        this.codeRahgiri = numOfCodeRahgiri++;
    }



    enum Vaziat{ MOSHAHEDE_NASHODE, TAEED, RAD, ENTEZAR}
}
