package TestAviones;
import java.text.DecimalFormat; 


public class TestAviones {    

    ArregloAviones miarreglo = new ArregloAviones(20);
    ArregloTrimestre tuarreglo = new ArregloTrimestre(20);
    ArregloInternacional elarreglo = new ArregloInternacional(20);
    int dato,opcion,pos,n,x=0,serv,pasajerosN,pasajerosI,tamano,tamano1;
    DecimalFormat df = new DecimalFormat("0.00000"); 
    String avi,desti;
    double Factor1,Factor2,Factor3,Factor4,RPK1=0,RPK2=0,RPK3=0,RPK4=0,RPK5=0,RPK6=0,RPK7=0,RPK8=0,ASK1=0,ASK2=0,ASK3=0,ASK4=0,ASK5=0,ASK6=0,ASK7=0,ASK8=0,x1,x2,x3,x4,y1,y2,y3,y4;
 
    
    public static void main(String[] args) {
   
    //int max = Destino.CapturarMax();
    //int min = Destino.CapturarMin();
    Destino window = new Destino();
    window.setTitle("Plan-E-AirLine");
    window.setVisible(true);
    window.setSize(737, 614);
    //ArregloAviones miarreglo = new ArregloAviones(Destino.CapturarMax());
    //Declaracion de variables locales

 }
    
    public boolean Inserta(){
    boolean valor;
        valor = miarreglo.Insertar();
        return valor;
    }
    
    public void Imprime(){
    miarreglo.Imprime();
    }

    public int Borrar(){
    int b;
        b = miarreglo.BuscarDato(Destino.tx7.getText());
        if(b == -1)
        return 0;
        else{
        miarreglo.Borrar(b);
        return 1;
            }
    }  
    
    
    public int BuscaDato(){
    int h;
    boolean valor;
        h = miarreglo.BuscarDato(Destino.tx8.getText());
        if(h != -1){
           valor = Destino.isNumeric(Destino.tx9.getText());
           if(valor == true){
           miarreglo.ModificarNumero(h, Integer.parseInt(Destino.tx9.getText()));
           return 1;
                            }
           else
           return 0;
                   }
        else
            return 0;
    }
    
   //PARA TRIMESTRE NACIONAL
        public boolean Insertar(){
        boolean valor;
        valor = tuarreglo.Insertar();
        return valor;
    }
        
        public void ImprimeNacional(){
          tuarreglo.Imprime();
    }        
    
    //PARA TRIMESTRE INTERNACIONAL
        public boolean InsertaInter(){
        boolean valor;
        valor = elarreglo.Insertar();
        return valor;
    }
        
        public void ImprimeInternacional(){
          elarreglo.Imprime();
    }  
    
    //PARA ESTADISTICAS NACIONALES
        public void MostrarEstadisticasNacionales(){
        int a;
            
        if(tuarreglo.ValidaDatos()){    
	    x1 = tuarreglo.PrimerTrimestre();
	    x2 = tuarreglo.SegundoTrimestre();
	    x3 = tuarreglo.TercerTrimestre();
	    x4 = tuarreglo.CuartoTrimestre();
	    Destino.jtxa4.setText("\n Trimestres Nacionales");		
            a = Destino.jtxa4.getCaretPosition();
	    if(x1 > x2 && x1 > x3 && x1 > x4){
                Destino.jtxa4.insert("\n El Trimestre mas concurrido fue el de Ene-Feb-Mar con: " + x1 + " pasajeros",a);	        }
            else{ 
	    if(x2 > x1 && x2 > x3 && x2 > x4){
            Destino.jtxa4.insert("\n\tEl Trimestre mas concurrido fue el de Abr-May-Jun con: " + x2 + " pasajeros",a);          }
	    else{	
	    if(x3 > x1 && x3 > x2 && x3 > x4){
            Destino.jtxa4.insert("\n\tEl Trimestre mas concurrido fue el de Jul-Ago-Sep con: " + x3 + " pasajeros",a);	   	    }
	    else{
	    if(x4 > x1 && x4 > x2 && x4 > x3){	
            Destino.jtxa4.insert("\n\tEl Trimestre mas concurrido fue el de Jul-Ago-Sep con: " + x4 + " pasajeros",a);		    }
	          } } } }//fin del if
    
        if(tuarreglo.ValidaDatos()){ 
	x1 = tuarreglo.PasajerosTrimestreUno();
	x2 = tuarreglo.PasajerosTrimestreDos();
	x3 = tuarreglo.PasajerosTrimestreTres();
	x4 = tuarreglo.PasajerosTrimestreCuatro();
	y1 = tuarreglo.DistanciaTrimestreUno();
	y2 = tuarreglo.DistanciaTrimestreDos();
	y3 = tuarreglo.DistanciaTrimestreTres();
	y4 = tuarreglo.DistanciaTrimestreCuatro();	
	RPK1 = x1*y1;
	RPK2 = x2*y2;
	RPK3 = x3*y3;
	RPK4 = x4*y4;
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n RPK's Nacionales",a);    	
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n Los RPK's del 1er. Trimestre son: " +df.format(RPK1),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n Los RPK's del 2do. Trimestre son: " +df.format(RPK2),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n Los RPK's del 3er. Trimestre son: " +df.format(RPK3),a);
        a = Destino.jtxa4.getCaretPosition();
	Destino.jtxa4.insert("\n Los RPK's del 4to. Trimestre son: " +df.format(RPK4),a);
	}
        
     	if(tuarreglo.ValidaDatos()){ 	
	x2 = tuarreglo.DistanciaAno();
	a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n Distancia Nacional",a);		
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tLa distancia total en el anio es: "+x2+" kilometros",a);	
	}   
        
	if(miarreglo.ValidaDatos()){ 
	    if(tuarreglo.ValidaDatos()){ 	
	x1 = miarreglo.TotalAsientos();
	y1 = tuarreglo.DistanciaTrimestreUno();
	y2 = tuarreglo.DistanciaTrimestreDos();
	y3 = tuarreglo.DistanciaTrimestreTres();
	y4 = tuarreglo.DistanciaTrimestreCuatro();		
	ASK1 = x1*y1;
	ASK2 = x1*y2;
	ASK3 = x1*y3;
	ASK4 = x1*y4;
	a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tASK's Nacionales",a);		
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tLos ASK's del 1er. Trimestre son: " +df.format(ASK1),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tLos ASK's del 2do. Trimestre son: " +df.format(ASK2),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tLos ASK's del 3er. Trimestre son: " +df.format(ASK3),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tLos ASK's del 4to. Trimestre son: " +df.format(ASK4),a);
	}}
        
        
	if(miarreglo.ValidaDatos()){ 
	    if(tuarreglo.ValidaDatos()){ 
	         if(elarreglo.ValidaDatos()){ 		
	try{
	Factor1 = RPK1/ASK1;
	Factor2 = RPK2/ASK2;
	Factor3 = RPK3/ASK3;
	Factor4 = RPK4/ASK4;
        a = Destino.jtxa4.getCaretPosition();
	Destino.jtxa4.insert("\n\tFactor de Ocupacion Nacional",a);		
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tEl factor de ocupacion del 1er. Trimestre son: " +df.format(Factor1),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tEl factor de ocupacion del 2do. Trimestre son: " +df.format(Factor2),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tEl factor de ocupacion del 3er. Trimestre son: " +df.format(Factor3),a);
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tEl factor de ocupacion del 4to. Trimestre son: " +df.format(Factor4),a);
	}
	catch(ArithmeticException ae){
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tHay una division entre 0",a);			
	}
	}}}
        
        
        if(tuarreglo.ValidaDatos()){ 
	    if(elarreglo.ValidaDatos()){ 
	pasajerosN = tuarreglo.PasajerosAno();
	pasajerosI = elarreglo.PasajerosAno();	
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tPasajeros en todo el ano a nivel nacional: "+pasajerosN+" pasajeros",a);	
        a = Destino.jtxa4.getCaretPosition();
        Destino.jtxa4.insert("\n\tPasajeros en todo el ano a nivel internacional: "+pasajerosI+" pasajeros",a);	
        a = Destino.jtxa4.getCaretPosition();
	Destino.jtxa4.insert("\n\tPasajeros en todo el ano: "+(pasajerosN+pasajerosI)+" pasajeros",a);	
	}}
        
        
        }//FIN DE ESTADISTICAS
        
        //PARA ESTADISTICAS INTERNACIONALES
        public void MostrarEstadisticasInter(){
            int a;
            if(elarreglo.ValidaDatos()){ 
   	    y1 = elarreglo.Primer();
	    y2 = elarreglo.Segundo();
		y3 = elarreglo.Tercer();
		y4 = elarreglo.Cuarto();
	    Destino.jtxa5.setText("\nTrimestres Internacionales");
             a=Destino.jtxa5.getCaretPosition();
	    if(y1 > y2 && y1 > y3 && y1 > y4){
               
            Destino.jtxa5.insert("\nEl Trimestre mas concurrido fue el de Ene-Feb-Mar con: " + y1 + " pasajeros",a);	    }
            else{ 
	    if(y2 > y1 && y2 > y3 && y2 > y4){
            Destino.jtxa5.insert("\nEl Trimestre mas concurrido fue el de Abr-May-Jun con: " + y2 + " pasajeros",a);      }
	    else{	
	    if(y3 > y1 && y3 > y2 && y3 > y4){
            Destino.jtxa5.insert("\nEl Trimestre mas concurrido fue el de Jul-Ago-Sep con: " + y3 + " pasajeros",a);	 	}
	    else{
	    if(y4 > y1 && y4 > y2 && y4 > y3){	
            Destino.jtxa5.insert("\n\tEl Trimestre mas concurrido fue el de Jul-Ago-Sep con: " + y4 + " pasajeros",a);	    }
	          } } } }//fin del if
            
        if(elarreglo.ValidaDatos()){ 
	x1 = elarreglo.PasajerosTrimestreUno();
	x2 = elarreglo.PasajerosTrimestreDos();
	x3 = elarreglo.PasajerosTrimestreTres();
	x4 = elarreglo.PasajerosTrimestreCuatro();
	y1 = elarreglo.DistanciaTrimestreUno();
	y2 = elarreglo.DistanciaTrimestreDos();
	y3 = elarreglo.DistanciaTrimestreTres();
	y4 = elarreglo.DistanciaTrimestreCuatro();
	RPK5 = x1*y1;
	RPK6 = x2*y2;
	RPK7 = x3*y3;
	RPK8 = x4*y4;	
        
        a = Destino.jtxa5.getCaretPosition();
        Destino.jtxa5.insert("\n RPK's Nacionales",a);    	
        a = Destino.jtxa5.getCaretPosition();
        Destino.jtxa5.insert("\n Los RPK's del 1er. Trimestre son: " +df.format(RPK1),a);
        a = Destino.jtxa5.getCaretPosition();
        Destino.jtxa5.insert("\n Los RPK's del 2do. Trimestre son: " +df.format(RPK2),a);
        a = Destino.jtxa5.getCaretPosition();
        Destino.jtxa5.insert("\n Los RPK's del 3er. Trimestre son: " +df.format(RPK3),a);
        a = Destino.jtxa5.getCaretPosition();
	Destino.jtxa5.insert("\n Los RPK's del 4to. Trimestre son: " +df.format(RPK4),a);
            }  

        
        if(elarreglo.ValidaDatos()){ 	
	x1 = elarreglo.DistanciaAno();
        a = Destino.jtxa5.getCaretPosition();     
        Destino.jtxa5.insert("\n\tDistancia Internacional",a);	
        a = Destino.jtxa5.getCaretPosition();     
        Destino.jtxa5.insert("\n\tLa distancia total en el anio es: "+x1+" kilometros",a);
        
	}
        

        if(miarreglo.ValidaDatos()){ 
            
            if(elarreglo.ValidaDatos()){ 	
            x1 = miarreglo.TotalAsientos();
            y1 = elarreglo.DistanciaTrimestreUno();
            y2 = elarreglo.DistanciaTrimestreDos();
            y3 = elarreglo.DistanciaTrimestreTres();
            y4 = elarreglo.DistanciaTrimestreCuatro();
            ASK5 = x1*y1;
            ASK6 = x1*y2;
            ASK7 = x1*y3;
            ASK8 = x1*y4;	
            
    a = Destino.jtxa5.getCaretPosition();      
    Destino.jtxa5.insert("\n\tASK's Internacionales",a);
    
    a = Destino.jtxa5.getCaretPosition();  
    Destino.jtxa5.insert("\n\tLos ASK's del 1er. Trimestre son: " +df.format(ASK5),a);
    
    a = Destino.jtxa5.getCaretPosition();  
    Destino.jtxa5.insert("\n\tLos ASK's del 2do. Trimestre son: " +df.format(ASK6),a);	

    a = Destino.jtxa5.getCaretPosition();  
    Destino.jtxa5.insert("\n\tLos ASK's del 3er. Trimestre son: " +df.format(ASK7),a );	
    
    a = Destino.jtxa5.getCaretPosition();  
    Destino.jtxa5.insert("\n\tLos ASK's del 4to. Trimestre son: " +df.format(ASK8),a);		
	
	}}
        
     
        if(miarreglo.ValidaDatos()){ 
	    if(tuarreglo.ValidaDatos()){ 
	         if(elarreglo.ValidaDatos()){ 	
            try{
        Factor1 = RPK5/ASK5;
            Factor2 = RPK6/ASK6;
            Factor3 = RPK7/ASK7;
            Factor4 = RPK8/ASK8;
            
         a = Destino.jtxa5.getCaretPosition();         
        Destino.jtxa5.insert("\n\tFactor de Ocupacion Internacional",a);
         a = Destino.jtxa5.getCaretPosition();         
        Destino.jtxa5.insert("\n\tEl factor de ocupacion del 1er. Trimestre son: " +df.format(Factor1),a);	
         a = Destino.jtxa5.getCaretPosition();      
        Destino.jtxa5.insert("\n\tEl factor de ocupacion del 2do. Trimestre son: " +df.format(Factor2),a);	
         a = Destino.jtxa5.getCaretPosition();        
       Destino.jtxa5.insert("\n\tEl factor de ocupacion del 3er. Trimestre son: " +df.format(Factor3),a);	
         a = Destino.jtxa5.getCaretPosition();        
        Destino.jtxa5.insert("\n\tEl factor de ocupacion del 4to. Trimestre son: "+df.format(Factor4),a);	
        
            }
            catch(ArithmeticException ae){
        
        a = Destino.jtxa5.getCaretPosition();         
        Destino.jtxa5.insert("\n\tHay una division entre 0",a);		
            }	    
            }}}
        
        
        
        }        
        
        
        
        
        
        
}