package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibrosTest {
    public static void main(String[] args) {
        //Queue o cola
        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("Libro 1", 3));
        libros.add(new Libro("Libro 2", 1));
        libros.add(new Libro("Libro 3", 2));

        System.out.println(libros);
        
        
        Libro libro = null;
        //Asignale el ultimo elemento borrado
        while((libro=libros.poll())!=null){
            System.out.println(libro.getTitulo());

        }


    }
    
}
