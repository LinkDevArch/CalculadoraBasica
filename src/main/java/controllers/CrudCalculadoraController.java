package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.Operaciones;

import java.util.ArrayList;

public class CrudCalculadoraController {

    @FXML
    private TextField bInput;

    @FXML
    private TextField bOutput;

    public ArrayList<String> numeros = new ArrayList<>();
    public ArrayList<Character> simbolos = new ArrayList<>();

    private String textoInput="";

    @FXML
    void bAdd(ActionEvent event) {
        simbolos.add('+');
        textoInput += "+";
        bInput.setText(textoInput);
    }

    @FXML
    void bDivision(ActionEvent event) {
        simbolos.add('/');
        textoInput += "/";
        bInput.setText(textoInput);
    }

    @FXML
    void bMinus(ActionEvent event) {
        simbolos.add('-');
        textoInput += "-";
        bInput.setText(textoInput);
    }

    @FXML
    void bTimes(ActionEvent event) {
        simbolos.add('*');
        textoInput += "*";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum0(ActionEvent event) {
        textoInput += "0";
        bInput.setText(textoInput);
        numeros.add("0");
    }

    @FXML
    void bNum1(ActionEvent event) {
        textoInput += "1";
        bInput.setText(textoInput);
        numeros.add("1");
    }

    @FXML
    void bNum2(ActionEvent event) {
        numeros.add("2");
        textoInput += "2";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum3(ActionEvent event) {
        numeros.add("3");
        textoInput += "3";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum4(ActionEvent event) {
        numeros.add("4");
        textoInput += "4";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum5(ActionEvent event) {
        numeros.add("5");
        textoInput += "5";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum6(ActionEvent event) {
        numeros.add("6");
        textoInput += "6";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum7(ActionEvent event) {
        numeros.add("7");
        textoInput += "7";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum8(ActionEvent event) {
        numeros.add("8");
        textoInput += "8";
        bInput.setText(textoInput);
    }

    @FXML
    void bNum9(ActionEvent event) {
        numeros.add("9");
        textoInput += "9";
        bInput.setText(textoInput);
    }

    @FXML
    void bResultado(ActionEvent event) {

        Operaciones operaciones = new Operaciones();
        operaciones.setCalculadoraController(this);

        bOutput.setText(operaciones.imprimirResultado());

    }
}
