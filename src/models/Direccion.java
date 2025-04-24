package models;

public class Direccion {
    private String calle;
    private int codigo;

    public Direccion(String calle, int codigo) {
        this.calle = calle;
        this.codigo = codigo;
    }

    public String getCalle() {
        return calle;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return calle + " (" + codigo + ")";
    }
}
