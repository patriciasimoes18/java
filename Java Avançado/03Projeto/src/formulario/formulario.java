package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

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
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblvalor = new JLabel("Informe o valor a ser convertido");
		lblvalor.setBounds(27, 24, 186, 14);
		contentPane.add(lblvalor);
		
		txtValor = new JTextField();
		txtValor.setBounds(223, 21, 110, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double valor = Double.parseDouble(txtValor.getText());
					int opcao = comboBox.getSelectedIndex();
					
					switch (opcao){
						case 1:
							JOptionPane.showMessageDialog(null, valor/5.5);
						break;
						case 2:
							JOptionPane.showMessageDialog(null, valor*5.5);
						break;
						case 3:
							JOptionPane.showMessageDialog(null, valor/6.5);
						break;
						case 4:
							JOptionPane.showMessageDialog(null, valor*6.5);
						break;
					}
				}catch(Exception erro) {}
			}
		});
		
		comboBox.addItem("Selecione o tipo de conversão");
		comboBox.addItem("Real para Dolar");
		comboBox.addItem("Dolar para Real");
		comboBox.addItem("Real para Euro");
		comboBox.addItem("Euro para Real");
		comboBox.setBounds(27, 62, 306, 22);
		contentPane.add(comboBox);
	}
}
