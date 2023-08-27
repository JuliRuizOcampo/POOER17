package com.mycompany.pooer17;
import java.util.Scanner;
/**
 *
 * @author JuliRuizOcampo
 */
public class POOER17 {

    public static void main(String[] args) {
        
        int n, num = 1, suma = 0;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero natural hasta el cual desea realizar la suma: ");
        n = lector.nextInt();
        
        //Procedimiento de la suma
        while (num <=  n) {
            suma += num; //equivalente a suma = suma + num
            num += 1; //equivalente a num = num + 1
        }
        
        System.out.println("La suma es: " + suma); 
    }
}
