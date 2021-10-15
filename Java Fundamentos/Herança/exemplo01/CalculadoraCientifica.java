package Herança.exemplo01;

import javax.swing.JOptionPane;

public class CalculadoraCientifica {
    
    //seno
    public void Seno(){
        int n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        
        JOptionPane.showMessageDialog(null, "O seno é "+Math.sin(n1));
    
    }
    //Tangente
    public void Tangente(){
        int n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        
        JOptionPane.showMessageDialog(null, "A tangente é "+Math.tan(n1));
    
    }
    
}
