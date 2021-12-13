package Polimoporfismo;

public class Gerente extends Padrao {

    //Contrutor 
    public Gerente(double salario){ // colocar o atributo da outra classe
        super(salario); // super chama o construtor da outra classe por está herdando uma classe que ja tem construtor.
    }
    // método
    public void impostoDeRenda(){
        System.out.println("Imposto de Renda Gerente: R$ "+(salario*0.20));
    }

    
}
