package model;

import view.Home;

import java.sql.*;

public class Conect {

    private static Conect INSTANCE = null;

    private Connection con = null;

    protected Conect() throws SQLException {
        try{
            con = DriverManager.getConnection("jdbc:sqlite::resource:"
            + Home.class.getResource("/recipesbase.db"));
            System.out.println("Entou");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Conect getInstance() throws SQLException {
        if(INSTANCE == null){
            INSTANCE = new Conect();
        }
        return INSTANCE;
    }

    public Connection getConnetion()
    {
        return this.con;
    }

    public void closeCon(Connection con){
        try{
            this.con.close();
        }catch(Exception e){
            System.out.println("Error: impossivel fechar a conexao");
        }
    }

}
