module com.example.jfxtemp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfxtemp to javafx.fxml;
    exports com.example.jfxtemp;
}