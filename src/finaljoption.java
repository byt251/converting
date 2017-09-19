// Author : Bethlehem Teshome
//JOptionPane: cm to inch and feet converter
// 09/18/2017
import java.text.DecimalFormat;
import java.lang.String;
import java.awt.Toolkit;
import javax.swing.JDialog;
import java.awt.Dimension;
import javax.swing.JOptionPane;
public class finaljoption {
    public static void main(String[]args){
        DecimalFormat f = new DecimalFormat ("0.0");
        String strcm ="";
        double dblcm, dblin, dblft, dblinrow;
        int ScreenWidth,ScreenHeight;
        strcm=JOptionPane.showInputDialog("enter your height in centimeter");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        ScreenWidth = (int) dimension.getWidth();
        ScreenHeight= (int) dimension.getHeight();
        JOptionPane pane = new JOptionPane("Enter your height in centimeter");
        JDialog dialog;
        pane.setWantsInput(true);
        dialog=pane.createDialog("centimeter to feet converter");

        String input =(String)pane.getInputValue();
        double height = 0;

        dialog.setLocation(0,300);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);


        dblcm=Double.parseDouble(strcm);
        dblinrow=dblcm*0.3937008;
        dblft=dblinrow/12;
        dblin=dblinrow%12;
        int ftreal=(int)dblft;



        JOptionPane.showMessageDialog(null,"you are "+ftreal + " feet " + "and " + f.format(dblin) +" inches");

        JOptionPane resultpane = new JOptionPane("You are " + ftreal + " feet" + " and " +f.format(dblin)+ " inches");
        JDialog resultDialog;
        resultDialog=resultpane.createDialog("Result");
        resultDialog.setLocation(0,0);

        resultDialog.setAlwaysOnTop(true);
        resultDialog.setVisible(true);

    }
}
