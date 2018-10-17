package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Optional;

public class Controller {
    @FXML
    TextField Word, word_explain;
    @FXML
    Button Click, Output, Add;


    public void Clicked(ActionEvent event) {

                try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Dic.txt", true)))){
                    out.println(Word.getText());
                }catch (Exception ioe){
                    System.out.println("falied");
                    ioe.printStackTrace();
                }
            }

    public void Clicked2(ActionEvent  event){
        try {word_explain.setText(Word.getText());

        }catch (Exception e){
            System.out.println("hic lại false");

        }
    }
    @FXML
    public void click_add(ActionEvent event){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("Add.fxml"));
            Parent parent = fxmlLoader.load();
            //Node node = (Node) event.getSource();
            //Stage stage = (Stage) node.getScene().getWindow();
            //stage.setScene(new Scene(addfxml));
            AddController dialogController = fxmlLoader.<AddController>getController();
            Scene scene = new Scene(parent, 300, 200);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        }
        catch (Exception E){
            System.out.println(" False");
        }
    }

}




