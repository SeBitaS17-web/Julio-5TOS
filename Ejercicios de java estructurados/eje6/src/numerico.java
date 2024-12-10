import java.io.*;
public class numerico {
    public static void main(String[] args) throws Exception {
        char car1;
        System.out.println("Introduzca caracter :");
        car1=(char) System.in.read(); //lee el caracter//
        if (Character.isDigit(car1))//isDigit es para especificar que es un caracter numerico//
            System.out.println("Es un numero");
        else
            System.out.println("No es numero");

    }
}
