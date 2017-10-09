package com.target.constants;

public class SateMachineConstants {

    public static enum SateMachineStates {
        INITIAL_STATE, FIRST_STATE, SECOND_STATE, THIRD_STATE, FOURTH_STATE, CANCEL_STATE, COMPLETE_STATE
    }
    
    public static enum SateMachineEvents {
        ONE_INR, TWO_INR, CANCEL, BUY
    }

    public static enum StateMachineStateCodes {
        INITIAL_STATE(SateMachineStates.INITIAL_STATE, "0S"), 
        FIRST_STATE(SateMachineStates.FIRST_STATE, "1S"),
        SECOND_STATE(SateMachineStates.SECOND_STATE, "2S"),
        THIRD_STATE(SateMachineStates.THIRD_STATE, "3S"),
        FOURTH_STATE(SateMachineStates.FIRST_STATE, "4S"),
        COMPLETE_STATE(SateMachineStates.COMPLETE_STATE, "COMPLETE"),
        CANCEL_STATE(SateMachineStates.FIRST_STATE, "CANCEL");
        
        

        private final SateMachineStates smState;
        private final String            smCode;

        private StateMachineStateCodes(SateMachineStates smState, String smCode) {
            this.smState = smState;
            this.smCode = smCode;
        }

        public SateMachineStates getstate() {
            return smState;
        }

        public String getCode() {
            return smCode;
        }
      
    }
    
    public static enum StateMachineEventCodes {
        
        ONE_INR(SateMachineEvents.ONE_INR, "1R"),
        TWO_INR(SateMachineEvents.TWO_INR, "2R"),
        CANCEL(SateMachineEvents.CANCEL, "CANCEL"),
        BUY(SateMachineEvents.BUY, "BUY");
        
        private final SateMachineEvents smEvents;
        private final String            smCode;
        
        
        
        private StateMachineEventCodes(SateMachineEvents smEvents, String smCode) {
            this.smEvents = smEvents;
            this.smCode = smCode;
        }
        
        public SateMachineEvents getEvent() {
            return smEvents;
        }

        public String getCode() {
            return smCode;
        }
    }

}
