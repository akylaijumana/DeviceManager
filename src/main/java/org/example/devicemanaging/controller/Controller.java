package org.example.devicemanaging.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import org.example.devicemanaging.model.*;

public class Controller {
    @FXML
    private ListView<Device> listView;
    @FXML
    private TextField nameField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField weightField;
    @FXML
    private RadioButton Laptop;
    @FXML
    private RadioButton Smartphone;
    @FXML
    private RadioButton Tablet;
    private ObservableList<Device> deviceList = FXCollections.observableArrayList();
    @FXML
    public void initialize() {
        listView.setItems(deviceList);
    }
    @FXML
    public void onAddButtonClicked(ActionEvent event) {
        if (Smartphone.isSelected()) {
            org.example.devicemanaging.model.Smartphone sm = new Smartphone();
            sm.setName(nameField.getText());
            sm.setDeviceType(DeviceType.SMARTPHONE);
            sm.setPrice(Double.parseDouble(priceField.getText()));
            sm.setWeight(Double.parseDouble(weightField.getText()));
            deviceList.add(sm);
        } else if (Laptop.isSelected()) {
            org.example.devicemanaging.model.Laptop laptop = new Laptop();
            laptop.setName(nameField.getText());
            laptop.setDeviceType(DeviceType.LAPTOP); // Ensure you have LAPTOP in DeviceType enum
            laptop.setPrice(Double.parseDouble(priceField.getText()));
            laptop.setWeight(Double.parseDouble(weightField.getText()));
            deviceList.add(laptop);
        } else if (Tablet.isSelected()) {
            org.example.devicemanaging.model.Tablet tablet = new Tablet();
            tablet.setName(nameField.getText());
            tablet.setDeviceType(DeviceType.TABLET); // Ensure you have TABLET in DeviceType enum
            tablet.setPrice(Double.parseDouble(priceField.getText()));
            tablet.setWeight(Double.parseDouble(weightField.getText()));
            deviceList.add(tablet);
        }
        nameField.clear();
        priceField.clear();
        weightField.clear();
        Smartphone.setSelected(false);
        Laptop.setSelected(false);
        Tablet.setSelected(false);

    }

    @FXML
    public void onRemoveButtonClicked() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        deviceList.remove(selectedDevice);
        nameField.clear();
        priceField.clear();
        weightField.clear();
        Smartphone.setSelected(false);
        Laptop.setSelected(false);
        Tablet.setSelected(false);
    }

    @FXML
    public void onListClicked(MouseEvent event) {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            nameField.setText(selectedDevice.getName());
            priceField.setText(String.valueOf(selectedDevice.getPrice()));
            weightField.setText(String.valueOf(selectedDevice.getWeight()));
        }
    }

}

