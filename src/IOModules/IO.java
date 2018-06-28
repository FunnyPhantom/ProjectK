package IOModules;

import DataModules.Komod;
import DataModules.KomodRequest;

import java.io.*;
import java.util.ArrayList;

public class IO {
    static File path = new File("Data/");
    static File komodData = new File(path, "komod-data.dat");
    static File requestData = new File(path, "request-data.dat");
    static ObjectOutputStream dataWriter;
    static ObjectInputStream dataReader;


    static FileOutputStream komodDataOutput;
    static FileInputStream komodDataInput;
    static FileInputStream requestDataInput;
    static FileOutputStream requestDataOutput;





    public static void saveKomodData(ArrayList<Komod> komods){
        try {
            komodData.createNewFile();
            komodDataOutput = new FileOutputStream(komodData, false);
            dataWriter = new ObjectOutputStream(komodDataOutput);
            dataWriter.writeObject(komods);
            dataWriter.flush();
            dataWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Komod> readKomodData(){
        try {
            if (komodData.createNewFile()){
                ArrayList<Komod> kd = Komod.generateKomodData();
                saveKomodData(kd);
                return kd;
            }
            else {
                komodDataInput = new FileInputStream(komodData);
                dataReader = new ObjectInputStream(komodDataInput);
                ArrayList<Komod> kd = ((ArrayList<Komod>) dataReader.readObject());
                return kd;
            }
        } catch (IOException e){
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void saveRequestData(KomodRequest kr){
        try {
            requestData.createNewFile();
            ArrayList<KomodRequest> krs = readRequestData();
            krs.add(kr);
            KomodRequest.setNumOfCodeRahgiri(krs.size());
            requestDataOutput = new FileOutputStream(requestData);
            dataWriter = new ObjectOutputStream(requestDataOutput);
            dataWriter.writeObject(krs);
            dataWriter.flush();
            dataWriter.close();

        } catch (IOException e){
            e.printStackTrace();
            System.out.println("va ajaba");
        }
    }
    public static ArrayList<KomodRequest> readRequestData(){
        ArrayList<KomodRequest> ret = new ArrayList<>();
        Object read = null;
        try {
            if (requestData.createNewFile()){
                return ret;
            }
            else {
                requestDataInput = new FileInputStream(requestData);
                try {
                    dataReader = new ObjectInputStream(requestDataInput);
                } catch (EOFException e){
                    return ret;
                }
                ArrayList<KomodRequest> krs = (ArrayList<KomodRequest>) dataReader.readObject();
                KomodRequest.setNumOfCodeRahgiri(krs.size());
                return (krs);
            }
        } catch (IOException e){
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}

