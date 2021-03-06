package Controllers;

/**
 * """"""NEEDS EXPLAINATION"""""""
 *
 * @author Brody
 *
 * Last updated 10/20/20
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class RecipeSceneController implements Initializable {

    @FXML
    private WebView webView;
    @FXML
    private WebEngine webEngine;
    @FXML
    private Button saveButton;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     *
     * @param _url
     * @param _rb
     */
    @Override
    public void initialize(URL _url, ResourceBundle _rb) {
        webEngine = webView.getEngine();
        webEngine.load("https://www.google.com/");
    }

    @FXML
    private void back(ActionEvent _event) throws IOException {
        Parent infoParent = FXMLLoader.load(getClass().getResource("/Views/HomeScene.fxml"));
        Scene infoScene = new Scene(infoParent);

        Stage window = (Stage) ((Node) _event.getSource()).getScene().getWindow();

        window.setScene(infoScene);
        window.show();
    }
}
