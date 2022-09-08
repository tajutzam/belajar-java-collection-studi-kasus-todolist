package zam.dev.Belajarjavacollection;

import java.util.Comparator;

public class DataComparator implements Comparator<Data> {

    @Override
    public int compare(Data o1, Data o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
