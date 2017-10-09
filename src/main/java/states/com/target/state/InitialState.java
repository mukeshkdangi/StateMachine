package com.target.state;

import com.target.constants.SateMachineConstants.StateMachineEventCodes;
import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.statemachine.StateMachine;

public class InitialState implements State {

    @Override
    public void changeState(StateMachine stateMachine) {
        State state = stateMachine.getState();
        if (stateMachine.getInputEventCode().getCode().equals(StateMachineEventCodes.ONE_INR)) {
            state = FirstState.getInstance();
        }

        if (stateMachine.getInputEventCode().getCode().equals(StateMachineEventCodes.TWO_INR)) {
            state = SecondState.getInstance();
        }
        stateMachine.setState(state);
    }

    public static State getInstance() {
        return new InitialState();
    }

    @Override
    public StateMachineStateCodes myStateCode() {
        return StateMachineStateCodes.INITIAL_STATE;
    }
}
