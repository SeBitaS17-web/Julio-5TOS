import java.util.*;
public class multiplo10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Numero entero :");
        x=sc.nextInt();
        if(x%10==0)
            System.out.println("Es multiplo de 10");
        else
            System.out.println("no es multiplo de 10");
    

    }
}
