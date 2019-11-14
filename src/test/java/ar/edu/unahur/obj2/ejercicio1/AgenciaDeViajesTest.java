package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AgenciaDeViajesTest {

    private Paquetes paquetePatagonia;
    private Paquetes paqueteCuyo;
    private Paquetes paqueteNOA;
    private AgenciaDeViajes agenciaDeViajes;


    @BeforeTest
    public void setup() {
        paquetePatagonia = new PaquetePatagonia();
        paqueteCuyo = new PaqueteCuyo();
        paqueteNOA = new PaqueteNOA();

        agenciaDeViajes = new AgenciaDeViajes();

        agenciaDeViajes.agregarPaquete(paqueteCuyo);
        agenciaDeViajes.agregarPaquete(paqueteNOA);
        agenciaDeViajes.agregarPaquete(paquetePatagonia);
    }

    @Test
    public void testCatalogoDePaquetes() {
        agenciaDeViajes.catalogoDePaquetes();
    }
}