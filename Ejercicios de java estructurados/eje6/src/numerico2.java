import java.io.*;
public class numerico2{
    public static void main(String[] args) throws Exception {
        char car1;
        System.out.println("Introduzca caracter :");
        car1=(char) System.in.read(); //lee el caracter//
        if (car1>='0' && car1<='9')//isDigit es para especificar que es un caracter numerico//
            System.out.println("Es un numero");
        else
            System.out.println("No es numero");

    }
}
