public class Ubicaciones {
    private String nombre;
    private int capacidad;
    private double precio;

    public Ubicaciones(String nombre, int capacidad, double precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    //Método para imprimir
    @Override
    public String toString(){
        return nombre + "- Aforo:" + capacidad + "- Precio: $" + precio;
    }
}
