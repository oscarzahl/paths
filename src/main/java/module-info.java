module com.trondogoscar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.trondogoscar to javafx.fxml;
    exports com.trondogoscar;
}
