package dad.javafx.main;

import dad.javafx.componentes.TemplateBillController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private TemplateBillController rootController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rootController = new TemplateBillController();
		
		Scene scene = new Scene(rootController.getView(), 640, 480);
		
		primaryStage.setTitle("Prueba Template");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

	public static void main(String[] args) {
		launch(args);

	}

}
