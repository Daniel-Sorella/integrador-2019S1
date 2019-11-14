package ar.edu.unahur.obj2.ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {

    private List<Paquetes> paquetes;

    public AgenciaDeViajes() {
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(Paquetes paquete) {
        paquetes.add(paquete);
    }

    public void catalogoDePaquetes() {
        paquetes.stream().forEach(p -> p.imprimirItinerario());
    }
}

