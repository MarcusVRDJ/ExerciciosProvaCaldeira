package org.example.forFiltro;

import java.util.ArrayList;

public class ForFiltro {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer Exercícios");
        tarefas.add("Revisar Código");

        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }
}
