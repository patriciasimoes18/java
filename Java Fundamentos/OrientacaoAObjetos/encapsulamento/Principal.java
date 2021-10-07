package OrientacaoAObjetos.encapsulamento;

public class Principal {
    public static void main(String[] args) {

        Pessoa objeto = new Pessoa();

        //Enviando a informação (SET)

        objeto.setNome("Pati"); 
        objeto.setIdade(32);

        //Retornar a informação (GET)

        System.out.println(objeto.getNome());
        System.out.println(objeto.getIdade());
    }
    
}
