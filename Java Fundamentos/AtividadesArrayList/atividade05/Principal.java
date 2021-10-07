package AtividadesArrayList.atividade05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        //vetor
        ArrayList<Carros> dados = new ArrayList<Carros>();

        //menu
        String menu = "Selecione a opção desejada\n";
        menu+= "1) Cadastrar\n";
        menu+= "2) Selecionar\n";
        menu+= "3) Alterar\n"; 
        menu+= "4) Remover\n";
        menu+= "5) Sair";

        //Sair do laço
         boolean continuar = true;

        //Laço

    while(continuar == true){

        // Obter a opção selecionada
       int opcao= Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        //Escolha -  cadastro
        switch (opcao){
            case 1:
            Carros c = new Carros();
            c.modelo = JOptionPane.showInputDialog(null, "Informe o carro");
            c.fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante");
            c.valor =Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));
            c.ano = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o ano"));
            c.cor = JOptionPane.showInputDialog(null, "Informe a cor");

            dados.add(c);
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
            break;

            case 2:
            //Listar carros
            String lista = "CARROS CADASTRADOS\n";

            //laço
            for(int i=0; i<dados.size(); i++){
                lista+="\nModelo: "+dados.get(i).modelo;
                lista+="\nFabricante: "+dados.get(i).fabricante;
                lista+="\nValor: "+dados.get(i).valor;
                lista+="\nAno:"+dados.get(i).ano;
                lista+="\nCor:"+dados.get(i).cor;
                lista+="\n______________";

            }
            JOptionPane.showMessageDialog(null, lista);
            break;

            case 3:

            //Alterar usar .set

           String veiculos = "Selecione o carro que deseja alterar\n";

           for(int i=0; i<dados.size(); i++){
               veiculos += (i+1) + " - " + dados.get(i).modelo + "\n";
           }

           int indice = Integer.parseInt(JOptionPane.showInputDialog(null, veiculos));


           Carros v = new Carros();
           v.modelo = JOptionPane.showInputDialog(null, "Informe o carro");
           v.fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante");
           v.valor =Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));
           v.ano = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o ano"));
           v.cor = JOptionPane.showInputDialog(null, "Informe a cor");
        
           dados.set(indice-1, v);

           break;

           case 4 :
           //listar modelos para excluir

           String veiculoS = "Selecione o veículo que deseja remover\n";

           //laço
           for(int i=0; i<dados.size(); i++){
            veiculoS += (i+1)+"-"+dados.get(i).modelo+"\n";

           }
           //obter o modelo escolhido
           int veiculoRemover = Integer.parseInt(JOptionPane.showInputDialog(null, veiculoS));

           //REmove

           dados.remove(veiculoRemover-1);

           //mensagem
           JOptionPane.showInputDialog(null, "Veículo removido com sucesso");
           continuar=false;
           break;

                 
          




        }
        

    }


    }
    
}
