package uce.api.hotel;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Inject
    private ReservaService reservaService;

    @Override
    public int run(String... args) {
        System.out.println("\n--- SISTEMA DE HOTEL INICIADO ---");
        System.out.println("Atendiendo a los clientes...\n");

        Reserva cliente1 = new Reserva("Richard Gonzaga", "Sencilla", 3);
        this.reservaService.procesarReserva(cliente1);

        Reserva cliente2 = new Reserva("Jose Gomez", "Suite", 5);
        this.reservaService.procesarReserva(cliente2);
        
        Reserva cliente3 = new Reserva("Linus Wallk", "Doble", 2);
        this.reservaService.procesarReserva(cliente3);

        System.out.println("\n--- SISTEMA FINALIZADO ---");
        return 0;
    }
}