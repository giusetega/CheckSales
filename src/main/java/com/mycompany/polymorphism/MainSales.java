
    package com.mycompany.polymorphism;

/**
 *
 * @author giuseppe aaa aaa
 */
public class MainSales {

    public static void main(String[] args) {
        
        Sale sale1 = new Sale("DVD", 10);
        DiscountedSale discountedSale1 = new DiscountedSale("DVD", 11, 10);
        
        Sale sale2 = new Sale("CD", 20.7);        
        DiscountedSale discountedSale2 = new DiscountedSale("CD", 23, 10);
        
        System.out.println("--------------------------------");  
        System.out.println("Final price sale1: " + sale1.total());
        System.out.println("Final price discounted sale1: " + discountedSale1.total());
        
        System.out.println("--------------------------------"); 
        System.out.println("Final price sale2: " + sale2.total());
        System.out.println("Final price discounted sale2: " + discountedSale2.total());
        
        System.out.println("--------------------------------");  
        if (discountedSale1.isLessThan(sale1) ) 
            System.out.println("Discounted sale1 is less than sale1");
        else 
            System.out.println("Discounted sale1 is more than sale1");
        
        if (discountedSale2.sameSalesValue(sale2))
            System.out.println("Sale2 is the same of discounted sale2");
        else
            System.out.println("Sale2 is more than discounted sale2");  
        
    }
    
}













