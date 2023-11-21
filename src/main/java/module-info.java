module com.kevlar.cafeshopmanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kevlar.cafeshopmanagmentsystem to javafx.fxml;
    exports com.kevlar.cafeshopmanagmentsystem;
}
