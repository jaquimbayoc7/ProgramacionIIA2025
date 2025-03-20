public class Operaciones {
    private float numerouno;
    private float numerodos;
    private float resultados;

    public Operaciones(float numerouno, float numerodos, float resultados) {
        this.numerouno = numerouno;
        this.numerodos = numerodos;
        this.resultados = resultados;
    }

    //Método de Sumar - retorno sin parámetros
    public String Suma(){
        this.resultados = this.numerouno+ this.numerodos;
       return " El resultado de la suma es:"+this.resultados;
    }

    //Método de restar - retorno con parámetros - Paso de parámetros por referencia
    public String Resta(float a, float b){
        this.resultados = a-b;
        return " El resultado de la resta es:"+this.resultados;
    }

    public float getNumerouno() {
        return numerouno;
    }

    public void setNumerouno(float numerouno) {
        this.numerouno = numerouno;
    }

    public float getNumerodos() {
        return numerodos;
    }

    public void setNumerodos(float numerodos) {
        this.numerodos = numerodos;
    }

    public float getResultados() {
        return resultados;
    }

    public void setResultados(float resultados) {
        this.resultados = resultados;
    }
}
