package AtividadeOO.ex01;

import javax.swing.JOptionPane;
/**Criar uma classe chamada Produto com a seguinte estrutura:

    // Atributos
    nome, valor, formaPagamento

    // Métodos
    Construtor
    obterDados:void
    calculo:double
    mensagem:string

Método obterDados: Pedir nome, valor e forma de pagamento.

Método calculo: Retornar o valor do produto, caso o valor da compra seja de R$500,00 ou superior e a forma de pagamento for a vista, retorne o valor com 10% de desconto, caso contrário será pago integralmente.

Método mensagem: Crie uma frase, concatenando o nome do produto e o valor a ser pago. */

public class Produto {
    private String nome;
    private int formaDePagamento;
    private double valor;

    //construtor
    public Produto(){
        obterDados();
        JOptionPane.showMessageDialog(null, mensagem());
        
    }

    //obter dados
    private void obterDados(){
        nome = JOptionPane.showInputDialog(null, "Informe o produto");
        formaDePagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1)A vista\n2)A prazo"));
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da compra"));
    }
    //método de calculo
    private double calculo(){
    double total;

    if(valor>=500 && formaDePagamento ==1){
        total = valor *0.9;

    }else{
        total=valor;
    }
    return total;
    
}
// Metodo para mensagem
private String mensagem (){
    String texto = "O produto "+nome+ " irá custar R$"+calculo();
    return texto;
}
}
