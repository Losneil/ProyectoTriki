package producto;

public class Producto2 { 
     
    public static int a = 55;
    public static int b = 165;
    public static int c = a + b;
    
    public static void main(String[] args) {
                        
        ascendentes(a);
        descendentes(b);
    }
    public static void ascendentes(int a){
        
        int array1[] = {55};
        int cont = 0;
        int sum1 = 0;
        
        for(int i=0; i<=10; i++){
            System.out.println(i);    
        }  
        for(int x=0; x<array1.length; x++){
            cont = array1[x];
            sum1 = cont++;
            System.out.println("la suma de valores del primer vector es: "+sum1);
        }
        for(int k=0; k<=cont; k++){
            cont = k++;
            System.out.println("el valor del vector ascendio desde el: "+cont);
        }
    }
    public static void descendentes(int b){
        
        int array2[] = {165};
        int desc = 0;
        int sum2 = 0;
        
        System.out.println("");  
        for(int j=20; j>=10; j--){
            System.out.println(j);    
        }
        for(int y=0; y<array2.length; y++){
            desc = array2[y];
            sum2 = desc--;
            System.out.println("la suma de valores del segundo vector es: "+sum2);  
            }            
        for(int n=20; n<=desc; n++){
            desc = n++;
            System.out.println("el valor del vector descendio desde el: "+desc);
        }
        System.out.println("la suma total de los valores del vector es: "+c);
    }     
}
