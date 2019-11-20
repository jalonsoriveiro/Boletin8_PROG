/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);   
        System.out.println("dia mes");
        int v_dia = sc.nextInt();                  
    
         DiasMes obj = new DiasMes();
        
         //obj.mostrarDiaMes(2);
         
         System.out.println(obj.mostrarDiaMes(v_dia));
    }
    
}
