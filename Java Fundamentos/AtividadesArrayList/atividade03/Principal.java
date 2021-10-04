package AtividadesArrayList.atividade03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        //vetor
        ArrayList<Produtos> dados = new ArrayList<Produtos>();

        //Menu
        String menu = "Selecione a opção desejada:\n";
        menu+= "1) Cadastrar\n";
        menu+="2) Selecionar\n";
        menu+="3) Remover\n";
        menu+="4) Sair";

        //para sair do laço

        boolean continuar = true;

        // Laço
        do{

        //obter a opção
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        // REsposta a opção escolhida
        switch(opcao){
            case 1:
            Produtos p = new Produtos();
            p.nome = JOptionPane.showInputDialog(null, "Nome do produto");
            p.marca = JOptionPane.showInputDialog(null, "Informe a marca do produto");
            p.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do produto"));

            dados.add(p);

            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            break;

            case 2:

            // Lista de produtos

            String lista = "Produtos cadastrados\n";

            // Laço
            for(int i=0; i<dados.size(); i++){
                lista+= "\nNome: "+dados.get(i).nome;
                lista+= "\nMarca: "+dados.get(i).marca;
                lista+= "\nValor: "+dados.get(i).valor;
                lista+= "\n__________________ ";
            }
            
            JOptionPane.showMessageDialog(null,lista);

            break;

            case 3:

            //Lista de produtos cadastrados
            String produtos = "Selecione o produto que deseja excluir\n";

            //Laço

            for(int i =0; i< dados.size(); i++){
                produtos+= (i+1)+")"+dados.get(i).nome+"\n";
            }

            // obter o indice

            int indice = Integer.parseInt(JOptionPane.showInputDialog(null, produtos));

            //excluir

            dados.remove(indice-1);

            //mensagens

            JOptionPane.showMessageDialog(null, "Produto removido.");
            break;

            case 4:
                JOptionPane.showMessageDialog(null, "Sair");
                continuar = false;
                break;
            
        }
            
     }while(continuar==true);



    }    

    
}
