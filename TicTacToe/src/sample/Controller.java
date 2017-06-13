package sample;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Canvas canvas;

    @FXML
    private Label label11;
    @FXML
    private Label label12;
    @FXML
    private Label label13;
    @FXML
    private Label label21;
    @FXML
    private Label label22;
    @FXML
    private Label label23;
    @FXML
    private Label label31;
    @FXML
    private Label label32;
    @FXML
    private Label label33;
    @FXML
    private Label resultsLabel;
    @FXML
    private Button newGame;
    @FXML
    private Group group;

    private int counter = 0;
    private boolean playable = true;
    private int xScore = 0;
    private int yScore = 0;
    private String current;
    private Line line = new Line();

    @FXML
    void initialize() {
        handle();
    }

    void handle() {
        label11.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label11);
                check();
            }
        });
        label12.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label12);
                check();
            }
        });
        label13.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label13);
                check();
            }
        });
        label21.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label21);
                check();
            }
        });
        label22.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label22);
                check();
            }
        });
        label23.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label23);
                check();
            }
        });
        label31.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label31);
                check();
            }
        });
        label32.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label32);
                check();
            }
        });
        label33.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label33);
                check();
            }
        });
        newGame.setOnMouseClicked(event -> {
            Label lblArr[][] = {{label11, label12, label13}, {label21, label22, label23}, {label31, label32, label33}};
            for (int i = 0; i < lblArr.length; i++) {
                for (int j = 0; j < lblArr[i].length; j++) {
                    lblArr[i][j].setText("");
                }
            }
            playable = true;
            counter = 0;
            group.getChildren().remove(line);
        });
    }

    void draw(Label lbl) {
        if (counter % 2 == 0) {
            lbl.setText("O");
            current = "O";
        } else {
            lbl.setText("X");
            current = "X";
        }
    }

    void drawLine(double start1, double start2, double end1, double end2) {
        line.setStartX(start1);
        line.setStartY(start2);
        line.setEndX(end1);
        line.setEndY(end2);
        line.setStroke(Color.RED);
        line.setStrokeWidth(3);
        group.getChildren().add(line);
    }

    void check() {
        if (counter >= 5) {
            if (label11.getText().equals(current) && label12.getText().equals(current) && label13.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(100,100,500,100);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label21.getText().equals(current) && label22.getText().equals(current) && label23.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(100,300,500,300);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label31.getText().equals(current) && label32.getText().equals(current) && label33.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(100,500,500,500);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label11.getText().equals(current) && label21.getText().equals(current) && label31.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(100,100,100,500);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label12.getText().equals(current) && label22.getText().equals(current) && label32.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(300,100,300,500);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label13.getText().equals(current) && label23.getText().equals(current) && label33.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(500,100,500,500);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label11.getText().equals(current) && label22.getText().equals(current) && label33.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(100,100,500,500);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (label13.getText().equals(current) && label22.getText().equals(current) && label31.getText().equals(current)) {
                if (current.equals("X")) {
                    xScore++;
                } else {
                    yScore++;
                }
                drawLine(500,100,100,500);
                resultsLabel.setText(String.format("%s WINS\n   %d : %d", current, xScore, yScore));
                playable = false;
            } else if (counter == 9) {
                resultsLabel.setText(String.format("DRAW\n   %d : %d", xScore, yScore));
            }
        }

        if (counter == 9) {
            resultsLabel.setText(String.format("DRAW\n   %d : %d", xScore, yScore));
        }
    }
}








