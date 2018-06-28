package DataModules;

import IOModules.IO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Admin implements Serializable {
    static Admin instance;

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    private Admin(){
        allKomods = IO.readKomodData();
        allKomodRequest = IO.readRequestData();
        komodRequestHayeBaz = findOpenRequests(allKomodRequest);

    }

    ArrayList<Komod> allKomods;
    ArrayList<KomodRequest> allKomodRequest;
    LinkedBlockingQueue<KomodRequest> komodRequestHayeBaz;

    //TODO
    LinkedBlockingQueue<KomodRequest> findOpenRequests(ArrayList<KomodRequest> kr){
        return null;
    }

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
