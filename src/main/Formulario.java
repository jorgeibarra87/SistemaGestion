package main;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JLabel lblPeso;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular IMC");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double altura = Double.parseDouble(txtAltura.getText());
				Double peso = Double.parseDouble(txtPeso.getText()) ;
				Double imc = peso/(altura*altura);
				JOptionPane.showMessageDialog(btnCalcular, "El indice de masa corporal IMC es: "+ imc);
			}
		});
		btnCalcular.setBounds(150, 163, 140, 34);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("Altura:");
		lblNewLabel.setBounds(72, 43, 50, 14);
		contentPane.add(lblNewLabel);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(150, 40, 227, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(150, 91, 227, 20);
		contentPane.add(txtPeso);
		
		lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(72, 94, 50, 14);
		contentPane.add(lblPeso);
	}
}
