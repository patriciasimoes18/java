package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acoes.AcoesCliente;
import modelos.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JLabel lblImagem;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCidade;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\cursoJava\\Java Avan\u00E7ado\\Banco2\\src\\bibliotecas\\user_icon.png"));
		lblImagem.setBounds(20, 11, 128, 128);
		contentPane.add(lblImagem);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(182, 105, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(182, 69, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(182, 32, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(266, 29, 128, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(266, 66, 128, 20);
		contentPane.add(txtIdade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(266, 102, 128, 20);
		contentPane.add(txtCidade);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nome = txtNome.getText();
					int idade = Integer.parseInt(txtIdade.getText());
					String cidade =  txtCidade.getText();
					
					
					Cliente c = new Cliente(0 , nome, idade, cidade);
					AcoesCliente.cadastrar(c);
					
					//Listar em tempo real
					
					table.setModel(AcoesCliente.listar());
					
					//Limpar os campos apos preenchidos.
					
					txtNome.setText("");
					txtIdade.setText("");
					txtCidade.setText("");
					
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				}catch(Exception erro){
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar");
				}
			}
		});
		btnCadastrar.setBounds(156, 159, 89, 23);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(10, 201, 414, 250);
		contentPane.add(scrollPane);
		
		table = new JTable(AcoesCliente.listar());
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//obter a linha selecionada
				int linha = table.getSelectedRow();
				
				//obter o codigo do cliente
				
				int codigo = Integer.parseInt(table.getValueAt(linha, 0).toString());
				
				//Efetuar a exclusao
				AcoesCliente.remover(codigo);
				
				//Atualizar tabela
			
				table.setModel(AcoesCliente.listar());
			
				
				
			}
		});
		scrollPane.setViewportView(table);
	}
}
