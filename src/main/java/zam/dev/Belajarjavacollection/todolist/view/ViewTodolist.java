package zam.dev.Belajarjavacollection.todolist.view;

import zam.dev.Belajarjavacollection.todolist.entity.Todolist;
import zam.dev.Belajarjavacollection.todolist.service.TodolistService;
import zam.dev.Belajarjavacollection.todolist.service.TodolistServiceImpl;

import java.util.Scanner;

public class ViewTodolist {


    final TodolistService todolistService = new TodolistServiceImpl();

    public void menu(){
        do{
            todolistService.showMenu();
        }while(run()==false);


    }

    public boolean run(){
        Scanner scanner = new Scanner(System.in);
        boolean kondisi = false;
        do {
            System.out.print("Masukan Menu : ");
            String opsi = scanner.next();
            switch (opsi){
                case "1":
                    todolistService.findAll();
                    menu();
                    return kondisi;
                case "2":
                    todolistService.addTodo(new Todolist());
                    menu();
                    return kondisi;
                case "3":
                    todolistService.remove();
                    menu();
                    return kondisi;
                case "0":
                    System.exit(0);
                default:
                    kondisi=true;
                    System.out.println("Input salah input ulang");
            }
        }while (kondisi==true);
        return kondisi;
    }



}
