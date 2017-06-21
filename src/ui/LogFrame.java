package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LogFrame extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    
    private JLabel name = new JLabel("������");
    private JLabel paswd = new JLabel("���룺");
    private JLabel welcm = new JLabel("��ӭ�����������ϵͳ");
    private JTextField IDText = new JTextField();
    private JTextField pasText = new JTextField();
    private JButton login = new JButton("��½");
    private JButton reset = new JButton("����");

    public LogFrame() {
        super("�������ϵͳ");
        this.setSize(300, 250);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.loadComponet();    
        this.setLocationRelativeTo(null);
    }

    public void loadComponet() {
        this.add(welcm);
        welcm.setBounds(50, 20, 200, 30);
        welcm.setFont(new Font("΢���ź�",Font.BOLD,20));
        
        this.add(name);
        name.setBounds(50, 70, 50, 30);
        name.setFont(new Font("΢���ź�",Font.PLAIN,14));
        
        this.add(paswd);
        paswd.setBounds(50, 110, 50, 30);
        paswd.setFont(new Font("΢���ź�",Font.PLAIN,14));
        
        this.add(IDText);
        IDText.setBounds(100, 70, 150, 30);
        IDText.setFont(new Font("΢���ź�",Font.PLAIN,14));
       
        this.add(pasText);
        pasText.setBounds(100, 110, 150, 30);
        pasText.setFont(new Font("΢���ź�",Font.PLAIN,14));
       
        this.add(login);
        login.setBounds(60, 160, 80, 30);
        login.setFont(new Font("΢���ź�",Font.BOLD,14));
        login.setFocusable(false);
        login.addActionListener(this);
        
        this.add(reset);
        reset.setBounds(170, 160, 80, 30);
        reset.setFont(new Font("΢���ź�",Font.BOLD,14));
        reset.setFocusable(false);
        reset.addActionListener(this);
    }

    public static void main(String[] args) {
        new LogFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            
        }
        if(e.getSource() == reset) {
            IDText.setText(null);
            pasText.setText(null);
        }
    }
}
