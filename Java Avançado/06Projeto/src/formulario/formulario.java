package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtvalorHora;
	private JTextField txthoraNormal;
	private JTextField txthoraExtra50;
	private JLabel lblhE100;
	private JTextField txthoraExtra100;

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
		
		JLabel lblvalorH = new JLabel("Valor hora trabalhada");
		lblvalorH.setBounds(12, 15, 126, 14);
		contentPane.add(lblvalorH);
		
		txtvalorHora = new JTextField();
		txtvalorHora.setBounds(187, 14, 128, 20);
		contentPane.add(txtvalorHora);
		txtvalorHora.setColumns(10);
		
		JLabel lblhorasTrabalhadasMes = new JLabel("Horas trabalhadas/ m\u00EAs");
		lblhorasTrabalhadasMes.setBounds(12, 39, 126, 14);
		contentPane.add(lblhorasTrabalhadasMes);
		
		txthoraNormal = new JTextField();
		txthoraNormal.setBounds(187, 37, 128, 20);
		contentPane.add(txthoraNormal);
		txthoraNormal.setColumns(10);
		
		JLabel lblhE50 = new JLabel("Horas Extras 50%");
		lblhE50.setBounds(24, 91, 88, 14);
		contentPane.add(lblhE50);
		
		txthoraExtra50 = new JTextField();
		txthoraExtra50.setBounds(187, 88, 128, 23);
		contentPane.add(txthoraExtra50);
		txthoraExtra50.setColumns(10);
		
		
		lblhE100 = new JLabel("Horas Extras 100%");
		lblhE100.setBounds(26, 124, 106, 14);
		contentPane.add(lblhE100);
		
		txthoraExtra100 = new JTextField();
		txthoraExtra100.setBounds(187, 122, 128, 20);
		contentPane.add(txthoraExtra100);
		txthoraExtra100.setColumns(10);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.setBounds(142, 170, 86, 23);
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	   //Obter dados
				
		int valorHora = Integer.parseInt(txtvalorHora.getText());
		int horasNormais = Integer.parseInt(txthoraNormal.getText());
		int horasExtras50 = Integer.parseInt(txthoraExtra50.getText());
		int horasExtras100 = Integer.parseInt(txthoraExtra100.getText());
				
		//calculo
		
		double calculoHorasNormais = valorHora * horasNormais;
		double calculoHorasExtras50 = valorHora * horasExtras50 * 1.5;
		double calculoHorasExtras100 = valorHora * horasExtras100 * 2;
		
		double total =  calculoHorasNormais+calculoHorasExtras50+calculoHorasExtras100;
		
		//Retorno 
		
		JOptionPane.showMessageDialog(null, "R$"+total);
		
				
				
			}
		});
		contentPane.add(btncalcular);
	}

}
