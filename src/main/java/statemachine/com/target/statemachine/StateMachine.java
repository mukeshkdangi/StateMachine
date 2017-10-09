package com.target.statemachine;

import com.target.constants.SateMachineConstants.StateMachineEventCodes;
import com.target.state.InitialState;
import com.target.state.State;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateMachine extends AbstractStateMachine {

    private State                  state;
    private StateMachineEventCodes inputEventCode;
    private String                 inputEvent;

    private boolean                isInValidState = true;

    public StateMachine() {
        state = new InitialState();
        System.out.println("<" + state.myStateCode().getCode());
    }

    public void startStateMigration() {
        if (!isInValidState) {
            state.changeState(this);
        }
    }

    @Override
    public void preProcess() {
        updateSMEventCode(this.getInputEvent());

    }

    @Override
    public void process() {
        isInValidState = ValiadationUtil.isInValidState(this);
    }

    @Override
    public void postProcess() {
        this.startStateMigration();
        System.out.println("<" + state.myStateCode().getCode());
    }

    private void updateSMEventCode(String inputEvent) {

        for (StateMachineEventCodes event : StateMachineEventCodes.values()) {
            if (event.getCode().equalsIgnoreCase(inputEvent)) {
                this.setInputEventCode(event);
                isInValidState = false;
            }

        }

    }

}
