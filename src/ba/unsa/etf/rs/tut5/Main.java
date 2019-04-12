package ba.unsa.etf.rs.tut5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        model.setTrenutniKorisnik(model.getKorisnici().get(0));
        Controller controller = new Controller(model);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(controller);
        Parent root = loader.load();
        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
