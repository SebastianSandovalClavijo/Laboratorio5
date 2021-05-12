
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SANDOVAL
 */
public class Estudiante {

    private String Nombre;
    private LinkedList<Double> Notas = new LinkedList<Double>();

    public Estudiante() {
    }

    public Estudiante(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LinkedList<Double> getNotas() {
        return Notas;
    }

    public void setNotas(LinkedList<Double> Notas) {//Introudccir notas
        this.Notas.addAll(Notas);//Copiar el objeto
    }

    public void setUnaNota(Double nota) {//Carga una, o varias
        this.Notas.add(nota);

    }

}
