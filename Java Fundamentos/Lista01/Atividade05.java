package Lista01;

import javax.swing.JOptionPane;

/*5. Criar um sistema, onde o usuário informa o valor de um produto e a forma de pagamento. 
Se o pagamento for superior a R$500,00 e a vista, será dado um desconto de 10%, caso contrário, sem desconto.
*/
public class Atividade05 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da sua compra"));
        
       String menu = "Escolha a forma de pagamento";
              menu+= "\n1) A vista";
              menu+= "\n2) A prazo";

        int pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        if(valor>500 && pagamento == 1){
            JOptionPane.showMessageDialog(null, "Total a pagar "+(valor*0.9));
        }else{
            JOptionPane.showMessageDialog(null, "Total a pagar "+ valor);
            
        }



    }
    
}
