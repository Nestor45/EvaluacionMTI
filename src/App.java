import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Numero de lapices que hay: ");
        int lapices = leer.nextInt();
        System.out.println("Numero de lapiz a buscar: ");
        int lapiz = leer.nextInt();
        int arrayLapices[];
        arrayLapices = new int[lapices];
        for (int i=0; i<arrayLapices.length; i++) {
            arrayLapices[i] = (int) (Math.random() * 9)+1;
        }
        int total_lapices = 0;
        for (int k=0; k<arrayLapices.length; k++) {
            if (lapiz == arrayLapices[k]) {
                total_lapices ++;
            }
        }
        System.out.println("total de veces encontrado: "+total_lapices);
    }
}
