package com.target.state;

import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.statemachine.StateMachine;

public class CancelState implements State {

    @Override
    public void changeState(StateMachine stateMachine) {
        stateMachine.setState(CancelState.getInstance());
    }

    public static CancelState getInstance() {
        return new CancelState();
    }

    @Override
    public StateMachineStateCodes myStateCode() {
        return StateMachineStateCodes.CANCEL_STATE;
    }

}
