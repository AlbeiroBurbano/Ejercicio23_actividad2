
package com.mycompany.ejercicio23_actividad2;
import java.util.Scanner;
public class Ejercicio23_actividad2 {

    public static void main(String[] args) {
        Scanner leerporteclado = new Scanner(System.in);
      
      double A,B,C,X1,X2,X;
      
        System.out.print("Ingrese el valor A: ");
        A = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el valor B: ");
        B = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el valor C: ");
        C = leerporteclado.nextDouble();
        
        
        if((Math.pow(B,2)-4*A*C)<0){
         System.out.print("La ecuacion no tiene solucion ");
        } else if(A!=0 && (Math.pow(B,2)-4*A*C)>0){
            X1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
            X2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
            System.out.println("La primera solucion es "+X1);
            System.out.println("La segunda solucion es "+X2);
        } 
        else{
            X = -B/(2*A);
            System.out.print("La unica solucion es: "+ X);
        }
        
    }
}
    
