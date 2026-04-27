package uce.api.hotel;

import java.util.Random;


import jakarta.enterprise.context.Dependent;

@Dependent

public class GenerarLlave {

    public GenerarLlave() {
        System.out.println("   (DEPENDENT) Construyendo nueva GenerarLlave en memoria: " + this.hashCode());
    }

    public String pinAcceso(String Huesped) {
        System.out.println("Generando llave");
        int pin = 1000 + new Random().nextInt(9000);
        return String.valueOf(pin);
    }
}