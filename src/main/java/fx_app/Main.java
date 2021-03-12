package fx_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("hello spring!");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///C:/Users/AmineH/IdeaProjects/Dummy_project/src/main/resources/app.fxml"));
        //loader.load(getClass().getClassLoader().getResource( "app.fxml" ));

        GridPane gp = loader.<GridPane>load();
        Scene s =new Scene(gp);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
