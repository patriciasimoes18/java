package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtvalor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
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
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtvalor = new JTextField();
		txtvalor.setBounds(171, 27, 136, 20);
		contentPane.add(txtvalor);
		txtvalor.setColumns(10);
		
		JLabel lblinvestimento = new JLabel("Informe o investimento");
		lblinvestimento.setBounds(37, 29, 136, 17);
		contentPane.add(lblinvestimento);
		
		JComboBox <String>comboBox = new JComboBox<String>();
		comboBox.addItem("Informe o período");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.setBounds(171, 58, 136, 22);
		contentPane.add(comboBox);
		
		JLabel lblmeses = new JLabel("Selecione o per\u00EDodo");
		lblmeses.setBounds(37, 62, 124, 14);
		contentPane.add(lblmeses);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter dados
				
				double valor = Double.parseDouble(txtvalor.getText()); //Pegar o valor que a pessoa vai investir
				int parcelas = Integer.parseInt(comboBox.getSelectedItem().toString()); //toString() é para pegar o texto do combobox
				
				
				//Estrutura para exibir
				String estrutura = "Investimento\n";
				
				//Laço
				
				for(int indice=1; indice <= parcelas ; indice++){
				valor+=valor *0.0036;
				
				estrutura+=indice+"º mês - R$ "+valor+"\n";
				
				}
				
				//Exibir
				JOptionPane.showMessageDialog(null, estrutura);
			}
			
		});
		btncalcular.setBounds(171, 98, 104, 23);
		contentPane.add(btncalcular);
	}
}
