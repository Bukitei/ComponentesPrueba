package dad.javafx.main;

import dad.javafx.componentes.ButtonBill;
import dad.javafx.componentes.TemplateBillController;
import dad.javafx.objects.Bill;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private TemplateBillController rootController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rootController = new TemplateBillController();
		
		String id = new String("ID1");
		
		rootController.getBillLst().add(new Bill(
				id, 
				"11/02/2020", 
				"Borja", 
				"IVA", 
				"Listo", 
				new ButtonBill(id)));//Añado un objeto bill a la lista de ejemplo
		
		Scene scene = new Scene(rootController.getView(), 640, 480);
		
		primaryStage.setTitle("Prueba Template");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

	public static void main(String[] args) {
		launch(args);

	}

}
