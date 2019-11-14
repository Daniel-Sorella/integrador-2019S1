package ar.edu.unahur.obj2.ejercicio1;

public class PaquetePatagonia extends Paquetes {


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
        return "Paquete Patagonia";
    }

    @Override
    public String transporteIda() {
        return "Transporte Ida: Traslado desde el aeropuerto de El calafate al hotel Huemul";
    }

    @Override
    public String dia1() {
        return "Visita ciudad Calafate";
    }

    @Override
    public String dia2() {
        return "Visita Glaciar Perito Moreno";
    }

    @Override
    public String dia3() {
        return "Naveción Glaciares";
    }

    @Override
    public String transporteVuelta() {
        return "Traslado del hotel Huemul al aeropuerto de El Calafate";
    }
}
