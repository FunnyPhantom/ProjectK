package IOModules;

import DataModules.Komod;

import java.io.*;
import java.util.ArrayList;

public class IO {
    static File path = new File("Data/");
    static File komodData = new File(path, "komod-data.dat");
    static File requestData = new File(path, "request-data.dat");
    static ObjectOutputStream komodDataWriter;
    static FileOutputStream komodDataOutput;
    static ObjectInputStream komodDataReader;
    static FileInputStream komodDataInput;

    static void initilize(){
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
}
