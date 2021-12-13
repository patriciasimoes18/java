package Lista01;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

//6. Utilizando como base o horário de Brasília (apenas a hora), faça com que o usuário tenha uma lista de cidades, exemplo: 
//(Cidade do México, Nova Iorque, Tóquio),em seguida informe a hora atual de Brasília. Retorne o horário da cidade escolhida.
public class Atividade06 {
    public static void main(String[] args) {

        //Menu

        String menu = "Escolha uma cidade";
               menu+= "\n1) Lisboa";
               menu+= "\n2) Barcelona";
               menu+= "\3) Nova Iorque";

        //Obter a cidade

        int cidade = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        // Obter horário

        int horario = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o horário de Brasília."));

        // Retorno

        JOptionPane.showMessageDialog(null, cidade == 1? horario+3 : cidade == 2 ? horario+4 : horario+2);





        
    }
    
}
