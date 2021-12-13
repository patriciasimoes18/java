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
        
        int resultado =0;

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor"));

        for(int i=numero-1; i>0; i--){
            if(i==numero-1){
                resultado = numero *i;
                System.out.println(numero+"x"+i+"="+ resultado);
            }else{
                System.out.println(resultado+"x"+i+"="+(resultado*i));

                resultado= resultado*i;

            }


        }







    }
}
