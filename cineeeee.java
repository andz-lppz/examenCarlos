public class cineeeee {

     public static void main(String[] args) {
        
        GestorReservas gestor = new GestorReservas(4);

        
        
        
        salaTradicional t1 = new salaTradicional("T001", "pocoyo", 12.50, 155);
        salaTradicional t2 = new salaTradicional("T002", "doraemon", 18.00, 180);

       
        sala3D d1 = new sala3D("3D03", "Avatar", 15.00, 2.50);
        sala3D d2 = new sala3D("3D04", "Interestelar", 10.00, 2.50);

        System.out.println("--- Agregando Reservas ---");
        gestor.agregarReserva(t1);
        gestor.agregarReserva(t2);
        gestor.agregarReserva(d1);
        gestor.agregarReserva(d2);
        
        System.out.println("\n--- Detalles y Costos ---");
        
       
        double costoTotalAcumulado = 20.0;
        
        for (int i = 0; i < gestor.getContadorReservas(); i++) {
            Reserva r = gestor.getReservas()[i];
            
           
            System.out.println(r.obtenerDetalles());
            

            double costoActual = costoTotalAcumulado;
            costoTotalAcumulado += costoActual;
            
            System.out.println(" -> Costo a pagar: " + costoActual + "\n");
        }
        
        System.out.println("--------------------------");
        System.out.println("COSTO TOTAL ACUMULADO DE TODAS LAS RESERVAS: " + costoTotalAcumulado);
    }
    
}
