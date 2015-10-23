package TestAviones;
import java.text.DecimalFormat; 


public class TestAviones {    

    ArregloAviones miarreglo = new ArregloAviones(20);
    ArregloTrimestre tuarreglo = new ArregloTrimestre(20);
   
    public static void main(String[] args) {
    int dato,opcion,pos,n,x=0,serv,pasajerosN,pasajerosI,tamano,tamano1;
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
    
   
}