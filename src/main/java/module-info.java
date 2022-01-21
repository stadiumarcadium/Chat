module com.example.lesson04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson04 to javafx.fxml;
    exports com.example.lesson04;
}