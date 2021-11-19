import java.awt.*;
import javax.swing.*;
public class Swing extends JFrame {
    PiCal model;
    JTextField text0,text1,text2;
    JTextArea showArea;
    JButton button;
    Controller controller;
    Swing(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init(){
        model = new PiCal();
        text0 = new JTextField(5);
        text1 = new JTextField(5);
        text2 = new JTextField(5);
        button = new JButton("Calculate");
        showArea = new JTextArea();
        showArea.setWrapStyleWord(true);
        showArea.setLineWrap(true);
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("Loop number"));
        pNorth.add(text0);
        pNorth.add(new JLabel("Accuracy"));
        pNorth.add(text1);
        pNorth.add(new JLabel("Decimal place"));
        pNorth.add(text2);
        pNorth.add(button);
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(showArea),BorderLayout.CENTER);
        controller = new Controller();
        button.addActionListener(controller);
        controller.setSwing(this);
        validate();
    }
}
