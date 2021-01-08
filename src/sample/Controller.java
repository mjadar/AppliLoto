package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML private Button Gbtn;
    private int maxVal= 50 ;
    @FXML private Label v1;
    @FXML private Label v2;
    @FXML private Label v3;
//    private int minVal= 1;

    @FXML public void CheckNumbers(){
        int val1 = new Random().nextInt(51);
        int val2 = new Random().nextInt(51);
        int val3 = new Random().nextInt(51);
        v1.setText(""+val1);
        v2.setText(""+val2);
        v3.setText(""+val3);



    }
}
