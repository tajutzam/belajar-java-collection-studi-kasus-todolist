package zam.dev.Belajarjavacollection.todolist.service;

import zam.dev.Belajarjavacollection.todolist.entity.Todolist;

import java.util.List;

public interface TodolistService {

    void addTodo(Todolist todolist);
    void remove ();
    List<Todolist> findAll();

    void showMenu();
}
