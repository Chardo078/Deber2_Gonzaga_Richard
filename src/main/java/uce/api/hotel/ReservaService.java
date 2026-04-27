package uce.api.hotel;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ReservaService {

    
    public ReservaService() {
        System.out.println("[!] (APP SCOPED) Construyendo servicio ReservaService: " + this.hashCode());
    }

    @Inject
    private VerificarDisponibilidad verificador;

  
    @Inject
    private Instance<GenerarLlave> generadorLlaveProvider;

    public void procesarReserva(Reserva reserva) {
        System.out.println("\n INICIANDO RESERVA: " + reserva.getNombreHuesped().toUpperCase() );

        boolean hayEspacio = verificador.consultar(reserva.getNumeroHabitacion());

        if (hayEspacio) {
         
            GenerarLlave generadorLlave = generadorLlaveProvider.get();
            String pinAsignado = generadorLlave.pinAcceso(reserva.getNombreHuesped());
            
            System.out.println("   Reserva confirmada por " + reserva.getNoches() + " noches!");
            System.out.println("   Su PIN para abrir la habitación es: " + pinAsignado);
        } else {
            System.out.println("   Reserva rechazada por falta de disponibilidad.");
        }
    }
}