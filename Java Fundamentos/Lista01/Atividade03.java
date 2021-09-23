package Lista01;

import javax.swing.JOptionPane;

/*
3. Peça três notas, retorne a situação do aluno, além da média.
A situação é constituída pela seguinte regra: Média 7 ou superior aprovado(a), caso contrário reprovado(a).
*/
public class Atividade03 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a pimeira nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a psegunda nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota"));

        double media = (n1+n2+n3)/3;

        JOptionPane.showMessageDialog(null, media>=7 ? "Sua média é "+media+"  Você está aprovado.": "Sua media é "+media+". Você está reprovado.");
        

    }
    
}
