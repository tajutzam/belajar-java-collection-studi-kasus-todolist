package zam.dev.Belajarjavacollection.todolist.repo;

import zam.dev.Belajarjavacollection.todolist.entity.Todolist;

import java.util.List;

public interface TodolistRepo {


    List<Todolist> getTodo();

    Todolist add (Todolist todolist);
    void delete(Todolist todolist);
    List<Todolist> findAll();

    Todolist getByKey(Integer integer);
}
