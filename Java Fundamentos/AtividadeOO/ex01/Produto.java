package AtividadeOO.ex01;

import javax.swing.JOptionPane;

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
