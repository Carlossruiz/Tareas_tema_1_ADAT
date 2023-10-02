package tarea_4_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class tarea_4_5
{

	public static void main(String[] args) throws IOException 
	{
		
		File dir1 = new File("C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1\\dir1");
		dir1.mkdir();
		File f11 = new File("C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1\\dir1", "f11.doc");
		f11.createNewFile();
		File dir2 = new File("C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1\\dir2");
		dir2.mkdir();
		File f21 = new File("C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1\\dir2", "f21.txt");
		f21.createNewFile();
		
		//Le cambio el nombre al archivo
		File f12 = new File("f12.doc");
		f11.renameTo(f12);
		
		//Creo una cadena con la ruta absoluta del origen y destino usando el metodo getAbsolutePath y la añado a una variable path
		String directorioOrigen = f21.getAbsolutePath();
		String directorioDestino = dir1.getAbsolutePath();
		Path origen = f21.toPath();
		Path destino = Path.of("C:\\Users\\Carlos\\Desktop\\ADAT\\Tema1\\dir1", "f21.txt");
		Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
		dir2.delete();
	}

}
