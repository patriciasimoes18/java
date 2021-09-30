package Lista01;
//7. Criar um sistema, onde o usuário informa um dia do mês de setembro, retorne qual o dia da semana representa aquela data. 
//Valide caso o número informado seja inferior a 1 e superior a 30.

import javax.swing.JOptionPane;

public class Atividade07 {
    public static void main(String[] args) {
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Infome o dia."));
        
        if(dia == 1 || dia == 8|| dia ==15||dia ==22 ||dia == 29){
            JOptionPane.showMessageDialog(null,  "Quarta");
        }else if(dia == 2|| dia ==9 ||dia ==16||dia == 23|| dia == 30){
            JOptionPane.showMessageDialog(null,  "Quinta");
        }else if (dia ==3||dia== 10|| dia ==17 || dia == 24){
             JOptionPane.showMessageDialog(null,  "Sexta");
        }else if (dia==4|| dia==11|| dia ==18|| dia ==25){
              JOptionPane.showMessageDialog(null, "Sábado");
        }else if (dia== 5|| dia==12 || dia ==19||dia == 26){
            JOptionPane.showMessageDialog(null, "Domingo");
        }else if(dia == 6||dia==13|| dia == 20|| dia ==27){
            JOptionPane.showMessageDialog(null,  "Segunda");
        } else if (dia < 1){
            JOptionPane.showMessageDialog(null, "Informe um dia válido.");
        }else if (dia >30){
            JOptionPane.showMessageDialog(null,  "Informe um dia válido.");
        }
        
        }
    }
    
 
