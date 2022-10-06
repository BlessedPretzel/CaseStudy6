package se233.chapter5_tdd.model;

import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.control.Label;

public class Score {
    private int score;
    private Label scoreLabel;

    public Score() {
        this.score = 0;
        this.scoreLabel = new Label("0");
        this.scoreLabel.setAlignment(Pos.TOP_RIGHT);
        this.scoreLabel.setFont(Font.font("Consolas",30));
    }

    public Label getScoreLabel() {
        return scoreLabel;
    }

    public void plusOne() {
        this.score++;
        this.scoreLabel.setText(String.valueOf(this.score));
    }

    public void plusFive() {
        this.score+=5;
        this.scoreLabel.setText(String.valueOf(this.score));
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getValue() {
        return score;
    }
}
