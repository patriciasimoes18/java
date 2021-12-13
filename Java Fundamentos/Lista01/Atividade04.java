package Lista01;

import javax.swing.JOptionPane;

//Peça um ano, retorne se é bissexto ou não.
public class Atividade04 {
    
    public static void main(String[] args) {

        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano"));
        JOptionPane.showMessageDialog(null, ano % 4 == 0 ? "Esse é um ano bissexto. ": "Esse ano não é bissexto.");
        
    }
}
