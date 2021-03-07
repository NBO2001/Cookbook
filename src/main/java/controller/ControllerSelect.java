package controller;

import model.SelectDB;

import java.util.ArrayList;
import java.util.List;

public class ControllerSelect {

    public boolean selectEver(){

        try{
            SelectDB selc = new SelectDB();
            System.out.println(selc.getEver().size());

        }catch(Exception e){
            System.out.println("Erro");
        }

        return true;
    }
}
