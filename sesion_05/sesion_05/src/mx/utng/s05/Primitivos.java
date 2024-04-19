package mx.utng.s05;

public class Primitivos {
    public static void main(String[]args){
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;


        System.out.println("byte: "+valorByte);
        System.out.println("short: "+valorShort);
        System.out.println("int: "+valorInt);
        System.out.println("long: "+valorLong);
        System.out.println("float: "+valorFloat);
        System.out.println("double: "+valorDouble);

        boolean valorBoolean = true;
        char valorChar = 'B';
        System.out.println("boolean: "+valorBoolean);
        System.out.println("char: "+valorChar);

        int numeroInt1 = (int)valorFloat;
        System.out.println("Cast int: "+numeroInt1);

        float numFloat1 = numeroInt1;

        char numChar = 'M';
        int numInt2 = numChar;
        System.out.println(numInt2);

        String cadena1 ="56";
        int numInt3 = Integer.parseInt(cadena1);
        System.out.println(numInt3);

        numInt3 = numInt3+1;
        System.out.println(numInt3);

        char valorChar2 = (char)--numInt2;
        System.out.println(valorChar2);

    }

}
