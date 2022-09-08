package zam.dev.Belajarjavacollection.todolist.service;

import zam.dev.Belajarjavacollection.todolist.entity.Todolist;
import zam.dev.Belajarjavacollection.todolist.repo.TodolistRepo;
import zam.dev.Belajarjavacollection.todolist.repo.TodolistRepoImpl;

import java.util.List;
import java.util.Scanner;

public class TodolistServiceImpl implements TodolistService{

    final TodolistRepo todolistRepo = new TodolistRepoImpl();

    @Override
    public void addTodo(Todolist todolist) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama todo :");
        String nama = scanner.nextLine();
        todolist.setName(nama);
        todolistRepo.add(todolist);

    }

    @Override
    public void remove() {
        System.out.println("Masukan Nomer Todo :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number>todolistRepo.getTodo().size()){
            System.out.println("Tidak ada data todo");
        }else{
            Todolist byKey = todolistRepo.getByKey(number-1);
            if(byKey!=null){
                todolistRepo.delete(byKey);
            }else{
                System.out.println("Todolist Tidak ditemukan");
            }
        }

    }

    @Override
    public List<Todolist> findAll() {

        return todolistRepo.findAll();
    }

    @Override
    public void showMenu() {

        System.out.println("TODOLIST");
        System.out.println("Menu");
        System.out.println("----------");
        System.out.println("1 . show todo");
        System.out.println("2 . Tambah todo");
        System.out.println("3 . Hapus todo");
        System.out.println("0 . keluar");

    }
}
