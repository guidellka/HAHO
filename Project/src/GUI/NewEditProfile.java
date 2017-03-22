/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author nattapon
 */
import javax.swing.*;
import java.awt.*;
public class NewEditProfile {
    public static void main(String[] args) {
        JFrame edit = new JFrame("EDIT PROFILE");
        JPanel p = new JPanel(new BorderLayout());
        JLabel name = new JLabel("ชื่อ",SwingConstants.CENTER);
        JTextField nametxt = new JTextField();
        JButton ok = new JButton("แก้ไข");
        JLabel id = new JLabel("รหัสนักศึกษา",SwingConstants.CENTER);
        JTextField idtxt = new JTextField();
        JButton cancle = new JButton("ยกเลิก");
        JLabel faculty = new JLabel("คณะ",SwingConstants.CENTER);
        JTextField facultytxt = new JTextField(); 
        JLabel email = new JLabel ("Email",SwingConstants.CENTER);
        JTextField emailtxt = new JTextField(); 
        JLabel password = new JLabel ("Password",SwingConstants.CENTER);               
        JPasswordField passwordtxt = new JPasswordField();
        JLabel second = new JLabel ("Security Change",SwingConstants.CENTER);
        
        JLabel oldpass = new JLabel("Old Password",SwingConstants.CENTER);
        JPasswordField oldtxt = new JPasswordField();
        JLabel newpass = new JLabel("New Password",SwingConstants.CENTER);
        JPasswordField newtxt = new JPasswordField();
        JLabel repass = new JLabel("Re-Enter",SwingConstants.CENTER);
        JPasswordField retxt = new JPasswordField();
        edit.add(p);
        p.add(name);
        p.add(nametxt);
        p.add(id);
        p.add(idtxt);
        p.add(faculty);
        p.add(facultytxt);
        p.add(email);
        p.add(emailtxt);
        p.add(password);
        p.add(passwordtxt);
        p.add(second);
        p.add(oldpass);
        p.add(oldtxt);
        p.add(newpass);
        p.add(newtxt);
        p.add(repass);
        p.add(retxt);
        p.add(ok);
        p.add(cancle);
        edit.setSize(800,600);
        name.setSize(50,50);
        p.setLayout(new GridLayout(11,2));
        edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        edit.setVisible(true);
    }
}
