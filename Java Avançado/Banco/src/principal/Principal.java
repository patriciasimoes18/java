package principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bd.Conexao;

public class Principal {

	public static void main(String[] args) {
		
		// tentativa cadastrar - comando sql tem que ser try catch
		/*try {
			// Iniciar conexão
			Connection con = Conexao.conectar();
			
			//SQL
			String sql=" INSERT INTO clientes (nome, idade, cidade) VALUES (?,?,?)";
			
			//PreparedStament -> Efetuar o comando SQL com parametros
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "Henrique");
			pstmt.setInt(2, 2);
			pstmt.setString(3, "Blumenau");
			
			//Executa
			pstmt.execute();
			
			//Retorno
			System.out.println("Cadastro efetuado com sucesso!");
			
		}catch(Exception erro) {
			System.out.println("FALHA AO CADASTRAR"+ erro.getMessage());
			
		}*/
		
		//Selecionar 
		
		try {
			//conexão
			Connection con = Conexao.conectar();
			
			//SQL
			String sql = "SELECT * FROM  clientes";
			
			//Statement sem parametros
			Statement stmt = con.createStatement();
			
			//ResultSet -> Vetor para armazenar os dados do SELECT
			ResultSet rs = stmt.executeQuery(sql);
			
			//Listar dados
			
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}

	}catch(Exception erro) {
		System.out.println("Falha ao selecionar");
	}
		
	}
}
