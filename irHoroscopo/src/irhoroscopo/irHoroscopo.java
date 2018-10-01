/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irhoroscopo;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author javier
 */
public interface irHoroscopo extends Remote{
      String CalculadoraHoroscopo(int d,int m) throws RemoteException;
      String HoroscopoSemana(int signo)throws RemoteException;
      String CompatibilidadHoroscopo(int d,int m,int a,int genero) throws RemoteException;
      String HoroscopoChino(int signo1,int signo2) throws RemoteException;
      
}
