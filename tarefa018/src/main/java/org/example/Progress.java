package org.example;

public class Progress implements SituationState{
    @Override
    public void active(Situation situation) {
        System.out.println("Mudando de em andamento para ativa");
        situation.setSituationState(new Active());
    }

    @Override
    public void inactive(Situation situation) {
        System.out.println("Mudando de em andamento para inativa");
        situation.setSituationState(new Inactive());
    }

    @Override
    public void inProgress(Situation situation) {
        System.out.println("Já está em andamento");
    }
    public String toString(){
        return "Situação Em Andamento";
    }
}
