package Lista01;

import javax.swing.JOptionPane;

//1. O usuário terá que informar o nome, idade e a cidade onde mora. Retorne uma frase concatenando essas informações.
public class Atividade01 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
        String cidade = JOptionPane.showInputDialog(null, "Em qual cidade você mora?");

        JOptionPane.showMessageDialog(null, "Olá, "+nome+". Você tem "+idade+" anos e mora na cidade de "+cidade+".");

    }

    
}
