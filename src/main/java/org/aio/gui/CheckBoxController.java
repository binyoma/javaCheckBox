package org.aio.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class CheckBoxController {

    public TextField textField;
    public Label label1;
    public CheckBox fondCheckBox;
    public CheckBox textCheckBox;
    public CheckBox casseCheckBox;
    public RadioButton FondRougeRadio;
    public RadioButton fondVertradio;
    public RadioButton fondBleuRadio;
    public RadioButton textRougeRadio;
    public RadioButton textBlancRadio;
    public RadioButton textNoirRadio;
    public RadioButton casseMinusculeRadio;
    public RadioButton casseMajusculeRadio;
    public VBox choiceVbox;
    public VBox fondRadioVbox;
    public VBox textRadioVbox;
    public VBox casseRadioVbox;
    public String content;
    public String style;
    public ToggleGroup grpCasse;
    public ToggleGroup grpText;
    public ToggleGroup grpFond;


    public void loadLabel1(KeyEvent keyEvent) {

        content = textField.getText();
        label1.setText(content);
        if (! content.isEmpty()){
            choiceVbox.setVisible(true);
        }else {
            choiceVbox.setVisible(false);
            fondRadioVbox.setVisible(false);
            textRadioVbox.setVisible(false);
            casseRadioVbox.setVisible(false);
        }
    }


    public void handleColor(ActionEvent actionEvent) {

        style ="";
        if (fondCheckBox.isSelected()){
            fondRadioVbox.setVisible(true);
            if (FondRougeRadio.isSelected()){
                style += "-fx-background-color: red;";
            }
            if (fondVertradio.isSelected()){
                style += "-fx-background-color: green;";
            }
            if (fondBleuRadio.isSelected()){
                style += "-fx-background-color: blue;";
            }
        }else {
            fondRadioVbox.setVisible(false);
            FondRougeRadio.setSelected(false);
            fondVertradio.setSelected(false);
            fondBleuRadio.setSelected(false);
        }

        if (textCheckBox.isSelected()){
            textRadioVbox.setVisible(true);
            if (textRougeRadio.isSelected()){
                style += "-fx-text-fill: red ;";
            }
            if (textBlancRadio.isSelected()){
                style += "-fx-text-fill: white ;";
            }
            if (textNoirRadio.isSelected()){
                style += "-fx-text-fill: black ;";
            }
        }else {
            textRadioVbox.setVisible(false);
            textRougeRadio.setSelected(false);
            textBlancRadio.setSelected(false);
            textNoirRadio.setSelected(false);
        }

        if (casseCheckBox.isSelected()){
            casseRadioVbox.setVisible(true);
            if (casseMajusculeRadio.isSelected()){
                label1.setText(content.toUpperCase());
            }
            if (casseMinusculeRadio.isSelected()){
                label1.setText(content.toLowerCase());
            }
        }else {
            casseRadioVbox.setVisible(false);
            casseMinusculeRadio.setSelected(false);
            casseMajusculeRadio.setSelected(false);
        }
            label1.setStyle(style);
    }

}
