import java.io.*;

public class igualApp {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char car1, car2;

        System.out.print("Introduzca primer caracter: ");
        car1 = (char) reader.read();
        reader.read(); 

        System.out.print("Introduzca segundo caracter: ");
        car2 = (char) reader.read();
        reader.read(); 

        if (car1 == car2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
