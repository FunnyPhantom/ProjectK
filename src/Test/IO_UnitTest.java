package Test;


import DataModules.Daneshjoo;
import DataModules.Komod;
import DataModules.KomodRequest;
import IOModules.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IO_UnitTest {
    public static void main(String[] args) {
        /*ArrayList<Komod> aa = IO.readKomodData();
        ArrayList<Komod> kd = new ArrayList<>();
        kd.add(new Komod(20,10, new Daneshjoo("123", "mamad", "-","-")));
        IO.saveKomodData(kd);
        ArrayList<Komod> kdd = IO.readKomodData();
        System.out.println(kdd);*/



        ArrayList<KomodRequest> kr = IO.readRequestData();
        IO.saveRequestData(new KomodRequest(new Daneshjoo("95243083", "mamad", "-", "09350650213" )));
        IO.saveRequestData(new KomodRequest(new Daneshjoo("1212", "sdasd", "-" , "09123456789")));
        kr = IO.readRequestData();
        for (KomodRequest k :
                kr) {
            System.out.println(k);
        }


    }
    static void x(ArrayList<Integer> a){
        a = new ArrayList<>(2);
        a.add(2);
        a.add(3);
    }

}

