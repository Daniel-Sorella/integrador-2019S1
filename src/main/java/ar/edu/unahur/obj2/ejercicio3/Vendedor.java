package ar.edu.unahur.obj2.ejercicio3;

public class Vendedor {

    private final tipoVendedor tipoVendedor;

    public Vendedor(ar.edu.unahur.obj2.ejercicio3.tipoVendedor tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public double comision(double montoVenta) {

        return tipoVendedor.porcentajeComision()*montoVenta;

    }
}
