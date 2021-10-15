package AtividadeOO.ex04;
/*
4) Criar um conversor de moedas. Haverá uma classe chamada Conversor com a seguinte estrutura:

	// Atributos
	valor, tipoConversao

	// Métodos
	Construtor
        obterDados:void
	escolherConversao:double
	realParaDolar:double
	dolarParaReal:double
	realParaEuro:double
	euroParaReal:double

Método obterDados: Pedirá o valor e tipo de conversão

Método escolherConversao: Irá fazer uma condicional ou escolha para chamar o método correspondente de conversão e retornar o valor.

realParaDolar, dolarParaReal, realParaEuro, euroParaReal: Retorna o valor convertido. */

import javax.swing.JOptionPane;

//Atributos
public class Conversor {
	//Atributos
	private Double valor;
	String tipoConversao;

	//construtor
	public Conversor(){
		obterDados();
		JOptionPane.showMessageDialog(null, escolherConversao());
	}

	//Obter dados
	private void obterDados(){
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));
		tipoConversao = JOptionPane.showInputDialog(null,"Escolha o tipo da conversão:\n1)Real para Dolar\n2)Dolar para Real\n3)Real para Euro\n4)Euro para Real" );
	}
    //Conversão
	private double escolherConversao(){
		double conversao;
		if(tipoConversao == "1"){ 
			conversao = valor*5.5;
		}else if(tipoConversao == "2"){
			conversao=valor/5.5;
		}else if(tipoConversao == "3"){
			conversao=valor*6.5;
		}else{
			conversao=valor/6.5;

		}return conversao;
	}

}
