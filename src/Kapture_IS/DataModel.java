/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapture_IS;

/**
 *
 * @author userr
 */
public class DataModel {
    String name,type,company,range;
    int code,price,quantity;
        
    DataModel(int code, String name, String type, String company, int price, int quantity, String range){
        this.code=code;
        this.name=name;
        this.type=type;
        this.company=company;
        this.price=price;
        this.quantity=quantity;
        this.range=range;
    }
    
    int getCode(){
        return code;
    }
    
    String getName(){
        return name;
    }
    
    String getType(){
        return type;
    }
    
    String getCompany(){
        return company;
    }
    
    int getPrice(){
        return price;
    }
    
    int getQuantity(){
        return quantity;
    }
    
    String getRange(){
        return range;
    }
}
