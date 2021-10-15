package Herança.exemplo02;

import javax.swing.JOptionPane;

public class Colaborador {
    
    //Atributos
    String nome;
    double salario;
    int faltas;

    //Costrutor
    public Colaborador(){
        nome = JOptionPane.showInputDialog(null, "Informe seu nome");
        salario= Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salario"));
        faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe as faltas"));
    }



}
