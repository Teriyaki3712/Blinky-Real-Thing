package frc.robot.subsystems.Securemotors;

import org.littletonrobotics.junction.AutoLog;

public interface SecureMotorsIO {
    @AutoLog
    public static class SecureMotorsInputs {
        public double SecureMotarsVelocityRotPerSecond;

    }

    public default void setMotarPower(double power) {

    }

    public default void updateInputs(SecureMotorsInputs inputs) {}


}
