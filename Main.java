package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			
			Scene scene = new Scene(grid,500,500);
			Label etiqueta = new Label("Número");
			grid.add(etiqueta, 0, 1);
			
			TextField numero = new TextField();
			grid.add(numero, 1, 1);
			
			Button factorial = new Button("FACTORIAL");
			grid.add(factorial, 1, 2);
			
			TextField fac = new TextField();
			grid.add(fac, 3, 1);
			
		
			factorial.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					//TODO Auto-generated method stub
					int suma = 1;
					String dato = numero.getText();
					int numeroF = Integer.parseInt(numero.getText());
					for(int i=numeroF;i>=1;i--) {
						suma *=i;
					}

						fac.setText(String.valueOf(suma));;
				}
			});
					
			
			Label resultado = new Label("RESULTADO: ");
			grid.add(resultado, 2, 1);
			
			

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
