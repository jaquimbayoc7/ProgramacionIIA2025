import javax.swing.*;

public class Ejecucion {
    public static void main(String[] args) {
        //Instancia de la clase - Objeto
        Productos objProducto = new Productos("", "",
                0, "", 0);
        objProducto.setNomProducto("Arroz");
        objProducto.setCatProducto("Cereal");
        objProducto.setCodProducto("a12345");
        objProducto.setPrecProducto(2500);
        objProducto.setCantProducto(100);

        //Impresión
        JOptionPane.showMessageDialog(null, "" +
                "El nombre del producto es:"+objProducto.getNomProducto()+"\n" +
                "La Categoría del producto es:"+objProducto.getCatProducto()+"\n" +
                "El Código del producto es:"+objProducto.getCodProducto());
    }
}
