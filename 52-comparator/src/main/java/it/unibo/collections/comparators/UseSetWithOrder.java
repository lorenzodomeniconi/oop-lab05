package it.unibo.collections.comparators;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.math.*;
/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {
        Collection<String> treeSet = new TreeSet<>();
        Random rand = new Random();
        double n;
        for(int i = 0; i < 100; i++){
            n = rand.nextDouble()+1%100;
            treeSet.add(""+n);
        }
        Iterator<String> setIterator = treeSet.iterator();
        Comparator<String> comparator = new SetCommparator();
        
        while(setIterator.hasNext()){
            comparator.compare(setIterator.next(), setIterator.next());
        }
        System.out.println(treeSet);
        /*
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
        
        /*
         * 3) Prints the set, which must be ordered
         */
    }
}
