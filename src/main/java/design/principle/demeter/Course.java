package design.principle.demeter;

import java.util.ArrayList;

public class Course {
    private ArrayList<Integer> list = new ArrayList<>();
    
    public Course() {
        super();
        for (Integer i = 0; i < 20; i++) {
            list.add(i);
        }
    }
    
    public ArrayList<Integer> getList() {
        return list;
    }
}
