package view;

import controller.ControllerSelect;
import model.Conect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home {

    private static Connection con;

    public static void main(String[] args) throws SQLException
    {

        ControllerSelect ever = new ControllerSelect();
        ever.selectEver();

    }
}
