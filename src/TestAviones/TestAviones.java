package TestAviones;
import java.text.DecimalFormat; 


public class TestAviones {    

    ArregloAviones miarreglo = new ArregloAviones(20);
    ArregloTrimestre tuarreglo = new ArregloTrimestre(20);
    ArregloInternacional elarreglo = new ArregloInternacional(20);
    int dato,opcion,pos,n,x=0,serv,pasajerosN,pasajerosI,tamano,tamano1,x1,x2,x3,x4,y1, y2, y3,y4;
    
    public static void main(String[] args) {
   
    //int max = Destino.CapturarMax();
    //int min = Destino.CapturarMin();
    Destino window = new Destino();
    window.setTitle("Plan-E-AirLine");
    window.setVisible(true);
    window.setSize(737, 614);
    //ArregloAviones miarreglo = new ArregloAviones(Destino.CapturarMax());
    //Declaracion de variables locales
    //String avi,desti;
    //double Factor1,Factor2,Factor3,Factor4,RPK1=0,RPK2=0,RPK3=0,RPK4=0,RPK5=0,RPK6=0,RPK7=0,RPK8=0,ASK1=0,ASK2=0,ASK3=0,ASK4=0,ASK5=0,ASK6=0,ASK7=0,ASK8=0,x1,x2,x3,x4,y1,y2,y3,y4;
    DecimalFormat df = new DecimalFormat("0.00000");  
    

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
    }
        
        
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
        
}
        
}