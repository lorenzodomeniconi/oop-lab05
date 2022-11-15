package it.unibo.collections.comparators;

import java.util.Comparator;

public class SetCommparator  implements Comparator<String>{

    @Override
    public int compare(String arg0, String arg1) {
        Double d = Double.parseDouble(arg0);
        Double d1 = Double.parseDouble(arg1);
        return d.compareTo(d1);
    }
    
}
