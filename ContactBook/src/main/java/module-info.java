module au.edu.unsw.business.infs2605.ContactBook {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;

    opens au.edu.unsw.business.infs2605.ContactBook to javafx.fxml;
    exports au.edu.unsw.business.infs2605.ContactBook;
}