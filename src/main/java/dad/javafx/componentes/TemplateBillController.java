package dad.javafx.componentes;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTreeTableView;

import dad.javafx.objects.Bill;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class TemplateBillController implements Initializable{

	// FXML

	  @FXML
	    private VBox view;

	    @FXML
	    private JFXButton add;

	    @FXML
	    private JFXComboBox<String> filter;

	    @FXML
	    private Label tittle;

	    @FXML
	    private TableView<Bill> billTable;


	// Modelo

	StringProperty tittleLbl =  new SimpleStringProperty(); //El titulo del componente
	ObservableList<String> filterCmb = FXCollections.observableArrayList("Ejemplo1", "Ejemplo2"); //El contenido del Combobox
	private ObservableList<Bill> billList = FXCollections.observableArrayList(new ArrayList<Bill>());
	private ListProperty<Bill> billLst =  new SimpleListProperty<Bill>(billList);
	//Lista para un tableview normal, ya hecho el objeto
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Tienen dos opciones, o cambian el JFXTableView por un TableView normal para la prueba o
		//hacen lo que sale en este video con cada fila
		
		tittle.textProperty().bindBidirectional(tittleLbl);
		filter.setItems(filterCmb);
		filter.setValue("Filtro");
		
		billTable.itemsProperty().bind(billLst);
		
	}
	
	public TemplateBillController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TemplateView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public VBox getView() {
		return view;
	}

	public final ListProperty<Bill> billLstProperty() {
		return this.billLst;
	}
	

	public final ObservableList<Bill> getBillLst() {
		return this.billLstProperty().get();
	}
	

	public final void setBillLst(final ObservableList<Bill> billLst) {
		this.billLstProperty().set(billLst);
	}

	public final StringProperty tittleLblProperty() {
		return this.tittleLbl;
	}
	

	public final String getTittleLbl() {
		return this.tittleLblProperty().get();
	}
	

	public final void setTittleLbl(final String tittleLbl) {
		this.tittleLblProperty().set(tittleLbl);
	}
	
	
	
	
}
