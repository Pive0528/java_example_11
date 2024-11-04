//package com.koreait;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main2 {
//    private static final ArrayList<String> todoList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("명령) ");
//            String command = scanner.nextLine().trim();
//            switch (command) {
//                case "list":
//                    listTodos();
//                    break;
//                case "add":
//                    System.out.print("할일: ");
//                    String todo = scanner.nextLine().trim();
//                    addTodo(todo);
//                    break;
//                case "del":
//                    System.out.print("삭제할 할일의 번호: ");
//                    int numberToDelete = Integer.parseInt(scanner.nextLine().trim());
//                    deleteTodo(numberToDelete);
//                    break;
//                case "modify":
//                    System.out.printf("수정할 할일의 번호: ");
//                    int numberToModify = Integer.parseInt(scanner.nextLine().trim());
//                    System.out.print("새 할일: ");
//                    String newTodo = scanner.nextLine().trim();
//                    modifyTodo(numberToModify, newTodo);
//                    break;
//                case "exit":
//                    System.out.println("앱 종료 명령이 입력되었습니다.");
//                    return;
//            }
//        }
//    }
//
//    private static void listTodos() {
//        System.out.println("번호 / 내용");
//        for (int i = 0; i < todoList.size(); i++) {
//            String todo = todoList.get(i);
//            if (!todo.isEmpty()) {
//                System.out.println((i + 1) + " / " + todo);
//            }
//        }
//    }
//
//    private static void addTodo(String todo) {
//        todoList.add(todo);
//        System.out.println(todoList.size() + "번 할일이 생성되었습니다.");
//    }
//
//    private static void deleteTodo(int number) {
//        String removedTodo = todoList.get(number - 1);
//        todoList.set(number - 1, "");
//        System.out.println(number + "번 할일이 삭제되었습니다.");
//    }
//
//    private static void modifyTodo(int number, String newTodo) {
//        todoList.set(number - 1, newTodo);
//        System.out.println(number + "번 할일이 수정되었습니다.");
//    }
//}
