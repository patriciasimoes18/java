package Lista02;
/*3. O usuário informa um número, crie um sistema para implementar a fórmula de Fibonacci.
Exemplo: Se o cliente informar o número 5, deverá ser exibido o cálculo:
5    X   4 = 20
20  X   3 = 60
60  X   2 = 120
120 X   1 = 120
 
usar for e if
*/

import javax.swing.JOptionPane;

public class Atividade03 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor"));

        int antecessor = numero -1; //4
        int resultado = numero * antecessor; // 5-4
        int result = resultado * antecessor;
        antecessor--;

        JOptionPane.showMessageDialog(null, result);






    }
}
