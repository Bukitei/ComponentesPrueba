package dad.javafx.objects;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import dad.javafx.componentes.ButtonBill;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Bill  extends RecursiveTreeObject<Bill>{

	private StringProperty id = new SimpleStringProperty();
	private StringProperty date = new SimpleStringProperty();
	private StringProperty name = new SimpleStringProperty();
	private StringProperty conditions = new SimpleStringProperty();
	private StringProperty state = new SimpleStringProperty();
	private ObjectProperty<ButtonBill> buttons = new SimpleObjectProperty<ButtonBill>();
	
	public Bill(String id, String date, String name, String conditions, String state, ButtonBill buttons) {
		
		setId(id);
		setDate(date);
		setName(name);
		setConditions(conditions);
		setState(state);
		setButtons(buttons);
		//Le establecemos todos los datos
	}

	public final StringProperty idProperty() {
		return this.id;
	}
	

	public final String getId() {
		return this.idProperty().get();
	}
	

	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	

	public final StringProperty dateProperty() {
		return this.date;
	}
	

	public final String getDate() {
		return this.dateProperty().get();
	}
	

	public final void setDate(final String date) {
		this.dateProperty().set(date);
	}
	

	public final StringProperty nameProperty() {
		return this.name;
	}
	

	public final String getName() {
		return this.nameProperty().get();
	}
	

	public final void setName(final String name) {
		this.nameProperty().set(name);
	}
	

	public final StringProperty conditionsProperty() {
		return this.conditions;
	}
	

	public final String getConditions() {
		return this.conditionsProperty().get();
	}
	

	public final void setConditions(final String conditions) {
		this.conditionsProperty().set(conditions);
	}
	

	public final StringProperty stateProperty() {
		return this.state;
	}
	

	public final String getState() {
		return this.stateProperty().get();
	}
	

	public final void setState(final String state) {
		this.stateProperty().set(state);
	}
	

	public final ObjectProperty<ButtonBill> buttonsProperty() {
		return this.buttons;
	}
	

	public final ButtonBill getButtons() {
		return this.buttonsProperty().get();
	}
	

	public final void setButtons(final ButtonBill buttons) {
		this.buttonsProperty().set(buttons);
	}
	
	
	
	
	
}
