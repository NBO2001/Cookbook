package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectDB {

    private Connection con;

    public SelectDB() throws SQLException {

        try{

            con = Conect.getInstance().getConnetion();
            System.out.println("Conectou");


        }catch(Exception e){

            System.out.println("Error: seclectDB conexao");

        }
    }

    public List<String> getEver(){
        List<String> data = new ArrayList<>();

        try{
            Statement stm = con.createStatement();

            String query = "SELECT * FROM recipes";

            ResultSet valuesQ = stm.executeQuery(query);

            while (valuesQ.next()){
                data.add(valuesQ.getString(2));
            }

        }catch(Exception e){
            System.out.println("Erro ao excutar o sql");
        }


        try {
            con.close();
            System.out.println("Fechou!!");
        }catch(Exception e){
            System.out.println("Erro ao fechar coneção");
        }
        return data;
    }


}
