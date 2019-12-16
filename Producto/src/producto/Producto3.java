package producto;

import java.util.Scanner;

public class Producto3 {
    
    public Scanner teclado = new Scanner(System.in);
    public int matriz[][] = new int[3][3];
    public int cont = 0;
    
    public static void main(String[] args) {
        
      Producto3 met = new Producto3();
      met.ingreso();
      met.reemplazo();
    }
    public void ingreso() {
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingrese numeros en la posicion [" + (i) + "] , [" + (j) + "]: ");
                num = teclado.nextInt();
                matriz[i][j] = num;
            }
        }
        System.out.println();
        System.out.println("valores digitados de la matriz Original");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print(" " + matriz[i][j] + " ");
            }
        }
        System.out.println("");
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print(" " + matriz[i][j] + " ");
            }
        }
        System.out.println("");
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
        }
    }
    public void reemplazo(){
        int mod;
        System.out.println("\n");
        System.out.println("Reemplazo de valores");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                mod = matriz[i][j] % 2;
                if (mod == 0) {
                    cont++;
                    System.out.print(" " + cont + " ");
                } else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
        System.out.println("");
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mod = matriz[i][j] % 2;
                if (mod == 0) {
                    cont++;
                    System.out.print(" " + cont + " ");
                } else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
        System.out.println("");
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mod = matriz[i][j] % 2;
                if (mod == 0) {
                    cont++;
                    System.out.print(" " + cont + " ");
                } else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
    }
}