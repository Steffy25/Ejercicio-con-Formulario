package deber3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frmTelevisor extends JFrame {

	private JPanel contentPane;
	private JTextField txtVolumen;
	private JTextField txtCanal;

	televisor tv1 = new televisor();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTelevisor frame = new frmTelevisor();
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
	public frmTelevisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEncender = new JButton("Encender");
		btnEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.encender();
				if(tv1.obtenerEstado())
				JOptionPane.showMessageDialog(null, "Televisor encendido" );
			}
		});
		btnEncender.setBounds(348, 29, 89, 23);
		contentPane.add(btnEncender);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.apagar();
				if(tv1.obtenerEstado())
				JOptionPane.showMessageDialog(null, "Televisor apagagado" );
			}
		});
		btnApagar.setBounds(348, 67, 89, 23);
		contentPane.add(btnApagar);
		
		JButton btnCanal = new JButton("Canal++");
		btnCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalArriba();
				txtCanal.setText("canal:"+tv1.obtenerCanal()+"");
			}
		});
		btnCanal.setBounds(348, 139, 89, 23);
		contentPane.add(btnCanal);
		
		JButton btnSubirVol = new JButton(" Vol. ++");
		btnSubirVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.subirVolumen();
				txtVolumen.setText(tv1.obtenerVolumen()+"");
			}
		});
		btnSubirVol.setBounds(10, 115, 89, 23);
		contentPane.add(btnSubirVol);
		
		JButton btnBajarvolum = new JButton(" Vol--");
		btnBajarvolum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.bajarVolumen();
				txtVolumen.setText(tv1.obtenerVolumen()+"");
			}
		});
		btnBajarvolum.setBounds(10, 155, 89, 23);
		contentPane.add(btnBajarvolum);
		
		JButton btnCanal_1 = new JButton("Canal--");
		btnCanal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalAbajo();
				txtCanal.setText("canal: "+tv1.obtenerCanal()+"");
			}
		});
		btnCanal_1.setBounds(348, 173, 89, 23);
		contentPane.add(btnCanal_1);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(134, 35, 173, 20);
		contentPane.add(txtVolumen);
		txtVolumen.setColumns(10);
		
		txtCanal = new JTextField();
		txtCanal.setColumns(10);
		txtCanal.setBounds(134, 70, 173, 20);
		contentPane.add(txtCanal);
	}
}
