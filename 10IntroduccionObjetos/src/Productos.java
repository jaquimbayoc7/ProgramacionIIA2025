
public class Productos {
    private String nomProducto;
    private String codProducto;
    private float precProducto;
    private String catProducto;
    private int cantProducto;
    private float totalProducto;

    public Productos(String nomProducto, String codProducto, float precProducto, String catProducto, int cantProducto) {
        this.nomProducto = nomProducto;
        this.codProducto = codProducto;
        this.precProducto = precProducto;
        this.catProducto = catProducto;
        this.cantProducto = cantProducto;
    }

    public float getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(float totalProducto) {
        this.totalProducto = totalProducto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public String getCatProducto() {
        return catProducto;
    }

    public void setCatProducto(String catProducto) {
        this.catProducto = catProducto;
    }

    public float getPrecProducto() {
        return precProducto;
    }

    public void setPrecProducto(float precProducto) {
        this.precProducto = precProducto;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }
}
