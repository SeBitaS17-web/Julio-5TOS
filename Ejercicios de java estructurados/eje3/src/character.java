import java.io.*;
import java.util.*;

public class character {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        char car;
        System.out.println("Introduzca un caracter");
        car =(char) System.in.read();

        if (Character.isUpperCase(car))
            System.out.println("Es una letra mayuscula");
        else
            System.out.println("No es una letra mayuscula");
    }
}
