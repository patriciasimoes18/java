package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValor = new JTextField();
		txtValor.setBounds(241, 11, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblValor = new JLabel("Informe o valor da compra");
		lblValor.setBounds(23, 14, 170, 14);
		contentPane.add(lblValor);
		
		JCheckBox ckbaVista = new JCheckBox("Pagamento a vista");
		ckbaVista.setBounds(23, 35, 170, 23);
		contentPane.add(ckbaVista);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double valor = Double.parseDouble(txtValor.getText());
					
					boolean aVista = ckbaVista.isSelected();
					
					if(valor >= 100 && aVista ==true) {
						JOptionPane.showMessageDialog(null, "R$ "+(valor * 0.95));	
					}else{
						JOptionPane.showMessageDialog(null, "R$ "+valor);
					}
					
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Informe o valor da compra");
				}
			}
		});
		btnEnviar.setBounds(104, 75, 89, 23);
		contentPane.add(btnEnviar);
	}
}
