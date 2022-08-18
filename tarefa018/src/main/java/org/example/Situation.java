package org.example;

import lombok.Data;

@Data
public class Situation {
    private SituationState situationState;

    public Situation(SituationState situationState){
        this.situationState = situationState;
    }

    public void active() {
        this.situationState.active(this);
    }

    public void inactive() {
        this.situationState.inactive(this);
    }

    public void inProgress() {
        this.situationState.inProgress(this);
    }
}
