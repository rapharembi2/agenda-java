package teste;

import javax.swing.*;
import java.awt.*;


public class JPanelExemplo {

    private JFrame jFrame;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JTextField textFieldDescricao;
    private JButton botaoadd;
    private JButton botaoremove;
    private JButton botaoatt;
    private JTextArea text;

    public JPanelExemplo() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        jFrame = new JFrame("Meu Frame");
        jFrame.setLayout(new GridLayout(2,0));

        /*
         * Um JPainel para adicionar os componentes JLabel e JTextField 
         * que contém respectivamente o rótulo "Nome:" e o campo para edição. 
         */
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 0));

        /*
         * Outro JPainel para adicionar os componentes JLabel e JTextField 
         * que contém respectivamente o rótulo "Sobrenome:" e o campo para edição. 
         */
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 0));
        
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1,0));

        panel5 = new JPanel();
        panel5.setLayout(new GridLayout(1,0));

        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(0,3));

        text = new JTextArea();

        botaoadd = new JButton("Adicionar");
        botaoremove = new JButton("Remover");
        botaoatt = new JButton("Atualizar");
        textFieldNome = new JTextField(15);
        textFieldSobrenome = new JTextField(15);
        textFieldDescricao = new JTextField(15);
    
        //Adição dos componentes ao JPanel
        panel1.add(new JLabel("Nome: "));
        panel1.add(textFieldNome);
        panel1.add(new JLabel("Sobrenome:"));
        panel1.add(textFieldSobrenome);
        panel1.add(new JLabel("Descrição:"));
        panel1.add(textFieldDescricao);
        panel5.add(text);
        panel4.add(botaoadd);
        panel4.add(botaoremove);
        panel4.add(botaoatt);
     

        //Adição dos componentes JPanel ao JFrame
        jFrame.add(panel1);
        // jFrame.add(panel2);
        // jFrame.add(panel3);
        jFrame.add(panel5);
        jFrame.add(panel4);
        

        //Ajusta automaticamente o tamanho da janela, alternativa ao setSize()
        jFrame.pack();

        //Centraliza a janela
        jFrame.setLocationRelativeTo(null);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
        }
}