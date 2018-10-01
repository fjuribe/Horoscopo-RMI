/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorhoroscopo;
import irhoroscopo.irHoroscopo;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author javier
 */
public class ServidorHoroscopo {

    public static int PORT=1099;
    
    public ServidorHoroscopo(){
       try{
            String nombre="Horoscopo";
            
            irHoroscopo calc=new Horoscopo();
            irHoroscopo stub=(irHoroscopo)UnicastRemoteObject.exportObject(calc,0);
            
            Registry registry=LocateRegistry.createRegistry(PORT);
            registry.rebind(nombre,stub);
            System.out.println("servidor corriente....");
        }catch(Exception e){
            System.err.println("error en el servidor");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
