package com.target.state;

import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.statemachine.StateMachine;

public interface State {

    public void changeState(StateMachine stateMachine);

    public StateMachineStateCodes myStateCode();

}
