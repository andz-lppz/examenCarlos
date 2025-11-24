public class GestorReservas {
     private Reserva[] reservas; 
     private int contadorDeReservas; 


public GestorReservas(int capacidad) {
        this.reservas = new Reserva[capacidad];
        this.contadorDeReservas = 0;


}
public void agregarReserva(Reserva r) { 
        if (contadorDeReservas < reservas.length) {
            reservas[contadorDeReservas] = r; 
            contadorDeReservas++;
            System.out.println("Reserva '" + r.getNombrePelicula() + "' agregada.");
        } else {
            System.out.println("[ERROR]El gestor de reservas se encuentra lleno"); 
        
        }
    }
        public Reserva[] getReservas() {
        return reservas;
    }
    
    public int getContadorReservas() {
        return contadorDeReservas;
    
}
}                                                                   