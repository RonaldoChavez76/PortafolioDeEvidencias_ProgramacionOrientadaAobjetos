package mx.utng.s06;

import java.util.Scanner;



public class Ciclos {
    public static void main(String[] args) {
        //ciclo for
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que tabla deseas?");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= 10; i++) {
           // System.out.println("5x"+i+"="+5*i);
           System.out.printf("%dx%d=%d\n",n,i, n*i);
        }
        short[] valores= {1,2,3,6,9};
        for (int i = 0; i< valores.length; i++) {
            System.out.printf("%dx%d=%d\n", n, valores[i], n*valores[i]);
        }
       for (short s : valores) {
        
       
            System.out.println(s+",");}
            System.out.println("");

            //while
            short i = 0;
            while (++i<=10) {
                System.out.println(i);
             
            }
            i = 1;
            do{
                System.out.println(i);
            }while(i++<10);

        }
        
    }

