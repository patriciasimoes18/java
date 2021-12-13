package Lista01;

import javax.swing.JOptionPane;

//2. Será pedido um número inteiro, retorne se é positivo ou negativo, além disso retorne se é par ou ímpar.

public class Atividade02 {
    
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor"));
        
        JOptionPane.showMessageDialog(null, valor <0 ? "Esse valor é negativo" : "Esse valor é positivo");
        JOptionPane.showMessageDialog(null, valor % 2 == 0 ? "Par": "impar");

        }
    }
