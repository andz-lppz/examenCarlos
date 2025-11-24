public class salaTradicional extends Reserva {
    private int duracionMin; 

    public salaTradicional (String codigo, String nombrePelicula, double costoBase,int duracionMin ){
        super(codigo, nombrePelicula, costoBase); 
        this.duracionMin = duracionMin; 

    }
    public int getDuracionMin() {
        return duracionMin;
    }
 public void setDuracionMin(int duracionMin) {
     this.duracionMin = duracionMin;
 }

 @Override
 public String obtenerDetalles() {
     // TODO Auto-generated method stub
     return super.obtenerDetalles() + " - Duración: " + duracionMin + " min";
 }


 }

 
    

