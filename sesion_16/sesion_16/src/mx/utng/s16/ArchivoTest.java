package mx.utng.s16;

import java.io.File;
import java.io.IOException;

public class ArchivoTest {
    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\Users\\chave\\Documents\\Programacion_a_objetos\\sesion_16\\sesion_16\\src\\mx\\utng\\s16\\curso.txt");
        //Consultar el nombre, ruta, directorio padre, si esta oculto
        //si esxiste

        System.out.println("Nombre del archivo: "+archivo.getName());
        System.out.println("Ruta: "+archivo.getPath());
        System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
        System.out.println(archivo.getCanonicalPath());
        System.out.println("Directorio: "+archivo.getParent());
        System.out.println("Existe? "+(archivo.exists()?"Si":"No"));
        System.out.println("Es oculto: "+(archivo.isHidden()?"Si":"No"));

        //Tienes permisos de lectura, escritura y de ejecucion de archivo
        System.out.printf("%s puede escribir%n", archivo.canWrite()?"Si":"No");
        System.out.printf("%s puede leer%n", archivo.canRead()?"Si":"No");
        System.out.printf("%s puede ejecutar%n", archivo.canExecute()?"Si":"No");
        System.out.printf("%s es directorio%n", archivo.isDirectory()?"Si":"No");
        System.out.printf("%s bytes de tamaño%n", archivo.length());

    }
    
}
