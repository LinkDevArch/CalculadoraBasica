package models;

import controllers.CrudCalculadoraController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Operaciones {

    private String resultadoString;
    private CrudCalculadoraController calculadoraController;

    public Operaciones() {
    }

    public Operaciones(String resultadoString, CrudCalculadoraController calculadoraController) {
        this.resultadoString = resultadoString;
        this.calculadoraController = calculadoraController;
    }

    public void setCalculadoraController(CrudCalculadoraController calculadoraController) {
        this.calculadoraController = calculadoraController;
    }

    public String imprimirResultado() {
        for (String elemento : calculadoraController.numeros)
            System.out.println(elemento);
        for (Character elemento : calculadoraController.simbolos)
            System.out.println(elemento);

        ArrayList<Double> numeros = new ArrayList<>();

        for (String elemento : calculadoraController.numeros) {
            numeros.add(Double.parseDouble(elemento));
        }

        double resultado=numeros.get(0);

        int j = 1;
        for (int i = 1; i < numeros.size(); i++) {
            char simbolo = calculadoraController.simbolos.get(j - 1);

            switch (simbolo) {
                case '+':
                    resultado += numeros.get(i);
                    break;
                case '-':
                    resultado -= numeros.get(i);
                    break;
                case '*':
                    resultado *= numeros.get(i);
                    break;
                case '/':
                    if (numeros.get(i) == 0) {
                        throw new ArithmeticException("División por cero no permitida.");
                    }
                    resultado /= numeros.get(i);
                    break;
                default:
                    throw new IllegalArgumentException("Operador no reconocido: " + simbolo);
            }
            j++;
        }
        resultadoString=String.valueOf(resultado);
        return resultadoString;
    }

} 
