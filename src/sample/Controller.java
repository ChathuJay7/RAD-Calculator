package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label sign;

    @FXML
    private Button add;

    @FXML
    private Button sub;

    @FXML
    private Button mul;

    @FXML
    private Button div;

    @FXML
    private Label answer;

    @FXML
    private Button resetBtn;

    @FXML
    private Button gotoScene2;

    @FXML
    void addition(ActionEvent event) {
        String n1 = num1.getText();
        String n2 = num2.getText();

        if(n1.trim().isEmpty() || n2.trim().isEmpty())
        {
            answer.setText("Please input a values");
        }

        try
        {
            double number1 = Double.parseDouble(n1);
            double number2 = Double.parseDouble(n2);
            double result = (number1 + number2);
            String ans = Double.toString(result);
            sign.setText("+");
            answer.setText(ans);
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a numbers!");
        }

    }

    @FXML
    void division(ActionEvent event) {
        String n1 = num1.getText();
        String n2 = num2.getText();

        if(n1.trim().isEmpty() || n2.trim().isEmpty())
        {
            answer.setText("Please input a values");
        }

        try
        {
            double number1 = Double.parseDouble(n1);
            double number2 = Double.parseDouble(n2);
            double result = (number1 / number2);
            String ans = Double.toString(result);
            sign.setText("/");
            answer.setText(ans);
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a numbers!");
        }

    }

    @FXML
    void multipication(ActionEvent event) {
        String n1 = num1.getText();
        String n2 = num2.getText();

        if(n1.trim().isEmpty() || n2.trim().isEmpty())
        {
            answer.setText("Please input a values");
        }

        try
        {
            double number1 = Double.parseDouble(n1);
            double number2 = Double.parseDouble(n2);
            double result = (number1 * number2);
            String ans = Double.toString(result);
            sign.setText("×");
            answer.setText(ans);
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a numbers!");
        }

    }

    @FXML
    void subtraction(ActionEvent event) {
        String n1 = num1.getText();
        String n2 = num2.getText();

        if(n1.trim().isEmpty() || n2.trim().isEmpty())
        {
            answer.setText("Please input a values");
        }

        try
        {
            double number1 = Double.parseDouble(n1);
            double number2 = Double.parseDouble(n2);
            double result = (number1 - number2);
            String ans = Double.toString(result);
            sign.setText("-");
            answer.setText(ans);
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a numbers!");
        }

    }

    @FXML
    void reset(ActionEvent event) {
        num1.clear();
        num2.clear();
        sign.setText("");
        answer.setText("Answer Goes Here...");
    }

    @FXML
    void loadScene2(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    //Scene2

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField value;

    @FXML
    private Label ans;

    @FXML
    private Button sinBtn;

    @FXML
    private Button cosBtn;

    @FXML
    private Button tanBtn;

    @FXML
    private Button exponentialBtn;

    @FXML
    private Button gotoScene1;

    @FXML
    private Button clearBtn;

    @FXML
    void loadScene1(ActionEvent event) throws IOException{
        AnchorPane rootPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pane.getChildren().setAll(rootPane);
    }

    @FXML
    void toCos(ActionEvent event) {
        String radians = value.getText();

        if(radians.trim().isEmpty())
        {
            ans.setText("Please input a value");
        }

        try
        {
            value.setText("cos(" + radians + ")");
            double rad = Double.parseDouble(radians);
            double convert = Math.cos(rad);
            String s = Double.toString(convert);
            ans.setText(s);
        }
        catch (NumberFormatException e)
        {
            ans.setText("Please enter number!");
        }

    }

    @FXML
    void toExponentioal(ActionEvent event) {
        String exponential = value.getText();
        if(exponential.trim().isEmpty())
        {
            ans.setText("Please input a value");
        }

        try
        {
            value.setText("exp(" + exponential + ")");
            double expo= Double.parseDouble(exponential);
            double convert = Math.exp(expo);
            String s = Double.toString(convert);
            ans.setText(s);
        }
        catch (NumberFormatException e)
        {
            ans.setText("Please enter number!");
        }

    }

    @FXML
    void toSin(ActionEvent event) {
        String radians = value.getText();

        if(radians.trim().isEmpty())
        {
            ans.setText("Please input a value");
        }

        try
        {
            value.setText("sin(" + radians + ")");
            double rad = Double.parseDouble(radians);
            double convert = Math.sin(rad);
            String s = Double.toString(convert);
            ans.setText(s);
        }
        catch (NumberFormatException e)
        {
            ans.setText("Please enter number!");
        }

    }

    @FXML
    void toTan(ActionEvent event) {
        String radians = value.getText();

        if(radians.trim().isEmpty())
        {
            ans.setText("Please input a value");
        }

        try
        {
            value.setText("tan(" + radians + ")");
            double rad = Double.parseDouble(radians);
            double convert = Math.tan(rad);
            String s = Double.toString(convert);
            ans.setText(s);
        }
        catch (NumberFormatException e)
        {
            ans.setText("Please enter number!");
        }

    }

    @FXML
    void clear(ActionEvent event) {
        value.clear();
        ans.setText("Answer Goes Here...");
    }


    @FXML
    void initialize() {
        assert num1 != null : "fx:id=\"num1\" was not injected: check your FXML file 'sample.fxml'.";
        assert num2 != null : "fx:id=\"num2\" was not injected: check your FXML file 'sample.fxml'.";
        assert sign != null : "fx:id=\"sign\" was not injected: check your FXML file 'sample.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'sample.fxml'.";
        assert sub != null : "fx:id=\"sub\" was not injected: check your FXML file 'sample.fxml'.";
        assert mul != null : "fx:id=\"mul\" was not injected: check your FXML file 'sample.fxml'.";
        assert div != null : "fx:id=\"div\" was not injected: check your FXML file 'sample.fxml'.";
        assert answer != null : "fx:id=\"answer\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
