import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Producto> stock = new ArrayList<>();

    public Inventario() {
        //this.stock = stock;
    }

    public List<Producto> getStock() {
        return stock;
    }

    public void setStock(List<Producto> stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Inventario\n" +
                 stock;
    }
}
