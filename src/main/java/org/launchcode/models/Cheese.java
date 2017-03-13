package org.launchcode.models;

/**
 * Created by Rio on 3/12/2017.
 */
public class Cheese {

    private String name;
    private String description;

    public Cheese(String aName, String aDescription){
        name = aName;
        description = aDescription;
    }

    public String getName() {
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }
}