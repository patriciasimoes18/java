package OrientacaoAObjetos.encapsulamento;

public class Pessoa {
    //Atributos

   private String nome;
   private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



/*Visibilidade de atributos e metodos:

Default: Atributos e métodos ficam visíveis para projetos na mesma pasta. (esse é o padrão = mesmo q nada)
Public: Atributos e métodos ficam visíveis independente a classe que chame.
Private: Atributos e métodos ficam visíveis apenas na clase onde são criados.
Protected: Atributos e métodos ficam visíveis em classes onde são criados ou herdados.


Emcapsulamento:Restribngir o uso de atributos e métodos utilizando a visibilidade de atributos e métodos.

set: Envia a informação;
get: Retorna a informação. (Pega a informação que foi enviada)

 */
    

}
