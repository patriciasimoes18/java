import javax.swing.JOptionPane;

public class ConverterParaNumeros {

    public static void main(String[] args) {
        /*
        Double.parseDouble() : converte um texto para um numero real.
        Interger.parseInt() : Converte um texto para um numero inteiro.
        */
        try{
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));

        double media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null, "A média é "+media);
    }catch(Exception erro){
        JOptionPane.showMessageDialog(null, "Favor informar apenas números");
    }
}
}
