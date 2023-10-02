package tarea_6;

import java.io.File;
import java.io.FilenameFilter;

public class Tarea_6{

	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1\\dir1");
        
        // Define un objeto FilenameFilter personalizado
        FilenameFilter filtroDoc = new FilenameFilter() {
        	
        	//preguntar esta parte
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".doc");
            }
        };
        
        // Lista los archivos con la extensión ".doc" en el directorio
        String[] archivosFiltrados = directorio.list(filtroDoc);
        
        if (archivosFiltrados != null) {
            for (String archivo : archivosFiltrados) {
                System.out.println("Archivo .doc: " + archivo);
            }
        }
	}

}
