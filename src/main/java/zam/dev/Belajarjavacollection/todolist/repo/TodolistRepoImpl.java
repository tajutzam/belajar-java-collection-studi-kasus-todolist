package zam.dev.Belajarjavacollection.todolist.repo;

import zam.dev.Belajarjavacollection.todolist.entity.Todolist;

import java.util.ArrayList;
import java.util.List;

public class TodolistRepoImpl implements TodolistRepo{

    private final List<Todolist> todolists = new ArrayList<>();

    @Override
    public Todolist add(Todolist todo) {
        todolists.add(todo);
        return todo;
    }

    @Override
    public void delete(Todolist todo) {
        todolists.remove(todo);
    }

    @Override
    public List<Todolist> findAll() {
        int counter = 1;
        for(var todo : todolists){
            System.out.println(counter + "." + todo.getName());
            counter++;
        }
        return todolists;
    }

    @Override
    public Todolist getByKey(Integer integer) {
        return todolists.get(integer);
    }

    @Override
    public List<Todolist> getTodo() {
        return this.todolists;
    }
}
