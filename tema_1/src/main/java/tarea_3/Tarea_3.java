package tarea_3;

import java.io.File;

public class Tarea_3 
{

	public static void main(String[] args) 
	{
		File directorioActual = new File(""); // Directorio actual
        listarDirectorio(directorioActual);
        

	}
	public static void listarDirectorio(File directorio) {
        File[] archivosYDirectorios = directorio.listFiles();

        if (archivosYDirectorios != null) {
            for (File archivoODirectorio : archivosYDirectorios) {
                if (archivoODirectorio.isDirectory()) {
                    System.out.println("Directorio: " + archivoODirectorio.getName());
                    listarDirectorio(archivoODirectorio); // Llamada recursiva para listar el contenido del subdirectorio
                } else {
                    System.out.println("Archivo: " + archivoODirectorio.getName());
                }
            }
        }
    }
}
