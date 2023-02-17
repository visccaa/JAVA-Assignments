import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        Frame f = new Frame("Mini Kalkulator");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        Label l1 = new Label("Rezultat");
        TextField tf3 = new TextField();

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("+", cbg, true);
        Checkbox cb2 = new Checkbox("-", cbg, false);
        Checkbox cb3 = new Checkbox("*", cbg, false);
        Checkbox cb4 = new Checkbox("/", cbg, false);

        Button b = new Button("Izracunaj");

//        Postavljanje pozicija i dimenzija komponenti:

        tf1.setBounds(50,50,150,20);
        tf2.setBounds(50, 100 , 150, 20);
        l1.setBounds(50, 225, 60, 20);
        tf3.setBounds(120, 225, 80, 20);
        cb1.setBounds(50, 150, 50, 20);
        cb2.setBounds(100, 150, 50, 20);
        cb3.setBounds(150, 150, 50, 20);
        cb4.setBounds(200, 150, 50, 20);
        b.setBounds(100, 185, 60, 20);
        f.add(tf1); f.add(tf2); f.add(l1); f.add(tf3); f.add(cb1);
        f.add(cb2); f.add(cb3); f.add(cb4); f.add(b);
        f.setSize(300, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

//      Postavljanje event handler-a za Button "Izracunaj" i postavljanje exception-a za dijelnje sa "0"

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tf1.getText());
                    double num2 = Double.parseDouble(tf2.getText());
                    double result = 0;

                    if (cb1.getState()) {
                        result = num1 + num2;
                    } else if (cb2.getState()) {
                        result = num1 - num2;
                    } else if (cb3.getState()) {
                        result = num1 * num2;
                    } else if (cb4.getState()) {
                        if (num2 == 0) {
                            throw new ArithmeticException("Dijeljenje sa 0 je nemoguce!");
                        }
                        result = num1 / num2;
                    }
                    tf3.setText(String.valueOf(result));
                } catch (NumberFormatException ex){
                    tf3.setText("Nevazeci broj");
                } catch (ArithmeticException ex){
                    tf3.setText(ex.getMessage());
                }
            }
        });
    }
}
