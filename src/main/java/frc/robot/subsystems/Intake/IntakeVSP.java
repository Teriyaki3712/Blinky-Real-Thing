package frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class IntakeVSP implements IntakeIO {
    private final VictorSP rightIntake = new VictorSP(1);
    private final VictorSP leftIntake = new VictorSP(2);

    public IntakeVSP() {
        rightIntake.setInverted(true);
        leftIntake.addFollower(rightIntake);
    }

    public void updateInputs() {}

    public void setMoterPower(double power) {
        leftIntake.set(power);
    }



}
