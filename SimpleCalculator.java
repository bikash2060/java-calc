import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener
{
    //Declaring refrences of different components of swing:
    JFrame frame;
    JPanel panel;
    Font f1;
    JTextField field;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    double number1 = 0;
    double number2 = 0;
    int operator = 0;
    double result = 0;

    public SimpleCalculator()
    {
        //Creating object of frame, providing size and setting visible true:
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.setVisible(true);

        //Creating object of panel, providing size and setting visible true and adding in frame:
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(400,500);
        frame.add(panel);

        panel.setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().add(panel);
        f1 = new Font("Cambria",Font.BOLD,19);

        field = new JTextField();
        field.setBounds(40,20,258,60);
        field.setFont(f1);
        panel.add(field);

        btn1 = new JButton("7");
        btn1.setBounds(40,100,50,50);
        btn1.setFont(f1);
        panel.add(btn1);

        btn2 = new JButton("8");
        btn2.setBounds(110,100,50,50);
        btn2.setFont(f1);
        panel.add(btn2);

        btn3 = new JButton("9");
        btn3.setBounds(180,100,50,50);
        btn3.setFont(f1);
        panel.add(btn3);

        btn4 = new JButton("+");
        btn4.setBounds(250,100,50,50);
        btn4.setFont(f1);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        panel.add(btn4);

        btn5 = new JButton("4");
        btn5.setBounds(40,170,50,50);
        btn5.setFont(f1);
        panel.add(btn5);

        btn6 = new JButton("5");
        btn6.setBounds(110,170,50,50);
        btn6.setFont(f1);
        panel.add(btn6);

        btn7 = new JButton("6");
        btn7.setBounds(180,170,50,50);
        btn7.setFont(f1);
        panel.add(btn7);

        btn8 = new JButton("-");
        btn8.setBounds(250,170,50,50);
        btn8.setFont(f1);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.WHITE);
        panel.add(btn8);

        btn9 = new JButton("1");
        btn9.setBounds(40,240,50,50);
        btn9.setFont(f1);
        panel.add(btn9);

        btn10 = new JButton("2");
        btn10.setBounds(110,240,50,50);
        btn10.setFont(f1);
        panel.add(btn10);

        btn11 = new JButton("3");
        btn11.setBounds(180,240,50,50);
        btn11.setFont(f1);
        panel.add(btn11);

        btn12 = new JButton("x");
        btn12.setBounds(250,240,50,50);
        btn12.setFont(f1);
        btn12.setBackground(Color.BLACK);
        btn12.setForeground(Color.WHITE);
        panel.add(btn12);

        btn13 = new JButton("C");
        btn13.setBounds(40,310,50,50);
        btn13.setFont(f1);
        btn13.setBackground(Color.RED);
        btn13.setForeground(Color.WHITE);
        panel.add(btn13);

        btn14 = new JButton("0");
        btn14.setBounds(110,310,50,50);
        btn14.setFont(f1);
        panel.add(btn14);

        btn15 = new JButton("=");
        btn15.setBounds(180,310,50,50);
        btn15.setFont(f1);
        btn15.setBackground(Color.BLACK);
        btn15.setForeground(Color.WHITE);
        panel.add(btn15);

        btn16 = new JButton("/");
        btn16.setBounds(250,310,50,50);
        btn16.setFont(f1);
        btn16.setBackground(Color.BLACK);
        btn16.setForeground(Color.WHITE);
        panel.add(btn16);

        //Registering action listener to different components:
        field.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);

        frame.setSize(355,430);
        frame.setVisible(true);
        panel.setSize(355,430);
        frame.add(panel);
    }
    public void actionPerformed(ActionEvent event)
    {
        //Inserting text/number according to selected button:
        if(event.getSource() == btn14){
            field.setText(field.getText().concat("0"));
        }
        if(event.getSource() == btn9){
            field.setText(field.getText().concat("1"));
        }
        if(event.getSource() == btn10){
            field.setText(field.getText().concat("2"));
        }
        if(event.getSource() == btn11){
            field.setText(field.getText().concat("3"));
        }
        if(event.getSource() == btn5){
            field.setText(field.getText().concat("4"));
        }
        if(event.getSource() == btn6){
            field.setText(field.getText().concat("5"));
        }
        if(event.getSource() == btn7){
            field.setText(field.getText().concat("6"));
        }
        if(event.getSource() == btn1){
            field.setText(field.getText().concat("7"));
        }
        if(event.getSource() == btn2){
            field.setText(field.getText().concat("8"));
        }
        if(event.getSource() == btn3){
            field.setText(field.getText().concat("8"));
        }
        if(event.getSource() == btn13){
            field.setText(null);
        }
        if(event.getSource() == btn4){
            number1 = Double.parseDouble(field.getText());
            operator = 1;
            field.setText(null);
        }
        if(event.getSource() == btn8){
            number1 = Double.parseDouble(field.getText());
            operator = 2;
            field.setText(null);
        }
        if(event.getSource() == btn12){
            number1 = Double.parseDouble(field.getText());
            operator = 3;
            field.setText(null);
        }
        if(event.getSource() == btn16){
            number1 = Double.parseDouble(field.getText());
            operator = 4;
            field.setText(null);
        }
        if(event.getSource() == btn15){
            number2 = Integer.parseInt(field.getText());
            switch (operator)
            {
                case 1:result = number1 + number2;
                break;

                case 2:result = number1 - number2;
                break;

                case 3:result = number1 * number2;
                break;

                case 4:result = number1 / number2;
                break;
            }
            if(result == (int)result){
                field.setText(String.valueOf((int) result));
            }
            else{
                field.setText(String.valueOf((result)));
            }
        }
    }
    public static void main(String[] args)
    {
        new SimpleCalculator();
    }
}