import java.util.*;

public class division {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double dividendo,divisor;
        System.out.println("Introduzca el dividendo:");
        dividendo=sc.nextDouble();
        System.out.println("Introduzca el divisor");
        divisor=sc.nextDouble();
        if (divisor==0) 
            System.out.println("No se puede dividir por cero");
        else{
            System.out.println(dividendo + "/" + divisor + "=" +dividendo/divisor);
            System.out.printf("%.2f /%.2f = %.2f %n" , dividendo,divisor,dividendo/divisor);
        }
    }
}

