import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Repositor repositor = new Repositor("Gleb");
        Inventario stock = new Inventario();

        String[] opc = {"agregar_producto", "buscar_producto", "eliminar_producto"};
        Runnable[] ac = new Runnable[]{
                () -> repositor.agregar_producto(stock),
                () -> repositor.buscar_producto(stock),
                () -> repositor.eliminar_producto(stock),
        };
        MisFunciones.interfaz(ac, opc, stock::toString);

      

    }
}