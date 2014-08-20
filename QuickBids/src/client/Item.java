package client;

/**
 *
 * @author Jonathan
 * 
 * testing a different config
 * 
 * Again, testing git
 */
public class Item {
    
    String n, u, p;
    static Cart ourcart = new Cart();
   
    
    public Item(String name, String units, String price){
        n = name;
        u = units;
        p = price;
            
    }
    public double getPrice(){
        return Double.parseDouble(p);
    }
    public int getUnits(){
        return Integer.parseInt(u);
    }
    public String getName(){
        return n;
    }
    public double getTotal(){
        return(getPrice()*getUnits());
    }
    
    public boolean isValid(){
        try{
            Double.parseDouble(p);
            Integer.parseInt(u);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public String rawData(){
        return (""+n+" "+u+" "+p);
    }
    
    public String toString(){
        String s = "\n"+n+": \n Price/unit: $"+p+"\n Units: "+u+"\n\n Total: \t\t$"+getTotal()+"\n--------\n";
        return s;
    }
    
    
    
}