module com.example.finalvendingmachine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalvendingmachine to javafx.fxml;
    exports com.example.finalvendingmachine;
}