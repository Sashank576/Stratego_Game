package test;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;


public class GameMenu extends Application{
    private final int WINDOW_HEIGHT = 600;
    private final int WINDOW_WIDTH = 600;
    private Stage stage;

    private Board board;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;

        setupMenu();

        primaryStage.setTitle("Game");
        primaryStage.setOnCloseRequest(windowEvent -> closeGame());
        primaryStage.show();

    }

    private void closeGame()
    {
        Platform.exit();
        System.exit(0);
    }

    private void setupMenu()
    {
        //make menu

        //call drawBoard()

    }

    private void drawBoard()
    {
        //create pieces and set them up
    }
    public static void startChess(String[] args)
    {
        GameMenu.launch(args);
    }
}


