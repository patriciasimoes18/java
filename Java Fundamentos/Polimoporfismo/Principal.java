package Polimoporfismo;
@SuppressWarnings ("all")

public class Principal {
    public static void main(String[] args) {
        //Padrao p = new Padrao(1000);

        Padrao p = new Gerente(1000); // Tudo que tiver o mesmo nome ele vai executar o da classe gerente.
    }
    
}
