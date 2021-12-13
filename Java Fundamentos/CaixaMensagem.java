import javax.swing.JOptionPane;

public class CaixaMensagem {
   public static void main(String[] args) {
       //Exibir mensagem tipo alert
      // JOptionPane.showMessageDialog(null, "hello world");

      //Pedir um nome tipo
      String nome = JOptionPane.showInputDialog(null, "Qual é seu nome?");
      JOptionPane.showMessageDialog(null, "Bom dia, "+nome);
   }
    
}
