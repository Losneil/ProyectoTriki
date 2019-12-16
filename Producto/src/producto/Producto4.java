package producto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Producto4 {

    public static Scanner leer = new Scanner(System.in);
    
    public static String nom, apell;
    
    public static void main(String[] args) {
        
        String a = null;
        int b = 0;
     
        int array[] = {1000755422};
        int id;
        boolean dig = false;
        
        id = Integer.parseInt(JOptionPane.showInputDialog("digite el documento de identidad a buscar:"));
        
        int i=0;
        
        while(i<array.length && dig == false){
            if(array[i] == id){
                dig=true;
            }
            i++;
        }
        if(dig == false){
            JOptionPane.showMessageDialog(null,"el documento no se encuentra en el registro");           
        }
        else{
            JOptionPane.showMessageDialog(null,"el documento ha sido encontrado");
        }
        cadena(a);
        entero(b);
    }    
        
    public static void cadena(String a){
        
        String sexo1 = "Masculino";
        String sexo2 = "Femenino";
        
        System.out.println("digite el nombre del usuario");
        nom = leer.nextLine();
        
        System.out.println("digite el apellido");
        apell = leer.nextLine();
        
        System.out.println("su sexo es: " +sexo1);
        System.out.println(""); 
    } 
    
    public static void entero(int b){
            
        int edad, tel; 
         
        System.out.println("digite la edad");
        edad = leer.nextInt();
       
        System.out.println("digite el numero de telefono");
        tel = leer.nextInt();
    }    
}
