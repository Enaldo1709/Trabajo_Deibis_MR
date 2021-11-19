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
    
    public static ArrayList<Empleado> cargarArchivo(String filepath) 
    throws FileNotFoundException, IOException {
        ArrayList<Empleado> data = new ArrayList<Empleado>();
        
        File file = new File(filepath);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String content = reader.readLine();
        fr.close();
        try {
            Empleado[] empleados = parser.fromJson(content, Empleado[].class);
            if (empleados.length != 0) {
                for (Empleado t : empleados) {
                    data.add(t);
                }
            } 
        } catch(Exception e){
            
        }
        
        return data;
    }
    
    public static void guardarArchivo(String filepath, ArrayList<Empleado> data) 
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
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("[]");
        fw.close();
        
    }
}
