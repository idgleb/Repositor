public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;


    public Producto(String nombre, String categoria, double precio, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto " +
                "nombre=" + nombre  +
                ", categoria=" + categoria  +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        if (cantidad>0) this.cantidad = cantidad;

    }
}
