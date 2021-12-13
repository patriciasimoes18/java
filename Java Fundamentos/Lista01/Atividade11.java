package Lista01;
//11. Peça os três lados de um triângulo, retorne o tipo de triângulo que é:
//a) Isósceles: Dois lados iguais e um diferente;
//b) Equilátero: Os três lados iguais;
//c) Escaleno: As três medidas diferentes.

import javax.swing.JOptionPane;

public class Atividade11 {
    public static void main(String[] args) {
        int lDireito = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a medida do lado direito"));
        int lEsquerdo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe medida do lado esquerdo"));
        int lBaixo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a medida de baixo"));

       if(lDireito!=lEsquerdo && lEsquerdo!= lBaixo && lBaixo != lDireito){
           JOptionPane.showMessageDialog(null, "Triângulo escaleno");
       }else if(lDireito==lEsquerdo && lEsquerdo==lBaixo){
        JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
       }else{
        JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
       }
}
}