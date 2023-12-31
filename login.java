
package quiz.ap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {




    JTextField text;
    JButton Next,back;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);



             JLabel heading = new JLabel( "QUIZ TEST");
             heading.setBounds(140,60,300,45);
             heading.setFont(new Font("VINER Hand ITC",Font.BOLD,40));
             heading.setForeground(new Color(22,99,54));
             add(heading);


             JLabel name = new JLabel("Enter your name");
             name.setBounds(160,150,300,20);
             name.setFont(new Font("Mongolian Baiti ",Font.BOLD,18));
             name.setForeground(new Color(22,99,54));
             add(name);

             text = new JTextField();
             text.setBounds(80,200,300,25);
             text.setFont(new Font("Times new Roman",Font.BOLD,18));
             add(text);

             Next = new JButton("Next");
             Next.setBounds(100,270,120,25);
             Next.setBackground(new Color(22,99,54));
             Next.setForeground(Color.WHITE);
             Next.addActionListener(this);
             add(Next);

        back = new JButton("back");
        back.setBounds(250,270,120,25);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Next){
            String name =text.getText();
            setVisible(false);
           // setUndecorated(true);
            new Rules(name);

        }else if(e.getSource()==back){
            System.exit(50);
        }
    }

    public static void main(String[] args){
        new Login();
    }
}