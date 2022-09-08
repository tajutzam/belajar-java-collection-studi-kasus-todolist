package zam.dev.Belajarjavacollection.todolist.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Todolist {

    /*
    zam author
     */
    private String name;

    public Todolist() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Todolist(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todolist todolist = (Todolist) o;
        return Objects.equals(name, todolist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
