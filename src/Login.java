// Login Page Code  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener{
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JLabel titleLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success; 
    
                    
    public static void main(String[] args) {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        
        panel.setLayout(null);
        
        titleLabel=new JLabel("Notes and Password Manager");
        titleLabel.setBounds(100, 10, 300, 25);
        panel.add(titleLabel);
        
        userLabel=new JLabel("Username ");
        userLabel.setBounds(40, 70, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField();
        userText.setBounds(140, 70, 165, 25);
        panel.add(userText);
        
        passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(40,100,80,25);
        panel.add(passwordLabel);
        
        passwordText=new JPasswordField();
        passwordText.setBounds(140, 100, 165, 25);
        panel.add(passwordText);

        button=new JButton("Login");
        button.setBounds(125, 150, 80, 25);
        button.addActionListener(new Login());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(100, 200, 300, 25);
        panel.add(success);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user =userText.getText();
        String password = passwordText.getText();
        
        if(user.equals("om") && password.equals("1111")){
            success.setText("Login Successfull !!!");
                    Frame frame1=new Frame();
        }
        else if(user.equals("omkar") && password.equals("1111")){
            success.setText("Login Successfull !");
                    notesManager notes=new notesManager();
                    notes.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
