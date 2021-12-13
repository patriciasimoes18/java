package Lista02;

import javax.swing.JOptionPane;

public class Atividade01 {
    //1. Peça um número, retorne a tabuada daquele número;
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        int indice = 1;

        String mensagem = "";
        while(indice <11){
            mensagem+= numero+"x"+indice+ "="+(numero*indice) + "\n";
            indice++;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}