package pe.edu.upeu.asistencia.control;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Controller;



@Controller
public class MainguiController {

    @FXML
    private BorderPane bp;
    @FXML
    MenuBar menuBar;
    @FXML
    TabPane tabPane;
    @FXML
    MenuItem menuItem1, menuItemC;

    @FXML
    public void initialize(){

    }

    class MenuItemListener{
        public void handle(ActionEvent e){

        }
        private void abrirTabPaneFXML(String fxmlPath, String tittle){
            try {

            }catch (Exception ex){
                
            }
        }


    }

    class MenuListener{
        public void handle(Event e){

        }
    }

}
