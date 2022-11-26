module com.example.rozpoznavanihlasu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rozpoznavanihlasu to javafx.fxml;
    exports com.example.rozpoznavanihlasu;
}