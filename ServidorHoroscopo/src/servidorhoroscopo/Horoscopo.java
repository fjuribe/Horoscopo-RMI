/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorhoroscopo;
import irhoroscopo.irHoroscopo;
import java.rmi.RemoteException;

/**
 *
 * @author javier
 */
public class Horoscopo implements irHoroscopo{
    public Horoscopo(){
        super();
    }

    @Override
    public String CalculadoraHoroscopo(int d, int m) throws RemoteException {
       
    
      String cadena = null;
              String cadena1;

			
	  if(d>=20 && m==1){
	       	//Enero 20 – Febrero 18-> acuario
	       cadena="Su signo es acuario";
    	           }
		else if(d<=18 && m==2){
	        //Enero 20 – Febrero 18-> acuario
	        cadena="Su signo es acuario";
		}
		
		
		
		
		else if(d>=19 && m==2){
	     	//Febrero 19 – Marzo 20
	        cadena="Su signo es piscis";
    	}
	    
	    else if(d<=20 && m==3){
			//Febrero 19 – Marzo 20
	              cadena="Su signo es piscis";
		}
		
		
		
		else if(d>=21 && m==3){
		      //Marzo 21 –Abril 19
	            cadena="Su signo es aries";
      	}
	    else if(d<=19 && m==4){
		    	//Marzo 21 –Abril 19
	            cadena="Su signo es aries";
		}
	
	
	   		
		 else if(d>=20 && m==4){
	          //Abril 20 – Mayo 20-> tauro
	                  cadena="Su signo es tauro";
	    }
	    else if(d<=20 && m==5){
		        //Abril 20 – Mayo 20-> tauro
	                       cadena="Su signo es tauro";
		}
		
		
		else if(d>=21 && m==5){
	        		//Mayo 21 – Junio 20 -> geminis
	                         cadena="Su signo es geminis";
     	}
	    else if(d<=20 && m==6){
		        	//Mayo 21 – Junio 20 -> geminis
	                           cadena="Su signo es geminis";
		}


       	
		else if(d>=21 && m==6){
		        	//Junio 21 – Julio 22-> cancer
	                              cadena="Su signo es cancer";   
    	}	
    	else if(d<=22 && m==7){
		         	//Junio 21 – Julio 22-> cancer
	                        cadena="Su signo es cancer";  
		}
		
		
	     else if(d>=23 && m==7){
		            //Julio 23–Agosto 22-> leo
	                cadena="Su signo es leo"; 
    	}
	    else if(d<=22 && m==8){
	           		  //Julio 23–Agosto 22-> leo
	                    cadena="Su signo es leo"; 
		}
	
	
	  
		else if(d>=23 && m==8){
		       //Agosto 23 – Septiembre 22-> virgo
	                     cadena="Su signo es virgo";
    	}
    	else if(d<=22 && m==9){
			//Agosto 23 – Septiembre 22-> virgo
	                     cadena="Su signo es virgo";
		}
		
		
		
		
		else if(d>=23 && m==9){
		    //Septiembre 23 – Octubre 22-> libra
	               cadena="Su signo es libra";
	    }
	    else if(d<=22 && m==10){
		   //Septiembre 23 – Octubre 22-> libra
	                  cadena="Su signo es libra";
		}
	
	
		else if(d>=23 && m==10){
		    //Octubre 23 – Noviembre 21-> escorpion
	                   cadena="Su signo es escorpion";
	    }
	     else if(d<=21 && m==11){
		  //Octubre 23 – Noviembre 21-> escorpion
	               cadena="Su signo es escorpion";
		}
		
		
		else if(d>=22 && m==11){
		   	//Noviembre 22 - Diciembre 21-> sagitario
	                   cadena="Su signo es sagitario";
     	}
     	else if(d<=22 && m==12){
			//Noviembre 22 - Diciembre 21-> sagitario
	                      cadena="Su signo es sagitario";
		}
	   
	   
		else if(d>=20 && m==1){
		  //Enero 20 – Febrero 18-> acuario
	              cadena="Su signo es acuario";
	    }
	    else if(d<=18 && m==2){
			//Enero 20 – Febrero 18-> acuario
	                   cadena="Su signo es acuario";
		}
	
	
		else if(d>=22 && m==12){
		    //Diciembre 22 – Enero 19-> capricornio
	                    cadena="Su signo es capricornio";
	    }
	    else if(d<=19 && m==1){
			 //Diciembre 22 – Enero 19-> capricornio
	                    cadena="Su signo es capricornio";
		}
	
         cadena1=cadena;
	  return cadena;
        
    }

    @Override
    public String HoroscopoSemana(int signo) throws RemoteException {
       /*
        
        */
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String CompatibilidadHoroscopo(int d, int m, int a, int genero) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String HoroscopoChino(int signo1, int signo2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
