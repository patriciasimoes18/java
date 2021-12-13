import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class CaixaDeConfirmacao {

    public static void main(String[] args) {

        //menu

        String menu = "Escolha uma cidade";
               menu += "\n1)Blumenau";
               menu += "\n2)Indaial";
               menu += "\n3)Joinville";

        //Armazenar a opção de cidade escolhida

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        switch (opcao){
            case 1:
            JOptionPane.showMessageDialog(null, "você escolheu Blumenau");
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "você escolheu Indaial");
            break;

            case 3:
            JOptionPane.showMessageDialog(null, "você escolheu Joinville");
            break;

            default:

            JOptionPane.showMessageDialog(null, "Opção inválida");
        }

        //Opnião sobre a enquete

        int enquete = JOptionPane.showConfirmDialog(null, "Gostou da enquete?");
        
        switch(enquete){
            case 0:
            JOptionPane.showMessageDialog(null, "Que bom!");
            break;

            case 1:
            JOptionPane.showMessageDialog(null, "Que pena");
            break;

            default:
            JOptionPane.showMessageDialog(null, "Bye!");

        }
}
}