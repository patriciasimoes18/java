package AtividadeOO.ex06;

import javax.swing.JOptionPane;

/**
 * 6) Implementar um sistema de IMC, crie uma classe chamada Pessoa com as características:

	// Atributos
	nome, peso, altura

	// Métodos
	Construtor
	obterDados():void
	calculoImc():double
	situacaoImc(imc):String
	mensagem():String

Método obterDados: Pede o nome, peso e altura

Método calculoImc: Retorna o IMC (índice de massa corporal). O cálculo é: peso / (altura * altura)

Método situacaoImc: Através do parâmetro IMC, iremos retornar a situação através do cálculo realizado no método anterior, segue a tabela:
Até 18.5 - Abaixo do peso
Até 25 - Peso normal
Até 30 - Acima do peso
Até 35 - Obesidade I
Até 40 - Obesidade II
40 ou mais - Obesidade III

Método mensagem: Crie uma mensagem com o nome, imc e situação.
 */

public class Pessoa {
    //Atributos
	private String nome;
	private double peso, altura;

	//contrutor
	public Pessoa(){
		obterDados();
		JOptionPane.showMessageDialog(null, mensagem());
		
	}

	//Obter dados
	private void obterDados(){
		nome = JOptionPane.showInputDialog(null,"Qual seu nome?");
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto você pesa?"));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura?"));
	}
	//metodo calculadora
	private double calculoImc(){
		return peso / (altura * altura);
	}
	
	//Situação
	private String situacaoImc( double imc){
		String situacao;
		if(imc<=1.5){
			situacao = "Abaixo do peso ideal";
		}else if(imc<=25){
			situacao= "Peso normal";
		}else if(imc<=30){
			situacao= "Acima do peso";
		}else if(imc<=35){
			situacao= "Obesidade I";
		}else if(imc<=40){
			situacao= "Obesidade II";
		}else{
			situacao = "Obesidade III";
		}
		return situacao;
	}
	//metodo para mensagem
	private String mensagem(){
		//return nome + " está "+situacaoImc(calculoImc())+" com IMC de "+calculoImc();	}

		return nome+", seu IMC é de "+calculoImc()+" ("+situacaoImc(calculoImc())+").";
}
}
