module com.cse213.complex_num_operation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213.complex_num_operation to javafx.fxml;
    exports com.cse213.complex_num_operation;
}