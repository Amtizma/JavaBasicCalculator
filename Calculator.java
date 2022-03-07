package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator {
    static JFrame Calculator = new JFrame("Calculator");
    JPanel MainPanel;
    JFormattedTextField TextBox;
    JButton Button1;
    JButton Button2;
    JButton Button3;
    JButton ButtonPlus;
    JButton Button4;
    JButton Button5;
    JButton Button6;
    JButton ButtonMinus;
    JButton Button7;
    JButton Button8;
    JButton Button9;
    JButton ButtonMultiply;
    JButton ButtonSquareRoot;
    JButton Button0;
    JButton ButtonComma;
    JButton ButtonDivide;
    JButton ButtonEqual;
    JButton ButtonClear;
    JButton ButtonSquare;
    JButton ButtonModulo;
    JPanel TextPanel;
    JPanel Row1Panel;
    JPanel Row2Panel;
    JPanel Row3Panel;
    JPanel Row4Panel;
    JPanel Row5Panel;
    JFormattedTextField ResultBox;
    int operation = 0;
    Double firstNumber = 0.0;
    Double secondNumber = 0.0;
    Double result = 0.0;
    public Calculator() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '1');
                ResultBox.setText("");
            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '2');
                ResultBox.setText("");
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '3');
                ResultBox.setText("");
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '4');
                ResultBox.setText("");
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '5');
                ResultBox.setText("");
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '6');
                ResultBox.setText("");
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '7');
                ResultBox.setText("");
            }

        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '8');
                ResultBox.setText("");
            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextBox.setText(TextBox.getText() + '9');
                ResultBox.setText("");
            }
        });
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(TextBox.getText().equals(""))
                {
                    TextBox.setText("0.");
                }
                else TextBox.setText(TextBox.getText() + '0');
                ResultBox.setText("");
            }
        });
        ButtonComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextBox.getText().equals("")) {
                    ResultBox.setText("The number can't start with a comma");
                } else {
                    if (TextBox.getText().contains(".")) {
                        ResultBox.setText("You can have only one comma");
                    } else TextBox.setText(TextBox.getText() + '.');
                }
            }
        });
        TextBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                TextBox.setEditable(false);
            }
        });
        ButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = 1;
                    firstNumber = Double.parseDouble(TextBox.getText());
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = 2;
                    firstNumber = Double.parseDouble(TextBox.getText());
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = 3;
                    firstNumber = Double.parseDouble(TextBox.getText());
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = 4;
                    firstNumber = Double.parseDouble(TextBox.getText());
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonModulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = 5;
                    firstNumber = Double.parseDouble(TextBox.getText());
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    firstNumber = Double.parseDouble(TextBox.getText());
                    ResultBox.setText("" + firstNumber * firstNumber);
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    firstNumber = Double.parseDouble(TextBox.getText());
                    ResultBox.setText("" + Math.sqrt(firstNumber));
                    TextBox.setText("");
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
        ButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TextBox.setText("");
            ResultBox.setText("");
            }
        });
        ResultBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                ResultBox.setEditable(false);
            }
        });
        ButtonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    secondNumber = Double.parseDouble(TextBox.getText());
                    if (operation == 1) {
                        result = firstNumber + secondNumber;
                        ResultBox.setText("" + result);
                        TextBox.setText("");
                    }
                    if (operation == 2) {
                        result = firstNumber - secondNumber;
                        ResultBox.setText("" + result);
                        TextBox.setText("");
                    }
                    if (operation == 3) {
                        result = firstNumber * secondNumber;
                        ResultBox.setText("" + result);
                        TextBox.setText("");
                    }
                    if (operation == 4) {
                        result = firstNumber / secondNumber;
                        ResultBox.setText("" + result);
                        TextBox.setText("");
                    }
                    if (operation == 5) {
                        result = firstNumber % secondNumber;
                        ResultBox.setText("" + result);
                        TextBox.setText("");
                    }
                }
                catch (NumberFormatException ex)
                {
                    ResultBox.setText("You must introduce a number. ");
                }
            }
        });
    }

    public static void Initialize(){
        Calculator.setContentPane(new Calculator().MainPanel);
        Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculator.pack();
        Calculator.setVisible(true);
    }
    public static void main(String[] args) {
        Initialize();
    }

}
