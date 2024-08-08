package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    private final String name;
    JButton start,back;

    Rules(String name){
   this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("welcome to quiz");
        heading.setBounds(30, 20, 700, 30);
        heading.setFont(new Font("Vainer Hand ITC", Font.BOLD, 25));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                  "1. Answer all questions within the given time limit." + "<br><br>" +
                  "2. Each question must be answered before moving to the next." + "<br><br>" +
                  "3. Read each question carefully before selection your answer." + "<br><br>" +
                  "4. You can skip questions and return to them later."+ "<br><br>" +
                  "5. Instant feedback will be displayed at the end of the quiz" + "<br><br>" +
                  "6. Your score will be displayed at the end of the quiz." + "<br><br>" +
                  "7. Have fun and do your best!" + "<br><br>" +
                        "<html>"


        );

        add(rules);

        back = new JButton ("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton ("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);



        setSize(800, 650);
        setLocation(250, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {

            setVisible(false);
            new Login();
        }
    }

    public static void main(String[]args){
        new Rules("User");
    }
}









