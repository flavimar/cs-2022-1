package org.example;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        task.setName("Questionario");
        task.setSituation(new Situation(new Inactive()));
        System.out.println("Tarefa com o nome de " + task.getName());
        System.out.println(task.getSituation().toString());
        task.getSituation().inactive();
        task.getSituation().active();
        task.getSituation().inProgress();
        System.out.println(task.getSituation().toString());
        task.getSituation().active();
        System.out.println(task.getSituation().toString());
    }
}