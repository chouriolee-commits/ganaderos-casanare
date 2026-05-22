package src.main.java;
public class NodoBST{
    int codigo;
    String raza;
    double peso;
    int edad;
    NodoBST izquierdo;
    NodoBST derecho;

    public NodoBST(int codigo, String raza,  double peso, int edad ){
        this.codigo = codigo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.izquierdo = null;
        this.derecho = null;
    }
}