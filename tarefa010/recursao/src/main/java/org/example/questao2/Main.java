package org.example.questao2;

public class Main {
    public static void main(String[] args) {
       Agenda agenda = new Agenda();
       Contato contato1 = new Contato();
       contato1.setNome("heitor");
       contato1.setEmail("heitor@gmail.com");
       agenda.addContato(contato1);
       Contato contato2 = new Contato();
       contato2.setNome("alan");
       contato2.setEmail("alan@gmail.com");
       agenda.addContato(contato2);
       Contato contato3 = new Contato();
        contato3.setNome("moises");
        contato3.setEmail("lindo@gmail.com");
        agenda.addContato(contato3);
        System.out.println("LISTAGEM DOS CONTATOS");
        agenda.listaContatos();
        Contato achou = agenda.getContatoPorNome("moises");
        System.out.println("Contato encontrado: " + achou.toString());
        agenda.removeContato("alan");
        System.out.println("LISTAGEM DOS CONTATOS");
        agenda.listaContatos();
    }
}