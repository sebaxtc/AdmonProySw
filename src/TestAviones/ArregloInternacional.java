package TestAviones;

class ArregloInternacional{
 
//atributos
private TrimestreInternacional [] arreglo;
private int indice;
private int tamano=30;

//constructores
public ArregloInternacional(){
     arreglo = new TrimestreInternacional[tamano];
     GeneraNombres();
 }
 
 //metodos
public boolean ValidaEspacio(){
    return(indice < (arreglo.length -1));
}

public boolean ValidaDatos(){
if(indice != -1){
return true;       }
else{
System.out.println("\n\tNo hay Elementos");
return false;      }
}
 
public boolean Insertar(){
    int NumTrim,Distancia,Pasajeros;
    String Destinos;
    if(ValidaEspacio()){
    indice++;
    TrimestreInternacional trim = new TrimestreInternacional();
    NumTrim = Destino.CapturaNumTrimestreInter();
    trim.setTrimestre(NumTrim);
    Distancia = Destino.CapturaDistanciaInter();
    trim.setDistancia(Distancia);
    Pasajeros = Destino.CapturaPasajerosInter();
    trim.setPasajeros(Pasajeros);
    Destinos = Destino.CapturaDestinoInter();
    trim.setDestino(Destinos);
    arreglo[indice] = trim;
    return true;
    }
    else
    return false;
 }


public void Imprime(){
int i,a,b;
    if(indice == -1)
        Destino.jtxa3.setText("NO HAY DATOS");
	else{
             Destino.jtxa3.setText("");
             a = Destino.jtxa3.getCaretPosition();
             Destino.jtxa3.insert("\n Trimestre 1: Enero-Febrero-Marzo.\n Trimestre 2: Abril-Mayo-Junio.\n Trimestre 3: Julio-Agosto-Septiembre.\n Trimestre 4: Octubre-Noviembre-Diciembre.",a); 
             for(i=0 ; i <= indice ; i++){
                b = Destino.jtxa3.getCaretPosition();
                Destino.jtxa3.insert("\n Trimestre: " +arreglo[i].getTrimestre()+ "\n Destino: "+arreglo[i].getDestino()+ "\n Distancia de Mexico a " +arreglo[i].getDestino()+ ":  " +arreglo[i].getDistancia()+ "\n Pasajeros con destino a " +arreglo[i].getDestino()+ " en el Trimestre " +arreglo[i].getTrimestre()+": "+arreglo[i].getPasajeros(), b);                             
					 }
            }
}


public int Primer(){
    int x=1,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }
	return z;							
} 

public int Segundo(){
    int x=2,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }
    return z; 
}

public int Tercer(){
    int x=3,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }						   						   
    return z;
}

public int Cuarto(){
    int x=4,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }
    return z;								
}

public int PasajerosAno(){
int i,pasajero=0;

        for(i=0 ; i<=indice ; i++){
	      pasajero = pasajero + arreglo[i].getPasajeros(); 
		                        }
    return pasajero;							
}

public int DistanciaAno(){
int i,distancia=0;

        for(i=0 ; i<=indice ; i++){
	      distancia = distancia + arreglo[i].getDistancia(); 
		                        }
    return distancia;							
}


public int PasajerosTrimestreUno(){
    int i,Trimestre=0,x=1,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getPasajeros();
		                        }
    return Trimestre; 
}

public int PasajerosTrimestreDos(){
    int i,Trimestre=0,x=2,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getPasajeros();
		                        }
    return Trimestre; 
}

public int PasajerosTrimestreTres(){
    int i,Trimestre=0,x=3,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getPasajeros();
		                        }
    return Trimestre; 
}

public int PasajerosTrimestreCuatro(){
    int i,Trimestre=0,x=4,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getPasajeros();
		                        }
    return Trimestre; 
}

public int DistanciaTrimestreUno(){
    int i,Trimestre=0,x=1,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getDistancia();
		                        }
    return Trimestre; 
}

public int DistanciaTrimestreDos(){
    int i,Trimestre=0,x=2,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getDistancia();
		                        }
    return Trimestre; 
}

public int DistanciaTrimestreTres(){
    int i,Trimestre=0,x=3,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getDistancia();
		                        }
    return Trimestre; 
}

public int DistanciaTrimestreCuatro(){
    int i,Trimestre=0,x=4,y;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      Trimestre = Trimestre + arreglo[i].getDistancia();
		                        }
    return Trimestre; 
} 


public void GeneraNombres(){ 
         int i,pasajeros,distancia,trimestre;
	 String destino;
         String Destinos[]={"Toio","Chicago","Berlin","Holanda","Beijing","Moscu","Shangai","Sydney","Montreal","Madrid","Pittsburgh","Osaka","Toronto","Monaco","Singapur","Camboya","Sao Paolo","Peru","Caracas","Irlanda","Orlando","Miami","Hawai"};	 
         
		for(i=0 ; i < 23 ; i++){
		  TrimestreInternacional Tri = new TrimestreInternacional();
		  arreglo[i] = Tri;
		  destino = Destinos[i];
		  arreglo[i].setDestino(destino);
		  pasajeros = (int)(Math.random()*(700000-300000))+300000;
		  arreglo[i].setPasajeros(pasajeros);
		  distancia = (int)(Math.random()*(20000-10000))+10000;
          arreglo[i].setDistancia(distancia);
		  trimestre = (int)(Math.random()*(4-1))+1;
          arreglo[i].setTrimestre(trimestre);
                }   
		  indice = 22;	  
}

						   						   
}