/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

/**
 *
 * @author jalonsoriveiro
 */
public class DiasMes {
    
    int dia =0;
     public DiasMes(){
    
    
    
    }
    public DiasMes(int dia){
        
        this.dia = dia;
       
    }
    
    
    public String mostrarDiaMes(int dia){
    
        switch(dia) {
            case 1:
               return ("Enero tiene 31 dias");               
            case 2:
                return ("Febrero tiene 28 dias ");               
            case 3:
                return ("Marzo tiene 31 dias ");                       
            case 4:
                return ("Abril tiene 30 dias ");   
            case 5:
                return ("Mayo tiene 31 dias ");   
            case 6:
                return ("Junio tiene 30 dias ");      
            case 7:
                return ("Julio tiene 31 dias ");   
            case 8:
                return ("Agosto tiene 31 dias ");   
            case 9:
                return ("Septiembre tiene 30 dias ");   
            case 10:
                return ("Octubre tiene 31 dias ");   
            case 11:
                return ("Noviembre tiene 30 dias ");   
            case 12:
                return ("Diciembre tiene 31 dias ");   
            default:
                 return ("No es un mes");   
    
}
    
    }
    
}
