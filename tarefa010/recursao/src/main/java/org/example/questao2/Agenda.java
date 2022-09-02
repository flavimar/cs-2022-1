package org.example.questao2;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Data
public class Agenda {
    List<Contato> contatos;

    Agenda(){
        contatos = new ArrayList<>();
    }
    public void addContato(Contato contato){
        contatos.add(contato);
    }
    private int pesquisaBinaria(List<Contato> p,int i,int f,String valor){
        int m = (i + f) / 2;
        if (i > f){
            return -1;
        }

        if(p.get(m).getNome().compareTo(valor) < 0){
            return pesquisaBinaria(p,m+1,f, valor);
        }else if(p.get(m).getNome().compareTo(valor) > 0){
            return pesquisaBinaria(p,i,m-1,valor);
        }else{
            return m;
        }
    }

    public Contato getContatoPorNome(String nome){
        Collections.sort(contatos);
        int resp = pesquisaBinaria(contatos,0,contatos.size()-1,nome);
        if(resp >= 0){
            return contatos.get(resp);
        }else{
            return null;
        }
    }
    public Contato getContatoPorEmail(String email){
        Contato c;
        for(Contato contato : contatos){
            if(contato.getEmail().equals(email)){
                return contato;
            }
        }
        return null;
    }
    public void removeContato(String nome){
        Collections.sort(contatos);
        int resp = pesquisaBinaria(contatos,0,contatos.size()-1,nome);
        if(resp >= 0){
            System.out.println("Removeu o contato: " + contatos.get(resp));
            contatos.remove(resp);

        }else {
            System.out.println("contato não encontrado");
        }
    }
    public void listaContatos(){
        this.contatos.forEach(contato -> {
            System.out.println(contato.toString());
        });
    }
}
