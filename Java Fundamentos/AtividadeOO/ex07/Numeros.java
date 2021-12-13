package AtividadeOO.ex07;

import javax.swing.JOptionPane;

/**
 * 7) Criar uma classe chamada Números com a seguinte estrutura:

	// Atributos
	numero1, numero2

	// Métodos
	Construtor
	obterDados():void
	qtdPares():int
	qtdImpares():int
	qtdPositivos():int
	qtdNegativos():int
	mensagem:void

Método obter dados: Peça dois números.

Métodos: qtdPares, qtdImpares, qtdPositivos, qtdNegativos: Deve retornar a quantidade específica entre os valores informados. Vamos supor que o usuário informe os números -1 e 5, logo o resultado será:
1 Negativo
6 Positivos
3 Pares
4 Ímpares

Método mensagem: Crie uma frase com essas informações.
 */

public class Numeros {

	//Atributos
	int numero1, numero2;

	//Contrutor

	//Obter dados

	private void obterDados(){
		numero1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
		numero2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro numero"));
	}
    
}
