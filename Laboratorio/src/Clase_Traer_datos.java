
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
public class Clase_Traer_datos {
    //

    public static void main(String args[]) {
        LinkedList<String> nombre = new LinkedList<String>();//solo un Linkedlist por atributo (Nombre,Notas) clase estudiante
       /* LinkedList<Integer> nota1 = new LinkedList<Integer>();
        LinkedList<Integer> nota2 = new LinkedList<Integer>();
        LinkedList<Integer> nota3 = new LinkedList<Integer>();*/
       
        LinkedList<Estudiante> Estudiantes = new LinkedList<Estudiante>();
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Modelo2().setVisible(true);
            }
        });

        try {//referenciarlo bien si quiero en clase distinta a main
            BufferedReader lector = new BufferedReader(new FileReader("Nombre.csv"));
            String line = null;
            while ((line = lector.readLine()) != null) {
                String[] division = line.split(";");
                Estudiante envio = new Estudiante();
                envio.setNombre(division[0]);
                envio.setUnaNota(Double.parseDouble(division[1]));//Primer estudiante con nota
                envio.setUnaNota(Double.parseDouble(division[2]));//Segunda estudiante con nota
                envio.setUnaNota(Double.parseDouble(division[3]));//Tercera estudiante con nota
                Estudiantes.add(envio);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(nombre);

        System.out.println(Estudiantes);
     
    }

}
