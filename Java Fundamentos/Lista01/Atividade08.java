package Lista01;

import javax.swing.JOptionPane;

//8. Informe três números, retorne o menor informado.
public class Atividade08 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número."));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número."));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro número."));

     int menorValor = Math.min(n1, Math.min(n2, n3));

     JOptionPane.showMessageDialog(null, menorValor);

    }
    
}
