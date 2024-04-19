package mx.utng.s17;

import java.io.File;

public class Directorios {
    public static void main(String[] args) {
        //Directorio raiz
        File directorioinicial = new File("C:\\Users\\chave\\Documents\\Programacion_a_objetos\\Sesion_17\\sesion_17\\src\\temp");
        muestraContenidoDirectorio(directorioinicial);

    }

    private static void colocaEspacios(String directorioPadre, char simbolo){
        System.out.print("["+simbolo+"]");
        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");
            
        }
    }

    private static void muestraContenidoDirectorio(File directorio){
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());

        File [] subdirectorios = directorio.listFiles();
        for (File archivo : subdirectorios){
            if(archivo.isFile()){
            colocaEspacios(archivo.getParent(), 'A');
            System.out.println(archivo.getName());
        }else if(archivo.isDirectory()){
            muestraContenidoDirectorio(archivo);
        }

        }

    }
    
}
