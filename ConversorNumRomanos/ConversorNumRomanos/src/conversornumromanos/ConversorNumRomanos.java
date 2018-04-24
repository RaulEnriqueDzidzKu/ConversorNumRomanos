/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversornumromanos;

import java.util.Scanner;

/**
 *
 * @author raul_
 */
public class ConversorNumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Scanner numentero=new Scanner(System.in);
    //Valores 
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String Mil[]={"", "M", "MM","MMM"};
      //Rango 
      System.out.println("Ingresa un numero entre 1 y 1000: ");
      int num = numentero.nextInt();
      //Modulos
      int u=num%10;
      int d=(num/10)%10;
      int c=(num/100)%10;
      int m=num/1000;
      
      //Verificar rango
      if(num>=1 && num<=1000){         
          System.out.println(Mil[m]+Centena[c]+Decena[d]+Unidad[u]);
      }else{
          System.out.println("Rango de 1 a 1000 permitidos");                             
      }  
        
// De romano a numero  
//Lectura de datos
Scanner numromano = new Scanner(System.in);

        System.out.print("Ingrese número romano: \n");

        String texto = numromano.nextLine();

   //Array en romanos y valores respectivos
       int valores[] = {0,1,5,10,50,100,500,1000};            
       char romanos[]= {' ','I','V','X','L','C','D','M'}; 

       

        int anterior = 0;

        int suma = 0;

        char letra = ' ';
//Recorriendo el texto ingresado
        for(int i = 0; i < texto.length(); i++){

                letra = texto.charAt(i);
                //Recorriendo array de los núeros romanos
                for(int j = 0; j < romanos.length; j++){
                    
                    if(letra == romanos[j]){

                                suma = suma + valores [j]; 

                            if( anterior < valores[j]){ 

                                    suma = suma - anterior*2 ; 

                                    anterior = valores[j];

                            }else {

                        anterior = valores[j];

 }

                    }              

                }

        }

        System.out.print(suma+"\n" ); 
    }
    
}
