import javax.swing.*;
import java.util.Objects;

public class Repositor {
    private String name;

    public Repositor(String name) {
        this.name = name;
    }

    public void agregar_producto(Inventario inventario){

        String prod = MisFunciones.pedirStrNoVacio("producto?");
        int cant = MisFunciones.pedirNumeroMasCero("cantidad?");
        for (Producto producto: inventario.stock) {
            if (Objects.equals(producto.getNombre(), prod)){
                producto.setCantidad(producto.getCantidad() + cant);
                return;
            }
        }
        String cat = MisFunciones.pedirStrNoVacio("categ?");
        double prec = MisFunciones.pedirNumeroMasCero("precio?");



        Producto newProd = new Producto(prod,cat,prec,cant);
        inventario.stock.add(newProd);

    }

    public void eliminar_producto(Inventario inventario){
        String prod = MisFunciones.pedirStrNoVacio("producto?");

        for (Producto producto: inventario.stock) {
            if (Objects.equals(producto.getNombre(), prod)){
                inventario.stock.remove(producto);
                JOptionPane.showMessageDialog(null, "prod eliminado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el producto");


    }

    public void buscar_producto(Inventario inventario){

        String prod = MisFunciones.pedirStrNoVacio("producto?");

        for (Producto producto: inventario.stock) {
            if (Objects.equals(producto.getNombre(), prod)){
                JOptionPane.showMessageDialog(null, producto);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el producto");

    }

    @Override
    public String toString() {
        return "Repositor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
