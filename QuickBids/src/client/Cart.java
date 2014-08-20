package client;

import java.util.ArrayList;
/**
 *
 * @author Jonathan
 */
public class Cart {
    
    ArrayList<Item> list;
    
    public Cart(){
        list = new ArrayList();
        
    }

    public void add(Item x){
    list.add(x);
    }
    
    public Item remove(int x){
    Item y = list.remove(x-1);
    return y;
    }
    
    public double getTotal(){
    double tot = 0;
        for(Item x: list){
            tot+=x.getTotal();
        }
    return tot;
    }
    
    public String toString(){
    String s = "";
    int i = 0;
        for(Item x: list){
            s+= ("---- Item "+(i+1)+": ----"+x.toString());
            i++;
        }
        return s;
    }
    public String filePrep(){
    String s = "";
    for(int i = 0; i < list.size(); i++)
        if(i != list.size()-1){ // any item with "nxt" to be added
            s+= (list.get(i).rawData()+" nxt/ ");
        }else{
            s+= list.get(i).rawData()+" done\\";
        }
        return s;
        }
    }
