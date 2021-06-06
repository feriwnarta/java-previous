/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Feri Winarta
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.setLayout(null);
        
        JLabel label = new JLabel("User");
        label.setBounds(10,29,80,25);
        panel.add(label);
  
        JTextField userText = new JTextField();
        userText.setBounds(100,20,65,25);
        panel.add(userText);
        
        frame.setVisible(true);
        
    }
}
