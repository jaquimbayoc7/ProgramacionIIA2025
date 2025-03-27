

public class Operaciones {
    private String ident;
    private String nomapellidos;
    private int edad;
    private int salud;
    private float temp;
    private boolean alcohol;

    //Constructor
    public Operaciones(String ident, String nomapellidos, int edad, int salud, float temp, boolean alcohol) {
        this.ident = ident;
        this.nomapellidos = nomapellidos;
        this.edad = edad;
        this.salud = salud;
        this.temp = temp;
        this.alcohol = alcohol;
    }
    //Get y Set
    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getNomapellidos() {
        return nomapellidos;
    }

    public void setNomapellidos(String nomapellidos) {
        this.nomapellidos = nomapellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    //Métodos particulares - cambiar el estado de salud y alcohol
    public String consumoAlcohol(boolean consumo){
        if(consumo== true){
            return "Si consume alcohol";
        }else if(consumo== false){
            return "No consume alcohol";
        }else{
            return "No es una opción válida";
        }
    }
    //1- enfermo últimos 15, 2 enfermó ultimo 8 días, 3- enfermó
    public String estadoSalud(int estado){
        if(estado==1){
            return "Estas en la mala :'(";
        }else if(estado==2){
            return "Estas mejorando pero sigue picho";
        }else if(estado==3){
            return "Estas Mejor";
        }else{
            return "Opción no válida";
        }

    }

    //Crear método que imprima toda la información
}
