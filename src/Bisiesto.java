import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Año: ");
        int anio = leer.nextInt();
        if (anio > 1600 && anio < 3000) {
            if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                System.out.println("S");
            } else System.out.println("N");
        } else System.out.println("El año no es correcto");
    }
}
