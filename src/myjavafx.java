// Author : Bethlehem Teshome
//JavaFX: cm to inch and feet converter
// 09/18/2017
import java.text.DecimalFormat;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Optional;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.application.Application;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;

public class myjavafx extends Application{
    public void start(Stage primaryStage){
        DecimalFormat f= new DecimalFormat("0.0");
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension ScreenDimension=toolkit.getScreenSize();
        double dblcm, dblin, dblft, dblinrow;
        double ScreenWidth = ScreenDimension.getWidth();
        double ScreenHeight=ScreenDimension.getHeight();

        TextInputDialog inputDialog=new TextInputDialog();
        inputDialog.setTitle("Enter value");
        inputDialog.setHeaderText("Height centimeter to feet and inches converter");
        inputDialog.setHeaderText("Enter your height in centimeters");
        inputDialog.setX(600); // to set the dialog box on the center top
        inputDialog.setY(0);
        Optional<String> result= inputDialog.showAndWait();

        dblcm=Double.parseDouble(result.get());
        dblinrow=dblcm*0.3937008; //i converted the centimeter to inches first
        dblft=dblinrow/12; //the inches is divided by the feet
        dblin=dblinrow%12;// we take the remainder and that gives us the inch that we want to tell our user
        int ftreal=(int)dblft; //then we use the type casting method to take the integer from the double number

        //double height = Double.parseDouble(result.get());
        //double heightfeet=height*0.0328084;


        Alert alert = new Alert (AlertType.INFORMATION);
        alert.getDialogPane().setPrefSize(300,300);
        alert.setTitle("Height");
        alert.setContentText("Your height is " + ftreal + " feet and " + f.format(dblin) +" inches" );
        alert.setX(ScreenWidth-alert.getDialogPane().getPrefWidth());
        alert.setY(ScreenHeight-alert.getDialogPane().getPrefHeight());
        alert.showAndWait();


    }
}
