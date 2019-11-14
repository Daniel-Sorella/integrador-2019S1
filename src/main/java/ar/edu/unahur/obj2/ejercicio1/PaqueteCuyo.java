package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteCuyo extends Paquetes {


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
        return "Paquete Cuyo";
    }

    @Override
    public String transporteIda() {
        return "Traslado desde el aeropuerto de Mendoza al hotel San Martin";
    }

    @Override
    public String dia1() {
        return "Visita ciudad de Mendoza";
    }

    @Override
    public String dia2() {
        return "Circuito Vitivinicola";
    }

    @Override
    public String dia3() {
        return "Visita chapelco";
    }

    @Override
    public String transporteVuelta() {
        return "Traslado desde el hotel San Martin al aeropuerto de Mendoza";
    }
}
