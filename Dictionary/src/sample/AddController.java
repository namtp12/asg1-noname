package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddController{
    @FXML
    TextField add_word, add_explain;
    @FXML
    Button OK;

    public void add_clickOK(ActionEvent event){
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Dic.txt", true)))){
            out.println(add_word.getText());
            out.println(add_explain.getText());
            close(event);
        }catch(Exception E){
            System.out.println("false");
        }

    }
    public void close(ActionEvent event){
        Node soure = (Node) event.getSource();
        Stage stage = (Stage) soure.getScene().getWindow();
        stage.close();
    }



}
