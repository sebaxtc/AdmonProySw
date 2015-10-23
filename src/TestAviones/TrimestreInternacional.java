package TestAviones;

class TrimestreInternacional{
//atributos 
private String destino;
private int pasajeros;
private int distancia;
private int trimestre;


public void Capturar(){
CapturaTrimestre();
CapturaDestino();
CapturaDistancia();
CapturaPasajeros();
}

private void CapturaDestino(){
destino=Teclado.cadena("\n\tDame el Destino...\t");
}

private void CapturaPasajeros(){
pasajeros=Teclado.entero("\n\tDame el Numero de Pasajeros...\t");
}

private void CapturaDistancia(){
distancia=Teclado.entero("\n\tDame la distancia de Mexico a "+destino+" ...\t");
}

private void CapturaTrimestre(){
trimestre=Teclado.entero("\n\tDame el numero de Trimestre...\t");
}

public String getDestino(){
     return destino;
}

public int getPasajeros(){
     return pasajeros;
}

public int getDistancia(){
     return distancia;
}

public int getTrimestre(){
     return trimestre;
}

public void setDestino(String destino){
      this.destino = destino;     
}

public void setPasajeros(int pasajeros){
      this.pasajeros = pasajeros;     
}

public void setDistancia(int distancia){
      this.distancia = distancia;     
}

public void setTrimestre(int trimestre){
      this.trimestre = trimestre;     
}

}//fin