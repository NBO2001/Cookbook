package model;

import tools.ListArm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectDB {

    private Connection con;

    public SelectDB() throws SQLException {

        openConeccton();

    }

    public void openConeccton(){

        try{

            con = Conect.getInstance().getConnetion();

            System.out.println("Conectou");


        }catch(Exception e){

            System.out.println("Error: seclectDB conexao");

        }
    }

    public List<ListArm> getEver(){

        List<ListArm> data = new ArrayList<>();

        try{
            Statement stm = con.createStatement();

            String query = "SELECT * FROM recipes";

            ResultSet valuesQ = stm.executeQuery(query);

            while (valuesQ.next()){

                ListArm vals = new ListArm();

                vals.setId(valuesQ.getInt(1));

                vals.setNomeRecive(valuesQ.getString(2));

                data.add(vals);
            }

        }catch(SQLException e){
            System.out.println("Erro ao excutar o sql " + e);
        }
        closeConec(con);

        return data;
    }

    public void closeConec(Connection con){

        try {
           // con.close();
            System.out.println("Implementar o fechamento!!");
        }catch(Exception e){
            System.out.println("Erro ao fechar coneção");
        }
    }



}
