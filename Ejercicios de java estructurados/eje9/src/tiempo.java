import java.util.*;
public class tiempo {
    public static void main(String[] args) throws Exception {
        int H,M,S;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca la hora");
        H= sc.nextInt();
        System.out.println("Introduzca minutos");
        M= sc.nextInt();
        System.out.println("Introduzca segundos");
        S= sc.nextInt();

        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)
            System.out.println("Hora correcta");
        else   
            System.out.println("Hora incorrecta");
    }
}
