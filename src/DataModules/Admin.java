package DataModules;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable {
    ArrayList<Komod> allKomods;
    ArrayList<KomodRequest> komodRequestsHayeBarresiNashode;


    void giveKomod(int radif, int num, String id,  String name, String email, String number){
        //komod radif o num, sahebash object daneshjoo ba moshakhasate bala assign mishavad.
    }
    ArrayList<Komod> getKomodHayeKhali(){
        return null;
    }

    KomodRequest getKomodRequest(long codeRahgiri){
        return null;
    }

    void taghirVaziatKomodRequest(KomodRequest komodRequest, KomodRequest.Vaziat vaziat, boolean residegiShode, String newDescription){

    }

    void tahvilGereftanKomod(Komod komod){

    }

    void ezafeKardaneEtelaat(){ //argument haye voroodi?

    }
}
