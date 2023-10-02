package tarea_7;

import java.io.File;
import java.util.Scanner;

public class tarea_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Ruta del directorio raíz que deseas eliminar
        String directorioRaiz = "C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1";
        
        // Llama al método para borrar la estructura con confirmación
        borrarEstructuraConConfirmacion(new File(directorioRaiz), scanner);
        
        // Cierra el scanner
        scanner.close();
    }
    
    public static void borrarEstructuraConConfirmacion(File fileOrDirectory, Scanner scanner) {
        if (fileOrDirectory.isDirectory()) {
            File[] archivosYDirectorios = fileOrDirectory.listFiles();
            
            if (archivosYDirectorios != null) {
                for (File archivoODirectorio : archivosYDirectorios) {
                    System.out.print("¿Desea eliminar '" + archivoODirectorio.getName() + "'? (S/N): ");
                    String respuesta = scanner.nextLine().toLowerCase();
                    
                    if (respuesta.equals("s")) {
                        borrarEstructuraConConfirmacion(archivoODirectorio, scanner);
                    }
                }
            }
        }
        
        if (!fileOrDirectory.delete()) {
            System.out.println("No se pudo eliminar '" + fileOrDirectory.getName() + "'");
        } else {
            System.out.println("'" + fileOrDirectory.getName() + "' eliminado correctamente.");
        }
	}

}
