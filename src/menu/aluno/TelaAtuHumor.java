package menu.aluno;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import armazenamento.AmazenarAluno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAtuHumor {

	private JFrame frmAvalieSeuHumor;
	private AmazenarAluno armazenar = new AmazenarAluno();

	public void run() {
		try {
			TelaAtuHumor window = new TelaAtuHumor();
			window.frmAvalieSeuHumor.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TelaAtuHumor() {initialize();
	}

	private void initialize() {
		frmAvalieSeuHumor = new JFrame();
		frmAvalieSeuHumor.setBounds(100, 100, 282, 152);
		frmAvalieSeuHumor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAvalieSeuHumor.getContentPane().setLayout(null);
		
		JButton btnFeliz = new JButton("");
		btnFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				armazenar.humor("Feliz");
				frmAvalieSeuHumor.dispose();
			}
		});
		btnFeliz.setIcon(new ImageIcon("C:/Users/marce/Desktop/Codigos/Java/Be-Happy/Images/feliz.png"));
		btnFeliz.setBounds(37, 50, 51, 51);
		frmAvalieSeuHumor.getContentPane().add(btnFeliz);
		
		JButton btnTriste = new JButton("");
		btnTriste.setIcon(new ImageIcon("C:/Users/marce/Desktop/Codigos/Java/Be-Happy/Images/triste.png"));
		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				armazenar.humor("Triste");
				frmAvalieSeuHumor.dispose();
			}
		});
		btnTriste.setBounds(118, 50, 51, 51);
		frmAvalieSeuHumor.getContentPane().add(btnTriste);
		
		JButton btnRaiva = new JButton("");
		btnRaiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				armazenar.humor("Raiva");
				frmAvalieSeuHumor.dispose();
			}
		});
		btnRaiva.setIcon(new ImageIcon("C:/Users/marce/Desktop/Codigos/Java/Be-Happy/Images/raiva.png"));
		btnRaiva.setBounds(199, 50, 51, 51);
		frmAvalieSeuHumor.getContentPane().add(btnRaiva);
		
		JLabel lblComoVocEst = new JLabel("Como você está se sentindo?");
		lblComoVocEst.setBounds(37, 12, 221, 15);
		frmAvalieSeuHumor.getContentPane().add(lblComoVocEst);
		
		frmAvalieSeuHumor.setResizable(false);


	}
}
