package zam.dev.Belajarjavacollection.todolist;

import zam.dev.Belajarjavacollection.todolist.view.ViewTodolist;

public class Main {

    public static void main(String[] args) {
        ViewTodolist todolist = new ViewTodolist();
        todolist.menu();
        todolist.run();
    }
}
