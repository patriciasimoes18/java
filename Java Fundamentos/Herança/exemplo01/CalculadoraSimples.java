package Herança.exemplo01;

import javax.swing.JOptionPane;

//usar extends para fazer herança de outra classe. assim posso usar os métodos na mesma principal.

public class CalculadoraSimples extends CalculadoraCientifica{

    //Soma
    public void Soma(){
   int n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
   int n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));

   JOptionPane.showMessageDialog(null, "A soma é "+(n1+n2));
    }

    //Subtração
    public void Subtracao(){
        int n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));
     
        JOptionPane.showMessageDialog(null, "A subtração é "+(n1-n2));
    }
    //Multiplicação
    public void Multiplicação(){
        int n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));
     
        JOptionPane.showMessageDialog(null, "A multiplicação é "+(n1*n2));
    }
    //Divisão
    public void Divisao(){
        int n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));
     
        JOptionPane.showMessageDialog(null, "A Divisão é "+(n1/n2));

    }
}
