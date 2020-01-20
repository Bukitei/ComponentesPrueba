package dad.javafx.componentes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import javafx.fxml.Initializable;

public class ButtonBill implements Initializable{
	
	//FXML
	
	@FXML
    private HBox view;

    @FXML
    private Button viewBttn;

    @FXML
    private Button editBttn;

    @FXML
    private Button deleteBttn;
	
	//model
    
    public StringProperty id = new SimpleStringProperty();
    
    public ButtonBill() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/JugadoresFXML.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public HBox getView() {
		return view;
	}

}
