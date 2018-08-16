/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnalgo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class InsertionCodeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    public void backButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("Insertion sort.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
        
    }
    
     public void cInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionC.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
        
    }
        
         public void cPlusInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionCplus.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    } 
         public void javaInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionJava.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
         
         public void cSharpInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionCsharp.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
          public void fortanInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionFortan.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
          public void adaInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionAda.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
         public void pythonInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionPython.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
          public void javascriptInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionJavascript.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
          public void kotlinInsertionButtonAction(ActionEvent event)throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("codeInsertionKotlin.fxml"));
        Scene s = new Scene(p);
        Stage st =(Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(s);
        st.show();
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
