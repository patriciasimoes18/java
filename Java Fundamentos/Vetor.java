import javax.swing.JOptionPane;

public class Vetor {
    public static void main(String[] args) {
        //Vetor de nomes

        String[] nomes = {"Alice", "Caio", "Luciana", "Paulo"};

        //Laço para (for)

        for(int i=0; i<nomes.length; i++){
            JOptionPane.showMessageDialog(null,  nomes[i]);
        }

    }
    
}
