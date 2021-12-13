package AtividadeOO.ex03;
/*
3) Criar uma classe chamada Tabuada com a seguinte estrutura:

	// Atributos
	numero

	// Métodos
	Construtor
	obterNumero:void
	calculo:String

Método obterNumero: Pedirá um número para fazer a tabuada;

Método calculo: Retorna a tabuada daquele número (Você pode retornar a estrutura do cálculo, exemplo: 5X2=10...)

 */

import javax.swing.JOptionPane;

public class Tabuada {

     //Atributos
    private int numero;

    //contrutor
public Tabuada(){
    obterNumero();
    JOptionPane.showMessageDialog(null,calculo());
}
    //Obter numero
    private void obterNumero(){
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
    }
    
    //Método de calculo
    private String calculo(){
        String tabuada= "";
        int i=1;
        while(i<11){
            tabuada+= numero +"x"+i+"="+(numero*i)+"\n";     
            i++;
        }
       return tabuada;
     }      
         

    }
    


