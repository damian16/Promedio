
package ec.edu.ister.Aplicacion;

import java.util.Scanner;

public class Promedio {
    
    public static void main(String[] args) {
        

        Scanner ing=new Scanner(System.in);
        Scanner gh=new Scanner(System.in);
        
        int n;
        System.out.println("Ingrese el numero de valores: ");
        n=ing.nextInt();
    
     float[]numero =new float[n];
     for(int i=0; i<n;i++){
         System.out.println("Ingrese la nota: ");
         numero[i]=ing.nextInt();
     }
     
        float promedio=0;
        float suma=0;
        for(int i=0; i<n;i++){
        suma= suma+numero[i];
        promedio=suma/n;
        }
        System.out.println("El promedio es:"+" "+promedio);
        
  
    }    
}
