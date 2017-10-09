package com.target.state;

import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.statemachine.StateMachine;

public class CompleteState implements State {

    @Override
    public void changeState(StateMachine stateMachine) {
        stateMachine.setState(CompleteState.getInstance());
    }

    public static State getInstance() {
        return new CompleteState();
    }

    @Override
    public StateMachineStateCodes myStateCode() {
        return StateMachineStateCodes.COMPLETE_STATE;
    }

}
