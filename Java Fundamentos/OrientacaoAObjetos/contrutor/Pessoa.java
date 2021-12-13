package OrientacaoAObjetos.contrutor;

import javax.swing.JOptionPane;

public class Pessoa {

    // Construtor (*sempre public*, *sempre o mesmo nome da classe*)
    public Pessoa(){
        JOptionPane.showMessageDialog(null,"oi ");
    }

    public Pessoa(String nome){
        JOptionPane.showMessageDialog(null,"Oi"+nome);
    }
    public Pessoa (String nome, int idade){
        JOptionPane.showMessageDialog(null, "Oi "+nome+" você tem "+idade+" anos");
    }

}
    

