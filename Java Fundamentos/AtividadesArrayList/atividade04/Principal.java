package AtividadesArrayList.atividade04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*Desenvolver um sistema, onde seja possível: cadastrar e selecionar alunos. 
Crie uma classe Aluno com os seguintes atributos: nome, nota1, nota2, media e situação. 
Importante, a média e a situação não será o usuário que informa, deve ser feito de maneira automática.

7 - 10: Aprovado(a)
5 - 6.9: Em exame
0 - 5.9: Reprovado(a) */

public class Principal {
    public static void main(String[] args) {

        // Vetor
        ArrayList<Alunos> dados = new ArrayList<Alunos>();

        //Menu
        String menu = "Selecione a opção desejada\n";
        menu+= "1) Cadastrar\n";
        menu+= "2) Selecionar\n";
        menu+= "3) Sair";

        //sair do laço
        boolean continuar = true;

        //Laço
        while(continuar == true){
            //obter a opção
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            
            //Opção
            switch(opcao){
                case 1:
                Alunos p = new Alunos();
                p.nome =JOptionPane.showInputDialog(null, "Informe o nome do aluno");
                p.nota1 =Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota"));
                p.nota2= Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));
                p.media = (p.nota1+p.nota2)/2;
                p.situacao= p.media>=7? "Aprovado":p.media>=5 ? "Exame": "Reprovado";

                dados.add(p);
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
                break;

                case 2:

                // listar 

                String lista = "Alunos cadastrados\n";

                //Laço
                for(int i=0; i < dados.size(); i++){
                    lista+= "\nNome: "+dados.get(i).nome;
                    lista+= "\nNota 1: "+dados.get(i).nota1;
                    lista+= "\nNota 2: "+dados.get(i).nota2;
                    lista+= "\nMédia: "+dados.get(i).media;
                    lista+= "\nSituação: "+dados.get(i).situacao;
                    lista+= "\n________________";
                    
                } 
                JOptionPane.showMessageDialog(null, lista); 
                break;
            
                
                case 3:
                JOptionPane.showMessageDialog(null, "Sair");
                continuar = false;
                break;
            }

            
        }
        

        
    }
    
}
