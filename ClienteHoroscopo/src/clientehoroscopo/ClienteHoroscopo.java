/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientehoroscopo;
import irhoroscopo.irHoroscopo;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
/**
 *
 * @author javier
 */
public class ClienteHoroscopo {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.NotBoundException
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        // TODO code application logic here
         try{
            String nombre="Horoscopo";
            Registry registry=LocateRegistry.getRegistry("192.168.0.106");
            irHoroscopo calc=(irHoroscopo)registry.lookup(nombre);
            

            
            int respt,d,m,a;
            

               System.out.println("|=============================|\n");
               System.out.println("|====Servicios de Horoscopo===|\n");
               System.out.println("|=============================|\n");
               System.out.println("\n\n\n");
               System.out.println("1.- Calculadora de signo del zodiaco\n");
               System.out.println("2.- Horóscopo de la semana\n");
               System.out.println("3.- Compatibilidad entre Signos\n");
               System.out.println("4.- Conoce tu Horóscopo chino\n");
               //printf("5.- Salir\n");
               do{
                   System.out.println("Respuesta(solo numeros del 1 al 4):\n");
            
                 Scanner entrada=new Scanner(System.in);//declaracion del objeto escaner
                 respt=entrada.nextInt();
                
                  
                 }while(respt!=1 && respt!=2 && respt!=3 && respt!=4);
            
        //limpia la pantalla en linu
        //System.out.print("\033[H\033[2J");
       // System.out.flush();
    
        Scanner entrada1=new Scanner(System.in);//declaracion del objeto escaner
        
    switch(respt){
        case 1:              
                  
            System.out.println("|===========================================|\n");
            System.out.println("|=== Calculadora de de signo del zodiaco====|\n");
            System.out.println("|===========================================|\n");
            System.out.println("\n\n");
            //validando entradas de fechas
            do{
            System.out.println("\n   Introduzca dia (1-31) : ");
            d=entrada1.nextInt();
            
            }while(d < 1 || d > 31 );

            do{
            System.out.println("\n   Introduzca mes (1-12):");
            m=entrada1.nextInt();
            }while(m < 1 || m > 12 );


            do{
            System.out.println("\n   Introduzca anio (1930-2018):");
            a=entrada1.nextInt();
            }while(a < 1930 || a > 2018 );
            
            System.out.println(calc.CalculadoraHoroscopo(d,m));
        break;
                
        case 2:
        break;
                
        case 3:
        break;
                
        default:
        break;
                
         }       
            
            
            
            //System.out.println(calc.saludos("braulio"));
            //System.out.println("potencia:"+calc.potencia(2,4));
        }catch(RemoteException | NotBoundException e){
            System.err.println("error en el cliente");
            
        }
    }
    
}
