package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage primaryStage;
    static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../FrontModules/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void sceneChanger(Scene scene, String title){
        primaryStage.setScene(scene);
        primaryStage.setTitle(title);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
