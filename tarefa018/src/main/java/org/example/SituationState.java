package org.example;

public interface SituationState {
    void active(Situation situation);
    void inactive(Situation situation);
    void inProgress(Situation situation);
}
