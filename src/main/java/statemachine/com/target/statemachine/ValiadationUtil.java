package com.target.statemachine;

import java.util.Objects;

import com.target.constants.SateMachineConstants.StateMachineEventCodes;
import com.target.constants.SateMachineConstants.StateMachineStateCodes;
import com.target.state.CancelState;

public class ValiadationUtil {

    public static boolean isInValidState(StateMachine stateMachine) {
        if (Objects.isNull(stateMachine)) {
            return true;
        }

        String smEvntCode = stateMachine.getInputEvent();

        if (!(smEvntCode.equals(StateMachineEventCodes.ONE_INR.getCode())
                || smEvntCode.equals(StateMachineEventCodes.TWO_INR.getCode())
                || smEvntCode.equals(StateMachineEventCodes.BUY.getCode())
                || smEvntCode.equals(StateMachineEventCodes.CANCEL.getCode()))) {
            System.out.println("Invalid Event " + smEvntCode);
            return true;

        }
        if (isMachineInTerminalState(stateMachine)) {
            return true;
        }

        if (smEvntCode.equals(StateMachineEventCodes.CANCEL.getCode())) {
            stateMachine.setState(CancelState.getInstance());
            return true;
        }

        return false;
    }

    public static boolean isMachineInTerminalState(StateMachine stateMachine) {
        if (stateMachine.getState().myStateCode().getCode()
                .equalsIgnoreCase(StateMachineStateCodes.CANCEL_STATE.getCode())) {
            System.out.println("State Machine is cancel state");
            return true;
        }

        if (stateMachine.getState().myStateCode().getCode()
                .equalsIgnoreCase(StateMachineStateCodes.COMPLETE_STATE.getCode())) {
            System.out.println("State Machine is  Complete state");
            return true;
        }
        return false;
    }

}
