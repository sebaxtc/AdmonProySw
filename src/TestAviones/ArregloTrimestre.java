package TestAviones;

class ArregloTrimestre{
 
//atributos
private TrimestreNacional [] arreglo;
private int indice;
private int tamano=30;
 
//constructores
public ArregloTrimestre(){
         arreglo = new TrimestreNacional[tamano];
	 GeneraNombres();
 }
 
 //metodos
 public boolean ValidaEspacio(){
    return(indice < (arreglo.length -1));
 }
 
public boolean Insertar(){
    int NumTrim,Distancia,Pasajeros;
    String Destinos;
    if(ValidaEspacio()){
    indice++;
    TrimestreNacional trim = new TrimestreNacional();
    NumTrim = Destino.CapturaNumTrimestre();
    trim.setTrimestre(NumTrim);
    Distancia = Destino.CapturaDistancia();
    trim.setDistancia(Distancia);
    Pasajeros = Destino.CapturaPasajeros();
    trim.setPasajeros(Pasajeros);
    Destinos = Destino.CapturaDestino();
    trim.setDestino(Destinos);
    arreglo[indice] = trim;
    return true;
    }
    else
    return false;
}

public boolean ValidaDatos(){
if(indice != -1){
return true;       }
else{

Destino.jtxa4.setText("\n NO HAY DATOS");
return false;      }
}



public void Imprime(){
int i,a,b;
    if(indice == -1)
        Destino.jtxa2.setText("\n NO HAY DATOS");
	else{
             Destino.jtxa2.setText("");
             a = Destino.jtxa2.getCaretPosition();
             Destino.jtxa2.insert("\nTrimestre 1: Enero-Febrero-Marzo.\nTrimestre 2: Abril-Mayo-Junio.\nTrimestre 3: Julio-Agosto-Septiembre.\nTrimestre 4: Octubre-Noviembre-Diciembre.\n",a); 
             for(i=0 ; i <= indice ; i++){
                b = Destino.jtxa2.getCaretPosition();
                Destino.jtxa2.insert("\n\nTrimestre: " +arreglo[i].getTrimestre()+ "\nDestino: "+arreglo[i].getDestino()+ "\nDistancia de Mexico a " +arreglo[i].getDestino()+ ":  " +arreglo[i].getDistancia()+ "\nPasajeros con destino a " +arreglo[i].getDestino()+ " en el Trimestre " +arreglo[i].getTrimestre()+": "+arreglo[i].getPasajeros(), b);                             
					 }
            }
}




public int PrimerTrimestre(){
    int x=1,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }
	return z;							
} 

public int SegundoTrimestre(){
    int x=2,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }
    return z; 
}

public int TercerTrimestre(){
    int x=3,z=0,y,i;
	
	  for(i=0 ; i<=indice ; i++){
	      y = arreglo[i].getTrimestre(); 
   		  if(y == x)
	      z = z + arreglo[i].getPasajeros();
		                        }						   						   
    return z;
}

public int CuartoTrimestre(){
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
         String Nom_Dest[]={"Cancun","Los Cabos","Acapulco","Guadalajara","Baja California","Hermosillo","Chiapas","Mazatlan","Veracruz","Tamaulipas","Sn. Luis Potosi","Colima","Chetumal","Puerto Vallarta","Sierra Gorda","Huatulco","Leon","Nuevo Leon"};	 
         
		for(i=0 ; i < 18 ; i++){
		  TrimestreNacional Tri = new TrimestreNacional();
		  arreglo[i] = Tri;
		  arreglo[i].setDestino(Nom_Dest[i]);
		  pasajeros = (int)(Math.random()*(10-50))+50;
		  arreglo[i].setPasajeros(pasajeros);
		  distancia = (int)(Math.random()*(20-10))+10;
                  arreglo[i].setDistancia(distancia);
		  trimestre = (int)(Math.random()*(4-1))+1;
                  arreglo[i].setTrimestre(trimestre);
              }   
		  indice = 17;	  
}


















}