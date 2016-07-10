package model;

import aspect.Loggable;

/**
 * Created by Tomek on 2016-06-06.
 */
public class Triangle {
    private String name;

    public String getName() {
        return name;
    }
    @Loggable
    public void setName(String name) {
        this.name = name;
    }
}
