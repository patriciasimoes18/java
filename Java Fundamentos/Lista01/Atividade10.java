package Lista01;
//10. Crie um conversor de moedas. O usuário irá informar o valor, em seguida o tipo de conversão: 
//real para dólar, real para euro, dólar para real e euro para real.

import javax.swing.JOptionPane;

public class Atividade10 {
    
    public static void main(String[] args) {
     
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor deseja converter?"));

        String menu = "Escolha o tipo da conversão:\n";
               menu+="1) Real para dólar \n";
               menu+= "2) Real para Euro \n";
               menu+= "3)Dólar para Real \n";
               menu+= "4) Euro para real";

              String opcao = JOptionPane.showInputDialog(null, menu);


        if(opcao =="1"){
            JOptionPane.showMessageDialog(null, "US$ "+(valor / 5.5));           
        }else if(opcao =="2"){
            JOptionPane.showMessageDialog(null,"€"+(valor / 6.5));
        }else if (opcao == "3"){
            JOptionPane.showMessageDialog(null, "R$"+(5.5));
        }else{
            JOptionPane.showMessageDialog(null, "R$"+(valor * 6.5));


        }
    

        
    }
}
