package IOModules;

import DataModules.Komod;
import DataModules.KomodRequest;

import java.io.*;
import java.util.ArrayList;

public class IO {
    static File path = new File("Data/");
    static File komodData = new File(path, "komod-data.dat");
    static ObjectOutputStream komodDataWriter;
    static FileOutputStream komodDataOutput;
    static ObjectInputStream komodDataReader;
    static FileInputStream komodDataInput;

    static File requestData = new File(path, "request-data.dat");
    static ObjectOutputStream requestDataWriter;
    static FileOutputStream requestDataOutput;
    static ObjectInputStream requestDataReader;
    static FileInputStream requestDataInput;

    static void initilize(){
        if(!komodData.exists()){
            if (!path.exists()){
                path.mkdirs();
            }
            try {
                komodData.createNewFile();
                saveKomodData(Komod.generateKomodData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(!requestData.exists()){
            if (!path.exists()){
                path.mkdirs();
            }
            try {
                requestData.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        if (komodDataOutput == null){
            try {
                komodDataOutput = new FileOutputStream(komodData);
                komodDataWriter = new ObjectOutputStream(komodDataOutput);
            } catch (IOException e) {
                System.out.println("================Exception in IO.JAVA Line 23================================");
                e.printStackTrace();
            }
        }
        if (komodDataInput == null){
            try {
                komodDataInput = new FileInputStream(komodData);
                komodDataReader = new ObjectInputStream(komodDataInput);
            } catch (IOException e) {
                System.out.println("================Exception in IO.JAVA Line 32================================");
                e.printStackTrace();
            }
        }

        if (requestDataOutput == null){
            try {
                requestDataOutput = new FileOutputStream(requestData,true);
                requestDataWriter = new ObjectOutputStream(requestDataOutput);
            } catch (IOException e) {
                System.out.println("================Exception in IO.JAVA Line 72================================");
                e.printStackTrace();
            }
        }
        if (requestDataInput == null){
            try {
                requestDataInput = new FileInputStream(requestData);
                requestDataReader = new ObjectInputStream(requestDataInput);
            } catch (IOException e) {
                System.out.println("================Exception in IO.JAVA Line 81================================");
                e.printStackTrace();
            }
        }
    }
    static void saveKomodData(ArrayList<Komod> komods){
        initilize();
        try {
            komodDataWriter.writeObject(komods);
            komodDataWriter.flush();
            komodDataWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static ArrayList<Komod> readKomodData(){
        initilize();
        try {
            Object data = komodDataReader.readObject();
            komodDataReader.close();
                return ((ArrayList<Komod>) data);

        } catch (IOException e){
            System.out.println("====");
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println("======");
            e.printStackTrace();
        }

        return null;
    }
    static void saveRequestData(KomodRequest kr){
        initilize();
        try {
            requestDataWriter.writeObject(kr);
            requestDataWriter.flush();
            requestDataWriter.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("va ajaba");
        }
    }
    static ArrayList<KomodRequest> readRequestData(){
        ArrayList<KomodRequest> ret = new ArrayList<>();
        Object read;
        while ((read = requestDataReader.readObject()) != null){
            ret.add(((KomodRequest) read));
        }
        return ret;
    }


}

