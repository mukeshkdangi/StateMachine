package com.target.state;

import com.target.constants.SateMachineConstants.StateMachineEventCodes;
import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.statemachine.StateMachine;

public class ThirdState implements State {

    @Override
    public void changeState(StateMachine stateMachine) {
        State state = stateMachine.getState();

        if (stateMachine.getInputEventCode().getCode().equals(StateMachineEventCodes.ONE_INR)) {
            state = FourthState.getInstance();
        }
        stateMachine.setState(state);
    }

    public static State getInstance() {
        return new ThirdState();
    }

    @Override
    public StateMachineStateCodes myStateCode() {
        return StateMachineStateCodes.THIRD_STATE;
    }

}
