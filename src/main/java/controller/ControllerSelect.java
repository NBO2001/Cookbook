package controller;

import model.SelectDB;
import tools.ListArm;

import java.util.ArrayList;
import java.util.List;

public class ControllerSelect {

    public List<ListArm> selectEver(){
        List<ListArm> listS = null;
        try{
            SelectDB selc = new SelectDB();
            listS = selc.getEver();

        }catch(Exception e){
            System.out.println("Erro");
        }

        return listS;
    }
}
