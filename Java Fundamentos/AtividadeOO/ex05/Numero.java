package AtividadeOO.ex05;

import javax.swing.JOptionPane;

/**
 * 5) Desenvolver um sistema para retornar o menor número. Crie uma classe chamada Numero com as características:

	// Atributos
	numero1, numero2, numero3

	// Métodos
	Construtor
	obterNumero:void
	menorNumero:int

Método obterNumero: Pede três números

Método menorNumero: Precisa verificar qual dos três números é o menor.
 */

public class Numero {
	//Atributos
	int n1, n2,n3;

	//Construtor
	public Numero(){
		obterNumero();
		JOptionPane.showMessageDialog(null,"o menor valor é "+menorNumero());
	}

	//Obter numeros
	private void obterNumero(){
	n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
	n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));
	n3=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro numero"));
	
	}
	//Método para opter o menor numero
	private int menorNumero(){
		int menorValor;
		if(n1<n2 && n1<n3){
			menorValor = n1;
		}else if(n2<n1 && n2<n3){
			menorValor= n2;
		}else{
			menorValor=n3;
		}
		return menorValor;
	}

    
}
