import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño de la matriz: ");
        int tamMatriz = leer.nextInt();
        if (tamMatriz >= 1 && tamMatriz <= 100) {
            int matriz[][] = new int[tamMatriz][tamMatriz];
            // int [][] matriz = {{1,4,4},{6,1,9},{8,10,1}};

            //Llenamos la mariz aleatoriamente 
            for (int i=0; i<matriz.length; i++) {
                for (int j=0; j<matriz[i].length; j++) {
                    matriz[i][j] = (int) (Math.random()*9+1);
                }
            }

            //La matriz en su adiagonal de tener 1s 
            int arrayDiagonal [] = new int[tamMatriz];
            for (int i=0; i<matriz.length; i++) {
                for (int j=0; j<matriz[i].length; j++) {
                    if(i==j) {
                        arrayDiagonal[i] = matriz[i][j];
                    }
                }
            }

            //Obtenemos las suma del array
            int sum = Arrays.stream(arrayDiagonal).sum();

            if (tamMatriz == sum) {
                System.out.println("SI");
            }
        } else System.out.println("Error en el tamaño de la matriz");
        
    }
}
