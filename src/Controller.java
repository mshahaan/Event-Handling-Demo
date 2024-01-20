import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle;

    private double circleXPosition;
    private double circleYPosition;

    @FXML
    private Button downButton;

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private Button upButton;

    @FXML
    void downButtonPressed(ActionEvent event) {

        System.out.println("Down");

        circle.setCenterY(circleYPosition+=10);

    }

    @FXML
    void leftButtonPressed(ActionEvent event) {

        System.out.println("Left");

        circle.setCenterX(circleXPosition-=10);

    }

    @FXML
    void rightButtonPressed(ActionEvent event) {

        System.out.println("Right");

        circle.setCenterX(circleXPosition+=10);

    }

    @FXML
    void upButtonPressed(ActionEvent event) {

        System.out.println("Up");

        circle.setCenterY(circleYPosition-=10);

    }

}
