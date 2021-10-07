package OrientacaoAObjetos.metodos;

import javax.swing.JOptionPane;

public class Aluno {

    //Attributos
    private String nome;
    private Double nota1, nota2;

    //Construtor

    public Aluno(){
        obterDados();

        double retornoMedia = media();
        String retornoSituacao = situação(retornoMedia);

        JOptionPane.showMessageDialog(null, "O aluno "+nome+"obteve média "+retornoMedia+" e está "+retornoSituacao);

    }

    //Médodo para obter os nomes e as notas (equivalente a function).
    //precisa sempre definir se o método vai so guardar a informaçõa ou se ele vai precisar retornar algo
    // VOID para métodos sem retorno.

    private void obterDados(){
        nome = JOptionPane.showInputDialog(null, "Informe seu nome.");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 1."));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 2."));
    }
    
    // metodo para realizar a média
    private double media(){
        return (nota1+nota2)/2;
    }

    //metodo para realizar a situação
    private String situação(double media){
        return media >=7 ? "Aprovado" : "Reprovado";

    }
}
