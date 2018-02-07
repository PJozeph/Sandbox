package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group group = new Group();
        Canvas canvas = new Canvas(300,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        group.getChildren().add(canvas);
        Scene scene = new Scene(group,300,275);

        primaryStage.setTitle("Game Of Life");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
