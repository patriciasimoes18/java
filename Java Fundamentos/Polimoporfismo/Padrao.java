package Polimoporfismo;

public class Padrao {

    //Atributos
    double salario;

    //Construtor
    public Padrao(double salario){
        this.salario=salario;
        valeTransporte();
        impostoDeRenda();
    }

    //Métodos
    public void valeTransporte(){
        System.out.println("Vale transporte Padrão R$ "+(salario* 0.06));
    }
    
    public void impostoDeRenda(){
       System.out.println("Imposto de renda padrão R$ "+ (salario*0.10));
    }
}
