module com.example.finalprojectjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectjfx to javafx.fxml;
    exports com.example.finalprojectjfx;
}