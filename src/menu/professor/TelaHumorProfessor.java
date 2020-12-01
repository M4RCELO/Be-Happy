package menu.professor;

import armazenamento.ArmagenarProfessor;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaHumorProfessor {
    private JFrame frmAvalieSeuHumor;
    private ArmagenarProfessor armazenar = new ArmagenarProfessor ();

    public void run() {
        try {
            TelaHumorProfessor window = new TelaHumorProfessor();
            window.frmAvalieSeuHumor.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public TelaHumorProfessor() {initialize();
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
        btnFeliz.setIcon(new ImageIcon("C:/Users/Gabri/IdeaProjects/Be-Happy/Images/feliz.png"));
        btnFeliz.setBounds(37, 50, 51, 51);
        frmAvalieSeuHumor.getContentPane().add(btnFeliz);

        JButton btnTriste = new JButton("");
        btnTriste.setIcon(new ImageIcon("C:/Users/Gabri/IdeaProjects/Be-Happy/Images/triste.png"));
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
        btnRaiva.setIcon(new ImageIcon("C:/Users/Gabri/IdeaProjects/Be-Happy/Images/raiva.png"));
        btnRaiva.setBounds(199, 50, 51, 51);
        frmAvalieSeuHumor.getContentPane().add(btnRaiva);

        JLabel lblComoVocEst = new JLabel("Como o aluno estava se sentindo?");
        lblComoVocEst.setBounds(37, 12, 221, 15);
        frmAvalieSeuHumor.getContentPane().add(lblComoVocEst);

        frmAvalieSeuHumor.setResizable(false);


    }
}
