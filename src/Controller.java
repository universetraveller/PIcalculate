import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Controller implements ActionListener {
    Swing mvc;
    public void setSwing(Swing mvc){
        this.mvc = mvc;
    }
    public void actionPerformed(ActiveEvent e){

    }
    public void actionPerformed(ActionEvent e) {
        try {
            int v0 = Integer.parseInt(mvc.text0.getText().trim());
            int v1 = Integer.parseInt(mvc.text1.getText().trim());
            int v2 = Integer.parseInt(mvc.text2.getText().trim());
            mvc.model.setN(v0);
            mvc.model.setEnterPr(v1);
            mvc.model.setEnterPr1(v2);
            String result = String.valueOf(mvc.model.getPi());
            String timeR = String.valueOf(mvc.model.getTime());
            mvc.showArea.append(result + "\n" + "Time consume:  " + timeR + "ms");
        }catch (Exception exp){
            mvc.showArea.append("\n"+exp);
        }
    }
}
