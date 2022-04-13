package taller.oop.logica;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class FileManager {
    private static final Gson parser = new Gson();
    
    public static ArrayList<Fecha> cargarArchivo(String filepath) 
    throws FileNotFoundException, IOException {
        ArrayList<Fecha> data = new ArrayList<Fecha>();
        
        File file = new File(filepath);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String content = reader.readLine();
        fr.close();
        Fecha[] array = parser.fromJson(content, Fecha[].class);
        if (array.length != 0) {
            for (Fecha t : array) {
                data.add(t);
            }
        } 
        return data;
    }
    
    public static void guardarArchivo(String filepath, ArrayList<?> data) 
    throws IOException {
        
        File file = new File(filepath);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        
        String line = parser.toJson(data.toArray());
        pw.println(line);
        fw.close();
        
    }
    
    public static void crearArchivo(String filepath) 
    throws IOException {
        
        File file = new File(filepath.substring(0, filepath.lastIndexOf("/")));
        if (!file.exists()){
            file.mkdir();
        }
        file = new File(filepath);
        if (!file.exists()) {
            file.createNewFile();
        }
        
    }
}
