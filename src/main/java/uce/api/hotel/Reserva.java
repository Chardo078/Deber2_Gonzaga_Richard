package uce.api.hotel;

public class Reserva {

    private String nombreHuesped;
    private String numeroHabitacion;
    private int noches;

    public Reserva(String nombreHuesped, String numeroHabitacion, int noches) {

        this.nombreHuesped = nombreHuesped;
        this.numeroHabitacion = numeroHabitacion;
        this.noches = noches;

}

public Reserva(){

    
}

public String getNombreHuesped() {
    return nombreHuesped;
}

public void setNombreHuesped(String nombreHuesped) {
    this.nombreHuesped = nombreHuesped;
}

public String getNumeroHabitacion() {
    return numeroHabitacion;
}

public void setNumeroHabitacion(String numeroHabitacion) {
    this.numeroHabitacion = numeroHabitacion;
}

public int getNoches() {
    return noches;
}

public void setNoches(int noches) {
    this.noches = noches;
}




}
