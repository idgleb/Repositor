import javax.swing.*;
import java.util.List;
import java.util.Objects;

public class Repositor {
    private String name;

    public Repositor(String name) {
        this.name = name;
    }

    public void agregar_producto(Inventario inventario) {

        String prod = MisFunciones.pedirStrNoVacio("producto?");
        if (prod == null) return;
        int cant = MisFunciones.pedirNumeroMasCero("cantidad?");
        if (cant == 0) return;
        for (Producto producto : inventario.getStock()) {
            if (Objects.equals(producto.getNombre(), prod)) {
                producto.setCantidad(producto.getCantidad() + cant);
                return;
            }
        }
        String cat = MisFunciones.pedirStrNoVacio("categ?");
        if (cat==null) return;
        double prec = MisFunciones.pedirNumeroMasCero("precio?");
        if (prec == -1) return;

        Producto newProd = new Producto(prod, cat, prec, cant);
        inventario.getStock().add(newProd);

    }

    public void eliminar_producto(Inventario stock) {
        if (stock.getStock().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos");
        } else {
            Producto prodElejido = (Producto) MisFunciones.eligirObjDeLista(stock.getStock());
            if (prodElejido != null) stock.getStock().remove(prodElejido);
        }
    }

    public Producto buscar_producto(Inventario inventario) {
        String prod = MisFunciones.pedirStrNoVacio("producto?");
        for (Producto producto : inventario.getStock()) {
            if (Objects.equals(producto.getNombre(), prod)) {
                JOptionPane.showMessageDialog(null, producto);
                return producto;
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el producto");
        return null;
    }

    public void actualizar_producto(Inventario stock) {

        if (stock.getStock().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos");
        } else {
            Producto pr = (Producto) MisFunciones.eligirObjDeLista(stock.getStock());
            if (pr != null) pr.setCantidad(MisFunciones.pedirNumeroMasCero("cantidad?"));
        }

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
