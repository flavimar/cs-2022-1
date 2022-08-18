package org.example;

public class Active implements SituationState{
    @Override
    public void active(Situation situation) {
        System.out.println("Já está ativa");
    }

    @Override
    public void inactive(Situation situation) {
        System.out.println("Mandando de ativa para inativa");
        situation.setSituationState(new Inactive());
    }

    @Override
    public void inProgress(Situation situation) {
        System.out.println("Não posso ficar em andamento quando já estou ativa");
    }
    public String toString(){
        return "Situação Ativa";
    }
}
