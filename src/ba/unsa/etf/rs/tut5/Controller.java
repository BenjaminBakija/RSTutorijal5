package ba.unsa.etf.rs.tut5;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField imeField;
    public TextField prezimeField;
    public TextField mailField;
    public TextField usernameField;
    public PasswordField passwordField;

    public Button btnDodaj;
    public Button btnKraj;
    public ListView<Korisnik> listKorisnik;

    private KorisniciModel model;
    public Controller(KorisniciModel model) {
        this.model = model;
    }

    public void btnaddDodaj(ActionEvent actionEvent) {

    }

    public void btnaddKraj(ActionEvent actionEvent) {
        Stage myStage = (Stage)btnDodaj.getScene().getWindow();
        myStage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
   //     bind();
        listKorisnik.setItems(model.getKorisnici());
        listKorisnik.selectionModelProperty().addListener(new ChangeListener<MultipleSelectionModel<Korisnik>>() {
            @Override
            public void changed(ObservableValue<? extends MultipleSelectionModel<Korisnik>> observable, MultipleSelectionModel<Korisnik> oldValue, MultipleSelectionModel<Korisnik> newValue) {
                if(newValue==null)  {
                    unbind();
                }
                else {
                    bind();
                    model.setTrenutniKorisnik(newValue.getSelectedItem());
                }
            }
        });
    }

    private void unbind() {
        imeField.textProperty().unbindBidirectional(model.getTrenutniKorisnik().imeProperty());
        prezimeField.textProperty().unbindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        mailField.textProperty().unbindBidirectional(model.getTrenutniKorisnik().emailProperty());
        usernameField.textProperty().unbindBidirectional(model.getTrenutniKorisnik().usernameProperty());
        passwordField.textProperty().unbindBidirectional(model.getTrenutniKorisnik().passwordProperty());
    }

    private void bind() {
        imeField.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        prezimeField.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        mailField.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
        usernameField.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
        passwordField.textProperty().bindBidirectional(model.getTrenutniKorisnik().passwordProperty());
    }
}
