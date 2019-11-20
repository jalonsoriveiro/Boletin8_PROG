/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class CalcularPorc {
    
    float precioUnitario=0;
    int cantidadProducto = 0;
    int porcetanje = 0;
    Scanner sc = new Scanner(System.in); 
    public CalcularPorc(){
    
    
    
    }
    public CalcularPorc(float precio,int cantidad){
        
        cantidadProducto = cantidad;
        precioUnitario = precio;
    }
    public void PedirDatos(){
       System.out.println("Precio unitario ");
         precioUnitario = sc.nextFloat();                  
        System.out.println("Cantidades ");
         cantidadProducto = sc.nextInt();             
    
    }
    public String Calcular(){
                  
    PedirDatos();

    if(cantidadProducto<100){
        
        return "Sen desconto";
        }
    else if (cantidadProducto==100 || cantidadProducto<200){            
        //return ("Precio total sin desconto"+(unidades * p_precio));
       if (precioUnitario>4000){
         //5%
          return ("Precio unidad,"+precioUnitario+" total unidades"+cantidadProducto+",Precio total sin desconto "+(cantidadProducto * precioUnitario)
                  +"Precio con desconto "+(cantidadProducto*precioUnitario)*5/100);
                   }
       else{
           return ("Precio total sin desconto "+(cantidadProducto * precioUnitario)
                  +"Precio con desconto "+(cantidadProducto*precioUnitario)*2/100);
       
                }           
    }
    else if(cantidadProducto>=200){
       if (precioUnitario>4000){
         //10%
          return ("Precio total sin desconto "+(cantidadProducto * precioUnitario)
                  +"Precio con desconto "+(cantidadProducto*precioUnitario)*10/100);
                   }
       else{
           return ("Precio total sin desconto "+(cantidadProducto * precioUnitario)
                  +"Precio con desconto "+(cantidadProducto*precioUnitario)*8/100);       
                }
    
    }
      else{
        return ("Precio total sin desconto "+(cantidadProducto * precioUnitario));
            }

}
}
    
