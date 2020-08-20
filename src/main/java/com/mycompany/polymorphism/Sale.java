
package com.mycompany.polymorphism;

/**
 *
 * @author giuseppe
 */
public class Sale {
    
    private String name;
    private double price;
    
    public Sale(){
        name = "No name";
        price = 0;
    }
    
    public Sale(String name, double price){
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || name != "") {
            this.name = name;
        } 
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 ) {
            this.price = price;
        }
    }
    
    public double total(){
        return price;
    }
    
    public boolean sameSalesValue(Sale sale){
        return (name.equals(sale.name) && total() == sale.total());
    }
    
    public boolean isLessThan(Sale sale){
        return total() < sale.total();
    }
    
    @Override
    public boolean equals(Object obj) {        
        if (obj == null) 
            return false;        
        else if (!(obj instanceof Sale)) 
            return false;
        else {
            Sale otherSale = (Sale) obj;
            return (this.name.equals(otherSale.name) && this.price == otherSale.price);
        }
    }

    @Override
    public String toString() {
        return "Sale{" + "name=" + name + ", price=" + price + '}';
    }
    
    
    
    
    
     
     
    
}


















