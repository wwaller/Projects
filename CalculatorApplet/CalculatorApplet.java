package calculatorclass;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class CalculatorApplet extends Applet {
    final int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    final int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
    
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bPlus, bMinus, 
            bTimes, bDivided, bMod, bExp, bClear;
    
    //0 = addition; 1 = subtraction; 2 = multiplication; 3 = division;
    //4 = mod; 5 = exponentiation
    int operatorState;
    double total = 0;

    public void init() {
        setLayout(new GridLayout(3,3));
        resize(screenWidth/6, screenHeight/5);
        
        JFrame operatorTable = new JFrame();
        operatorTable.setLayout(new GridLayout(7,1));
        operatorTable.setSize(100,400);
        operatorTable.setBounds(screenWidth/6 + 50, 0, screenWidth/10, screenHeight/4);
        
        //Begin adding operator buttons
        operatorTable.add(bPlus = new Button("+"));
        bPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorState = 0;
            }
        });
        
        operatorTable.add(bMinus = new Button("-"));
        bMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorState = 1;
            }
        });
        
        operatorTable.add(bTimes = new Button("*"));
        bTimes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorState = 2;
            }
        });
        
        operatorTable.add(bDivided = new Button("/"));
        bDivided.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorState = 3;
            }
        });
        
        operatorTable.add(bMod = new Button("%"));
        bMod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorState = 4;
            }
        });
        
        operatorTable.add(bExp = new Button("^"));
        bExp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorState = 5;
            }
        });
        
        operatorTable.add(bClear = new Button("Reset"));
        bClear.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               total = 0;
           } 
        });
        
        //Begin adding # buttons
        add(b1 = new Button("1"));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 1.0;
                        break;
                    case 1: total -= 1.0;
                        break;
                    case 2: total *= 1.0;
                        break;
                    case 3: total /= 1.0;
                        break;
                    case 4: total %= 1.0;
                        break;
                    case 5: total = Math.pow(total, 1.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b2 = new Button("2"));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 2.0;
                        break;
                    case 1: total -= 2.0;
                        break;
                    case 2: total *= 2.0;
                        break;
                    case 3: total /= 2.0;
                        break;
                    case 4: total %= 2.0;
                        break;
                    case 5: total = Math.pow(total, 2.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b3 = new Button("3"));
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 3.0;
                        break;
                    case 1: total -= 3.0;
                        break;
                    case 2: total *= 3.0;
                        break;
                    case 3: total /= 3.0;
                        break;
                    case 4: total %= 3.0;
                        break;
                    case 5: total = Math.pow(total, 3.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b4 = new Button("4"));
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 4.0;
                        break;
                    case 1: total -= 4.0;
                        break;
                    case 2: total *= 4.0;
                        break;
                    case 3: total /= 4.0;
                        break;
                    case 4: total %= 4.0;
                        break;
                    case 5: total = Math.pow(total, 4.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b5 = new Button("5"));
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 5.0;
                        break;
                    case 1: total -= 5.0;
                        break;
                    case 2: total *= 5.0;
                        break;
                    case 3: total /= 5.0;
                        break;
                    case 4: total %= 5.0;
                        break;
                    case 5: total = Math.pow(total, 5.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b6 = new Button("6"));
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 6.0;
                        break;
                    case 1: total -= 6.0;
                        break;
                    case 2: total *= 6.0;
                        break;
                    case 3: total /= 6.0;
                        break;
                    case 4: total %= 6.0;
                        break;
                    case 5: total = Math.pow(total, 6.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b7 = new Button("7"));
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 7.0;
                        break;
                    case 1: total -= 7.0;
                        break;
                    case 2: total *= 7.0;
                        break;
                    case 3: total /= 7.0;
                        break;
                    case 4: total %= 7.0;
                        break;
                    case 5: total = Math.pow(total, 7.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b8 = new Button("8"));
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 8.0;
                        break;
                    case 1: total -= 8.0;
                        break;
                    case 2: total *= 8.0;
                        break;
                    case 3: total /= 8.0;
                        break;
                    case 4: total %= 8.0;
                        break;
                    case 5: total = Math.pow(total, 8.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        
        add(b9 = new Button("9"));
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (operatorState) {
                    case 0: total += 9.0;
                        break;
                    case 1: total -= 9.0;
                        break;
                    case 2: total *= 9.0;
                        break;
                    case 3: total /= 9.0;
                        break;
                    case 4: total %= 9.0;
                        break;
                    case 5: total = Math.pow(total, 9.0);
                        break;
                }
                showStatus("Total: " + total + ". Operator: " + operatorState);
            }
        });
        //End adding # Buttons
        
        operatorTable.setVisible(true);
    }
}
