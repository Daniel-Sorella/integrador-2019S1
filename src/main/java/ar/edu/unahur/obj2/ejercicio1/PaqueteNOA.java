package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteNOA extends Paquetes {

    public void imprimirItinerario() {
        print("Nombre: " + nombre());
        print("Transporte Ida: " + transporteIda());
        print("Dia 1: " + dia1());
        print("Dia 2: " + dia2());
        print("Dia 3: " + dia3());
        print("Transporte Vuelta: " + transporteVuelta());
    }

    @Override
    public String nombre() {
        return "Paquete NOA";
    }

    @Override
    public String transporteIda() {
        return "Traslado desde el aeropuerto de tucuman al hotel Casita de tucuman";
    }

    @Override
    public String dia1() {
        return "Visita ciudad de tucuman";
    }

    @Override
    public String dia2() {
        return "Traslado en bus a la ciudad de Salta, hotel San Carlos, visita de la ciudad";
    }

    @Override
    public String dia3() {
        return "Traslado en bus a la ciudad de Uspallata, hotel Hilton, visita de la ciudad";
    }

    @Override
    public String transporteVuelta() {
        return "Traslado desde el hotel Hilton al aeropuerto de san salvador de Jujuy.";
    }
}
