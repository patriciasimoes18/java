package AtividadesArrayList.atividade02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        //Vetor
        ArrayList<Pessoa> dados = new ArrayList<Pessoa>();

        //menu
        String menu = "O que deseja fazer?\n";
        menu+= "1) Cadastrar\n";
        menu+= "2) Listar\n";
        menu+= "3) Remover\n";
        menu+= "4) Sair";

        //Variavel para sair do laço
         boolean continuar = true;

        //Laço
        do{

            // Obter a opção
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Escolha
            switch (opcao){
                case 1:
                Pessoa p = new Pessoa();
                p.nome = JOptionPane.showInputDialog(null, "Informe o nome");
                p.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
                p.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade"));

                dados.add(p);

                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

                break;

                case 2:

                // Lista de pessoas
                String lista = "Pessoas cadastradas\n";

                // Laco
                for(int i=0; i<dados.size(); i++){
                    lista+= "\nNome: "+dados.get(i).nome;
                    lista+= "\nCidade: "+dados.get(i).cidade;
                    lista+= "\nIdade: "+dados.get(i).idade;
                    lista+= "\n_____________ ";

                }
                
                JOptionPane.showMessageDialog(null, lista);


                break;

                case 3:

                // Lista de nomes
                String nomes = "Selecione a pessoa\n";

                //Laço
                for(int i=0; i<dados.size(); i++){

                    nomes += (i+1)+")"+dados.get(i).nome+"\n";
                }
                
                // Obter o indice
                int indice = Integer.parseInt(JOptionPane.showInputDialog(nomes));

                //Remove
                dados.remove(indice-1);

                //mensagem
                JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso!");

                break;

                case 4:
                JOptionPane.showMessageDialog(null, "Sair");
                continuar = false;
                break;


            }

        }while (continuar == true);


    }
    
}
