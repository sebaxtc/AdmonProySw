package TestAviones;

public class Aviones {

        String nombre;
	int capacidad;
	int servicio;
        int asientos;
	
public Aviones(String nombre, int capacidad, int servicio, int asientos){
          this.nombre = nombre;
	  this.capacidad = capacidad; 
	  this.servicio = servicio; 
	  this.asientos = asientos; 
}

public Aviones(){ 
}



public String getNombre(){
     return nombre;
}

public void setNombre(String nombre){
      this.nombre = nombre;     
}

public int getCapacidad(){
     return capacidad;
}

public void setCapacidad(int capacidad){
      this.capacidad = capacidad;     
}

public int getServicio(){
     return servicio;
}

public void setServicio(int servicio){
      this.servicio = servicio;     
}

public int getAsientos(){
	 return asientos;
}

public void setAsientos(int asientos){
      this.asientos = asientos;     
}
    
}
