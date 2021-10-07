package AtividadesArrayList.atividade06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        //vetor
        ArrayList<Clientes> dados = new ArrayList<Clientes>();

         //menu
         String menu = "Selecione a opçao desejada\n";
         menu+="1) Cadastrar\n";
         menu+="2) Selecionar\n";
         menu+="3) Alterar\n";
         menu+="4) Filtrar\n";
         menu+="5) Excluir\n";
         menu+="6) Sair";

         //sair do laço

         boolean continuar = true;

         //laço

         while(continuar ==true){
             //obter a opção selecionada
             int opcao =  Integer.parseInt(JOptionPane.showInputDialog(null, menu));

             //Escolha - cadastro

            switch(opcao){
                case 1: 
               Clientes c = new Clientes();
               c.nome = JOptionPane.showInputDialog(null, "Informe o nome");
               c.email = JOptionPane.showInputDialog(null, "Informe o email");
               c.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
               c.estado = JOptionPane.showInputDialog(null, "Informe o esytado");

               dados.add(c);
               JOptionPane.showMessageDialog(null, "Cliente cadastrado");

               case 2:
               //Listar Clientes
               String lista =  "CLIENTES CADASTRADOS";

               //laço
               for(int i=0; i<dados.size();i++){
                   lista+="\nNome: "+dados.get(i).nome;
                   lista+="\nEmail: "+dados.get(i).email;
                   lista+="\nCidade: "+dados.get(i).email;
                   lista+="\nEstado: "+dados.get(i).estado;
                   lista+="\n_________________ ";
                  
               }
                JOptionPane.showMessageDialog(null, lista);
                break;

                case 3:
                //listar clientes para alterar
                String cliente = "Selecione o cliente que deseja alterar";

                //laço
                for(int i=0; i<dados.size(); i++){
                    cliente+=(i+1)+"-"+ dados.get(i).nome+"\n";
                }
                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, cliente));

                Clientes p = new Clientes();
                p.nome = JOptionPane.showInputDialog(null, "Informe o nome");
                p.email = JOptionPane.showInputDialog(null, "Informe o email");
                p.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
                p.estado = JOptionPane.showInputDialog(null, "Informe o estado");

               dados.set(indice -1, p);
               break;

               case 4:

                int tipoFiltragem = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Nome \n2) Cidade"));


                    switch(tipoFiltragem){
                        case 1:

                            String termo = JOptionPane.showInputDialog(null, "Informe o termo");

                            String listaFiltragem = "";

                            //laço

                            // indexOf - Caso encontrado o termo, retorna onde inicia, caso contrário -1
                            for(int i=0; i<dados.size(); i++){
                               if(dados.get(i).nome.indexOf(termo) != -1){
                                   listaFiltragem += dados.get(i).nome + "\n";
                               }

                            }

                            JOptionPane.showMessageDialog(null, listaFiltragem);

                        break;
                    }

                break;

            }

         }

    }
    
}
