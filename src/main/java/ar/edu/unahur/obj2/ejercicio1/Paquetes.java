package ar.edu.unahur.obj2.ejercicio1;

public abstract class Paquetes implements Paquete {

    public abstract String nombre();
    public abstract String transporteIda();
    public abstract String dia1();
    public abstract String dia2();
    public abstract String dia3();
    public abstract String transporteVuelta();
    public  void print(String texto) {
        System.out.println(texto);
    }
}
