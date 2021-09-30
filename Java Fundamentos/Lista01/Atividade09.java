package Lista01;
//9. Peça dois valores, se forem iguais realize a soma, caso contrário a multiplicação, retorne o resultado.

import javax.swing.JOptionPane;

public class Atividade09 {
    public static void main(String[] args) {

        int v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor"));

        if (v1 == v2){
            JOptionPane.showMessageDialog(null, (v1+v2));
        }else {
            JOptionPane.showMessageDialog(null, (v1*v2));

        }
    }
    
}
