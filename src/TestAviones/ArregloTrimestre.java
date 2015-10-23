package TestAviones;

class ArregloTrimestre{
 
//atributos
private TrimestreNacional [] arreglo;
private int indice;
 
//constructores
public ArregloTrimestre(int min){
     arreglo = new TrimestreNacional[min];
	 indice = -1;
 }
 
 //metodos
 public boolean ValidaEspacio(){
    return(indice < (arreglo.length -1));
 }
 
public void Insertar(TrimestreNacional dato){
  indice++;
  arreglo[indice] = dato;
}

public boolean ValidaDatos(){
if(indice != -1){
return true;       }
else{
System.out.println("\n\tNo hay Elementos");
return false;      }
}
 
 //Busca un elemento en el arreglo
 public int BuscarDato(String desti){
      int i=0;
      String x,y;
	        for(i=0 ; i <= indice ; i++){
				y = arreglo[i].getDestino(); 
   			    if(y.equals(desti))
            return i;
                                         }
			return -1;			
}

public void ListarDestino(int pos){
        System.out.println("\n\tSe ha encontrado el destino");
        System.out.println("\n\tTrimestre: "+arreglo[pos].getTrimestre());
		System.out.println("\n\tDestino: "+arreglo[pos].getDestino());
		System.out.println("\n\tDistancia: "+arreglo[pos].getDistancia());
		System.out.println("\n\tPasajeros: "+arreglo[pos].getPasajeros());    	
}

public void Imprime(){
int i=0;
    if(indice == -1)
    System.out.println("\n\tNo hay Destinos");    	
	else{
System.out.println("\n\tTrimestre 1: Enero-Febrero-Marzo.\n\tTrimestre 2: Abril-Mayo-Junio.\n\tTrimestre 3: Julio-Agosto-Septiembre.\n\tTrimestre 4: Octubre-Noviembre-Diciembre."); 	
    for(i=0 ; i <= indice ; i++){
System.out.println("\n\tTrimestre: "+arreglo[i].getTrimestre()); 
System.out.println("\n\tDestino: "+arreglo[i].getDestino());    
System.out.println("\n\tDistancia de Mexico a "+arreglo[i].getDestino()+" :\t"+arreglo[i].getDistancia());
System.out.println("\n\tPasajeros con destino a "+arreglo[i].getDestino()+ " en el Trimestre "+arreglo[i].getTrimestre()+": "+arreglo[i].getPasajeros());  
                                }
							                                                                                    }
}

public void GeneraNombres(int min){ 
     int i=0,pasajeros,distancia,trimestre;
	 String destino;

 String Destinos[]={"Cancun","Los Cabos","Acapulco","Guadalajara","Baja California","Hermosillo","Chiapas","Mazatlan","Veracruz","Tamaulipas","Sn. Luis Potosi","Cancun","Los Cabos","Acapulco","Guadalajara","Baja California","Hermosillo","Chiapas","Mazatlan","Veracruz","Tamaulipas","Sn. Luis Potosi","Cancun","Los Cabos","Acapulco","Guadalajara","Baja California","Hermosillo","Chiapas","Mazatlan","Veracruz","Tamaulipas","Sn. Luis Potosi"};	 
		for(i=0 ; i < min ; i++){
		  TrimestreNacional Tri = new TrimestreNacional();
		  arreglo[i] = Tri;
		  destino = Destinos[i];
		  arreglo[i].setDestino(destino);
		  pasajeros = (int)(Math.random()*(1000000-500000))+500000;
		  arreglo[i].setPasajeros(pasajeros);
		  distancia = (int)(Math.random()*(2000-1000))+1000;
          arreglo[i].setDistancia(distancia);
		  trimestre = (int)(Math.random()*(4-1))+1;
          arreglo[i].setTrimestre(trimestre);
              }   
		  indice = indice + min;	  
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

}