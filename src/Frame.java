

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame {
    
    private static JButton notes;
    private static JButton pass;
    private static JLabel title;
    
    public Frame(){
        JPanel panel= new JPanel();
        JFrame frame3=new JFrame();
        frame3.setSize(410,300);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame3.add(panel);
        
        panel.setLayout(null);
        
        title=new JLabel("Notes and Password Manager");
        title.setBounds(100, 10, 300, 25);
        panel.add(title);
        
        notes =new JButton("Notes Manger");
        notes.setBounds(40, 100, 150, 25);
        panel.add(notes);
        notes.addActionListener(new Action());
        
        pass =new JButton("Password Manger");
        pass.setBounds(200, 100, 150, 25);
        panel.add(pass);
        pass.addActionListener(new Action2());
        
        frame3.setVisible(true);
    
    }
        static class Action implements ActionListener{    
        @Override
            public void actionPerformed (ActionEvent e){
            notesManager notes=new notesManager();
            notes.show();
            }
        }
        
        static class Action2 implements ActionListener{    
        @Override
            public void actionPerformed (ActionEvent e){
            PasswordManger password = new PasswordManger();
            password.show();
            }
        }
    
}
