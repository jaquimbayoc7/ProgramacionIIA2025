import javax.swing.*;

public class Atributos {
    private float numero;
    private float numerodos;
    private String resultado;

    public Atributos(float numero, float numerodos, String resultado) {
        this.numero = numero;
        this.numerodos = numerodos;
        this.resultado = resultado;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public float getNumerodos() {
        return numerodos;
    }

    public void setNumerodos(float numerodos) {
        this.numerodos = numerodos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    //Método void con parámetros de sumar
    public void Sumar(float num, float numdos){
        float res = 0;
        res = num + numdos;
        this.resultado = "El resultado es: "+res;
        JOptionPane.showMessageDialog(null, this.resultado);
    }
    //Método de retorno con parámetros - Restar
    public String Restar(float num, float numdos){
        float res = 0;
        res = num - numdos;
        this.resultado = "El resultado es: "+res;
        return this.resultado;
    }
    //Método void sin parametros - Multiplicar
    public void Multi(){
        this.resultado = "El resultado es: "+this.numero * this.numerodos;
        JOptionPane.showMessageDialog(null, this.resultado);
    }

    //Método de retorno sin parámetros -Dividir
    public String Dividir(){
        return "";
    }
}
