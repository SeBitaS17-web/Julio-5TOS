import java.io.*;

public class igualApp {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca primer caracter:");
        char car1 = reader.readLine().charAt(0);  
        
        System.out.println("Introduzca segundo caracter:");
        char car2 = reader.readLine().charAt(0); 

        if(car1 == car2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
