package view;

import controller.ControllerSelect;

import java.sql.Connection;
import java.sql.SQLException;


public class Home {

    private static Connection con;

    public static void main(String[] args) throws SQLException
    {

        ControllerSelect ever = new ControllerSelect();
        ever.selectEver();

    }
}
