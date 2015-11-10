package TestAviones;

public class ArregloAviones {

 //atributos
Aviones [] arreglo;
private int indice;
private int tamano=30;

//constructores
public ArregloAviones(){
     arreglo = new Aviones[tamano];
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
    int Capacidad,Servicio,Asientos;
    String Nombre;
    if(ValidaEspacio()){
    indice++;
    Aviones avion = new Aviones();
    Capacidad = Destino.CapturarCapacidad();
    avion.setCapacidad(Capacidad);
    Servicio = Destino.CapturarServicio();
    avion.setServicio(Servicio);
    Nombre = Destino.CapturarNombre();
    avion.setNombre(Nombre);
    Asientos = Capacidad * Servicio;
    avion.setAsientos(Asientos);
    arreglo[indice] = avion;
    return true;
    }
    else
    return false;
 }
 
//modifica numero de aviones en servicio
public void ModificarNumero(int pos,int serv){
int i=0,c=0;
String dato;
        
		arreglo[pos].setServicio(serv);
		System.out.println("\n\tLos aviones se modificaron");  						 								
}

//Busca un elemento en el arreglo
public int BuscarDato(String avi){
      int i;
      String x,y;
	        for(i=0 ; i <= indice ; i++){
				y = arreglo[i].getNombre(); 
   			    if(y.equals(avi))
            return i;
                                         }
			return -1;			
 }

//Borra Un elemento del arreglo
public void Borrar(int pos){
    Aviones aux;
	
	aux = arreglo[pos];
    arreglo[pos] = arreglo[indice];
    indice--;
}

public void Imprime(){
int i,a;
    if(indice == -1)
        Destino.jtxa1.setText("NO HAY DATOS");
	else{
             Destino.jtxa1.setText("");
             for(i=0 ; i <= indice ; i++){
                a = Destino.jtxa1.getCaretPosition();
                Destino.jtxa1.insert("\n  Nombre del Avion: "+ arreglo[i].getNombre()+ "\n  Capacidad: "+ arreglo[i].getCapacidad() + "\n  Aviones Disponibles: "+ arreglo[i].getServicio() + "\n  Asientos totales del " +arreglo[i].getAsientos() + "\n", a);                             
					 }
            }
}



public void GeneraNombres(){ 
         int i,capacidad,servicio,asientos;
	 String nombre;
	 
	 String Nombre[]={"Boeing737-700","Boeing737-800","Boeing767-200ER","Boeing767-300ER","Boeing777-200ER","Boeing787-8","Embraer145","Embraer170","Embraer175","Embraer190","Embraer10","Embraer15","Embraer19"};
         int Capacidad[]={124,160,174,209,290,243,50,76,86,99,60,45,67};
	 
		for(i=0 ; i < 13 ; i++){
		  Aviones avion = new Aviones();
		  arreglo[i] = avion;
		  nombre = Nombre[i];
		  arreglo[i].setNombre(nombre);
		  capacidad = Capacidad[i];
		  arreglo[i].setCapacidad(capacidad);
		  servicio = (int)(Math.random()*(20-10))+10;
                  arreglo[i].setServicio(servicio);
		  asientos = capacidad * servicio;
                  arreglo[i].setAsientos(asientos);		  
		  }   
		  indice = 12;
} 






public int TotalAsientos(){
int asientos=0,i;

   for(i=0 ; i <= indice ; i++){
    asientos = asientos + arreglo[i].getAsientos();
               }
return asientos;
}       
    //prueba del comentario
}

