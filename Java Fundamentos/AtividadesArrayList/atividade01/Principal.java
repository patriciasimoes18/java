package AtividadesArrayList.atividade01;

import java.util.ArrayList;

public class Principal {
    
public static void main(String[] args) {
    
    //Vetor - ArrayList (Nao tem limite de informaçoes)

ArrayList<Pessoa> dados = new ArrayList<>();//dados é o nome do vetor

//instanciar Objetos
Pessoa p1 = new Pessoa();
p1.nome ="Alice";
p1.cidade = "Blumenau";
p1.idade = 19;

// Instanciar outro objeto

Pessoa p2 = new Pessoa();
p2.nome ="Ricardo";
p2.cidade = "Gaspar";
p2.idade = 26;

//Adicionar objeto ao vetor

dados.add(p1);
dados.add(p2);

//Laço de repetição

for(int i=0; i<dados.size(); i++){
    System.out.println(dados.get(i).nome);
    System.out.println(dados.get(i).cidade);
    System.out.println(dados.get(i).idade);
    System.out.println("__________________________");

}

}

}
