package com.target.state;

import com.target.constants.SateMachineConstants.StateMachineEventCodes;
import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.statemachine.StateMachine;

public class FourthState implements State {

    @Override
    public void changeState(StateMachine stateMachine) {
        if (stateMachine.getInputEvent().equals(StateMachineEventCodes.BUY)) {
            stateMachine.setState(CompleteState.getInstance());
        }

    }

    public static State getInstance() {
        return new FourthState();
    }

    @Override
    public StateMachineStateCodes myStateCode() {
        return StateMachineStateCodes.FOURTH_STATE;
    }

}
