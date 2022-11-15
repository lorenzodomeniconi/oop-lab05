package it.unibo.collections.design.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WarehouseImpl implements Warehouse{

    private final Set<Product> set  = new LinkedHashSet<>();

    public void addProduct(Product p) {
        set.add(p);
        
    }

    public Set<String> allNames() {
        Set<String> s = new LinkedHashSet<>();
        Iterator<Product> iterator = set.iterator();
        while(iterator.hasNext()){
            s.add(iterator.next().getName());
        }
        return s;
    }

    public Set<Product> allProducts() {    
        Set<Product> s = new LinkedHashSet<>();
        Iterator<Product> iterator = set.iterator();
        while(iterator.hasNext()){
            s.add(iterator.next());
        }
        return s;
    }

    public boolean containsProduct(Product p) {
        return set.contains(p);
    }

    public double getQuantity(String name) {
        Iterator<Product> iterator = set.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getName() == name){
                break;
            }
        }
        return iterator.next().getQuantity();
    }

    

}