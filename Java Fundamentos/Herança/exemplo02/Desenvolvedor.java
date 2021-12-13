package Herança.exemplo02;

import javax.swing.JOptionPane;

public class Desenvolvedor extends Atendente {
    //contrutor
    public Desenvolvedor(){
        JOptionPane.showMessageDialog(null, "Imposto de renda: R$"+ir());
        JOptionPane.showMessageDialog(null, "Prêmio faltas: R$ "+premioFalta());

        double salarioLiquido = (salario+premioFalta())-ir();

        JOptionPane.showMessageDialog(null, "O salário líquido será de R$ "+salarioLiquido);

    }

    //Imposto de renda

    private double ir(){
        double valor = 0;
        if(salario <=2000){
            valor = salario *0.05;
        }else if(salario <=5000){
            valor = salario * 0.10;
        }else if(salario>5000){
            valor = salario*0.12;

        }
        return valor;
    }
    //Premio falta
    private double premioFalta(){
        return faltas == 0 ? 200 :0;
    }
}
