package com.xworkz.object;

import java.util.Objects;

public class Salary {

    int id;
    String name;

    public void Details(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString(){
        return id+" "+name;
    }

    @Override
    public boolean equals(Object salary1) {
        Salary salary= (Salary)salary1;// converting from obj to Salary down casting
        return this.id==salary.id && this.name.equals(salary.name);
    }

    @Override
    public int hashCode() {
        return id+ name.hashCode();
    }
}
