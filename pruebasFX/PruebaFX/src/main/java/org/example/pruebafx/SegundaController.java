package org.example.pruebafx;

import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class SegundaController {
    static ObservableList<Persona> listaPersonas = FXCollections.observableArrayList();


    @FXML
    private TableView<Persona> personasTableView;

    @FXML
    private TableColumn<Persona, String> nombreTableColum;

    @FXML
    private TableColumn<Persona, Integer> edadTableColum;

    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField edadTextField;

    @FXML
    private void initialize(){
       nombreTableColum.setCellValueFactory(datos -> new SimpleStringProperty(datos.getValue().getNombre()));
        edadTableColum.setCellValueFactory(datos -> new SimpleIntegerProperty(datos.getValue().getEdad()).asObject());
        personasTableView.setItems(listaPersonas);

    }

    public void retroceso() throws IOException {
        HelloApplication.setRoot("hello-view");
    }

    public void guardarButton(){
       String nombre = nombreTextField.getText();
       Integer edad = Integer.parseInt(edadTextField.getText());

        Persona persona = new Persona(edad, nombre);
        listaPersonas.add(persona);
        System.out.println("Persona: " + nombre + " tiene, " + edad);
        System.out.println(listaPersonas);

       nombreTextField.clear();
       edadTextField.clear();

    }
}
