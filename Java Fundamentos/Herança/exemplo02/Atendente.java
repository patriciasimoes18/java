package Herança.exemplo02;

import javax.swing.JOptionPane;

public class Atendente extends Colaborador{
    // contrutor

    public Atendente(){
        JOptionPane.showMessageDialog(null, "Imposto de renda: R$"+ir());
        JOptionPane.showMessageDialog(null, "Prêmio faltas: R$ "+premioFaltas());

        double salarioLiquido = (salario+premioFaltas())-ir();

        

    }
    //Imposto de Renda
    private double ir(){
        double valor = 0;

        if(salario <= 1000){
            valor = salario * 0.03;
        }else if(salario <= 2500){
            valor = salario *0.05;
        }else if(salario >2500){
            valor = salario * 0.07;

        }
        return valor;
    }
    //Premio faltas
    private double premioFaltas(){
        return faltas == 0 ? 50 : 0;
    }



}
