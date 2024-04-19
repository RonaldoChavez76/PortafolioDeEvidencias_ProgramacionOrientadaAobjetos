package mx.utng.s17.Reto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * @author Santiago Ronaldo Chavez Piñon
 * @Category GDS0622
 * @Since 16-02-2024
 */

public class Poema {
    public static void main(String[] args) throws IOException{
         File poema = new File("C:\\Users\\chave\\Documents\\Programacion_a_objetos\\Sesion_17\\sesion_17\\src\\mx\\utng\\s17\\Reto\\poema.txt");
         FileWriter poemaFileWriter = new FileWriter(poema);
       

        BufferedWriter bw = new BufferedWriter(poemaFileWriter);
        bw.write("Venus");
        bw.newLine();
        bw.write("Será porque te amo, será porque es así");
        bw.newLine();
        bw.write("Sé que no es real y nadie es propiedad");
        bw.newLine();
        bw.write("Pero te siento mía");
        bw.newLine();
        bw.write("Solo porque te quiero, solo porque es así");
        bw.newLine();
        bw.write("Sé que no es real y no me perteneces");
        bw.newLine();
        bw.write("Pero te siento mía");
        bw.newLine();
        bw.write("Gracias por estar, gracias por aguantar");
        bw.newLine();
        bw.write("Prometo estar a tu lado hasta a el fin");
        bw.newLine();
        bw.write("Te voy a cuidar como tu lo haces por mi");
        bw.newLine();

        
        bw.close();


        BufferedReader br = new BufferedReader(new FileReader(poema));

        ///Leer todo el archivo
        String linea = null;
        while((linea =br.readLine())!=null){
            System.out.println(linea);
        }
    }
    }
    

