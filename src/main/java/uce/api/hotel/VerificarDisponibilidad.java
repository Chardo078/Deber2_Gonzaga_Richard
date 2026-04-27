package uce.api.hotel;


import jakarta.inject.Singleton;

@Singleton

public class VerificarDisponibilidad {

    public VerificarDisponibilidad() {
        System.out.println("(SINGLETON) Construyendo única instancia de VerificarDisponibilidad: " + this.hashCode());
    }

    public boolean consultar(String tipoHabitacion) {

        System.out.println("habitacion disponible");

        return true;

    }

}

