import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Minutos: ");
        int minutos = leer.nextInt();
        if (minutos >= 1 && minutos <= 100) {
            System.out.println("La cantidad de segundo es: "+ minutos*60);
        } else
            System.out.println("minutos no aceptados");
    }
}
