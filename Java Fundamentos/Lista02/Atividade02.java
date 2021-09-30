package Lista02;

import javax.swing.JOptionPane;

//2. Peça um número, retorne os dez antecessores e os dez sucessores;
public class Atividade02 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero."));

        int indiceInicial = numero - 10;
        int indiceFinal = numero + 10;

        String mensagem = "";

        while(indiceInicial <= indiceFinal){
            mensagem += (indiceInicial+"\n");
            indiceInicial++;
           
    }
    JOptionPane.showMessageDialog(null, mensagem);

}
}
