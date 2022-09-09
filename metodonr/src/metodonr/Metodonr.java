/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodonr;

import java.util.Scanner;

/**
 *
 * @author garce
 */
public class Metodonr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee=new Scanner(System.in);
        System.out.println("Introduce un valor para la aproximación: ");
        double x=lee.nextDouble();
        newton n1=new newton(x);
        double r=n1.calcRaiz();
        System.out.println("Raiz= " +r);
    }
    
}
