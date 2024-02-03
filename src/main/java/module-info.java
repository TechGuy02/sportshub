module org.example.sportshub {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sportshub to javafx.fxml;
    exports org.example.sportshub;
}