package producto;

public class Producto {

    public static void main(String[] args) {
        
        Producto met = new Producto();
        met.arreglo1();
        met.arreglo2();
    }    
    public void arreglo1(){
        
        int a[] = new int [10];
        
        System.out.println("valores aleatorios del primer arreglo:");
        System.out.println("solo entre el 0 y 9"+"\n");
        
        for(int i:a){
            a[i] = (int)(Math.random()*5+5);
            System.out.println("vector --> " +a[i]);
        }     
    }
    public void arreglo2(){
        
        int b[] = new int [10];
        System.out.println();
        System.out.println("valores aleatorios del segundo arreglo:");
        System.out.println("solo entre el 10 y 19"+"\n");
        
        for(int j:b){
            b[j] = (int) (Math.random()*10+10);
            System.out.println("vector  --> " +b[j]);
        }
    }
}
