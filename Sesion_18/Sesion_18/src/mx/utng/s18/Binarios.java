package mx.utng.s18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //Crear un manejador de archivos binarios
        //Archivo entrada
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/mx/utng/s18/Cristiano-Ronaldo.png"));
        //Archivo salida
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/mx/utng/s18/copia_Cr7.png"));

        //Comenzar la copia
        byte[] buffer = new byte[1024];

        int bytesLeidos = 0;

        while((bytesLeidos = bis.read(buffer))>0){
            bos.write(buffer, 0, bytesLeidos);

        }
    }
    
}
