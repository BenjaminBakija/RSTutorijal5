package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime=new SimpleStringProperty(),
            prezime= new SimpleStringProperty(),
            email = new SimpleStringProperty(),
            username = new SimpleStringProperty(),
            password =  new SimpleStringProperty();

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String email, String username, String password) {
        this.ime.set(ime);
        this.prezime.set(prezime);
        this.email.set(email);
        this.username.set(username);
        this.password.set(password);
    }

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getUsername() {
        return username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    @Override
    public String toString() {

        return ime.get()+" "+prezime.get();
    }
}
