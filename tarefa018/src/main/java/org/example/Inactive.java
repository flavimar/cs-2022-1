package org.example;

public class Inactive implements SituationState{
    @Override
    public void active(Situation situation) {
        System.out.println("Não posso ficar ativa quando estou inativa");
    }

    @Override
    public void inactive(Situation situation) {
        System.out.println("Já estou inativa");
    }

    @Override
    public void inProgress(Situation situation) {
        System.out.println("Mudando de inativa para em andamento");
        situation.setSituationState(new Progress());
    }
    public String toString(){
        return "Situação Inativa";
    }
}
