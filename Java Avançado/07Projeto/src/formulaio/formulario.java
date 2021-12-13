package formulaio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtpeso;
	private JTextField txtaltura;

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
		
		txtpeso = new JTextField();
		txtpeso.setBounds(212, 11, 86, 20);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		txtaltura = new JTextField();
		txtaltura.setBounds(212, 42, 86, 20);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);
		
		JLabel lblpeso = new JLabel("Peso");
		lblpeso.setBounds(24, 14, 46, 14);
		contentPane.add(lblpeso);
		
		JLabel lblaltura = new JLabel("Altura");
		lblaltura.setBounds(24, 45, 46, 14);
		contentPane.add(lblaltura);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter dados
				
				double peso = Double.parseDouble(txtpeso.getText());
				double altura = Double.parseDouble( txtaltura.getText());
				
				//Calculo
				double imc = peso/(altura*altura);
				
				//Exibir
				
				if(imc<=18.5) {
					JOptionPane.showInternalMessageDialog(null,"Abaixo do peso");					
				}else if(imc<=25) {
					JOptionPane.showInternalMessageDialog(null,"Peso normal");
				}else if(imc<=30) {
					JOptionPane.showInternalMessageDialog(null,"Obesidade I");
			    }else if(imc<=40) {
					JOptionPane.showInternalMessageDialog(null,"Obesidade II");
			    }else if(imc>40) {
						JOptionPane.showInternalMessageDialog(null,"Obesidade III");
			    }
			}
		});
		
		btncalcular.setBounds(111, 103, 89, 23);
		contentPane.add(btncalcular);
	}

}
