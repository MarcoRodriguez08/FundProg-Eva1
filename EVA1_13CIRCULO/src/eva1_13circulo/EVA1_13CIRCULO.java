/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double radio, per, vol, are;
        Scanner captu = new Scanner(System.in);
        //Solicitar datos al usario
        System.out.println("CAPURE EL RADIO DEL CIRCULO:");
        radio = captu.nextDouble();
        
        
               
        //HACE EL CALCULO
        per = 2*3.14*radio;
        are = 3.14*radio*radio;
        vol = (4.0/3.0)*3.14*radio*radio*radio;
        //recuerda que si divides entre doubles tiene que ser otro double para que te de el resultado en decimal, es decir ponle el ".0"
        
        //MOSTRAR RESULTADOS
        System.out.println("El perimetro es"+per);
        
        System.out.println("El Área es"+ are);
        
       System.out.println("El Volumen es"+ vol);
    }
    
    }
    

