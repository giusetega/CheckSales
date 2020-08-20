
package com.mycompany.polymorphism;

/**
 *
 * @author giuseppe
 */
public class DiscountedSale extends Sale{
    
    private double discount;

    public DiscountedSale() {
        super();
        discount = 0;
    }
    
    public DiscountedSale(String name, double price, double discount){
        super(name, price);
        setDiscount(discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount > 0) 
            this.discount = discount;        
    }    
    
    @Override
    public double total(){
        return (1 - discount / 100 ) * getPrice();
    }
    
    @Override
    public boolean equals(Object obj) {        
        if (obj == null) 
            return false;        
        else if (!(obj instanceof DiscountedSale)) 
            return false;
        else {
            DiscountedSale otherSale = (DiscountedSale) obj;
            return (super.equals(otherSale) && discount == otherSale.discount );
        }
    }

    @Override
    public String toString() {
        return "DiscountSale{" + "name=" + getName() + ", price=" + getPrice() + "discount= " + discount + '}';
    }
    
    
    
    
    
    
}
















