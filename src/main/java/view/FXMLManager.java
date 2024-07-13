package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public enum FXMLManager {

    MAIN_MENU("FXML/main.fxml");



    private String address;

    FXMLManager(String address) {
        this.address = address;
    }

    public Pane load() {
        URL url = MainMenu.class.getResource(address);
        assert url != null;
        try {
            return FXMLLoader.load(url);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
