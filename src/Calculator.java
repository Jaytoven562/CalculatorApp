import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonClear;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEqual = new JButton("=");
        buttonClear = new JButton("C");

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonSubtract);
        panel.add(button0);
        panel.add(buttonClear);
        panel.add(buttonEqual);
        panel.add(buttonAdd);

        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == buttonAdd) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        } else if (e.getSource() == buttonSubtract) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        } else if (e.getSource() == buttonMultiply) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "";
            textField.setText("");
        } else if (e.getSource() == buttonDivide) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        } else if (e.getSource() == buttonEqual) {
            secondNumber = Double.parseDouble(textField.getText());
            if (operator.equals("+")) {
                textField.setText(String.valueOf(firstNumber + secondNumber));
            } else if (operator.equals("-")) {
                textField.setText(String.valueOf(firstNumber - secondNumber));
            } else if (operator.equals("")) {
                textField.setText(String.valueOf(firstNumber * secondNumber));
            } else if (operator.equals("/")) {
                textField.setText(String.valueOf(firstNumber / secondNumber));
            }
        } else if (e.getSource() == buttonClear) {
            textField.setText("");
            firstNumber = 0;
            secondNumber = 0;
            operator = "";
        }
    }
}
