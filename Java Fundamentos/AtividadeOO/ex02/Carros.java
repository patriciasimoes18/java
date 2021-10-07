package AtividadeOO.ex02;

import javax.swing.JOptionPane;

public class Carros {
    private String modelo;
    private double valor;

    //Contrutor
    public Carros(){
        obterDados();
        JOptionPane.showMessageDialog(null, "O imposto do veiculo "+modelo+" é de R$"+calculoImposto());
    }

    //Obter dados
    private void obterDados(){
        modelo= JOptionPane.showInputDialog(null, "Informe o modelo");
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));

    }
    //Método de cáculo
    private double calculoImposto(){
        double valorImposto;

        if(valor<=10000){
            valorImposto = valor*0.1;

        }else if(valor>10000.1 && valor <=20000){

            valorImposto= valor*0.15;
        }else{
            valorImposto= valor*0.20;
        }

        return valorImposto;

    }
    
}
