package AtividadeOO.ex02;
import javax.swing.JOptionPane;

/* Criar uma classe chamada Carro com a seguinte estrutura:

    // Atributos
    modelo, valor

    // Métodos
    Construtor
    impostos:double
    mensagem:string

Método impostos: Caso o valor do veículo seja até 10.000,00 será cobrado 10% sobre o veículo, entre R$10.000,01 e R$20.000,00 será cobrado 15%, caso contrário 20%.

Método mensagem: Retorne um texto com concatenando o modelo, valor e os impostos cobrados pelo veículo. */

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
