package frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class IntakeVSP {
    private final VictorSP leftIn = new VictorSP(1);
    private final VictorSP rightIn = new VictorSP(2);

    public IntakeVSP() {
        leftIn.addFollower(rightIn);
        rightIn.setInverted(true);
    }

    public void intakenothing() {
        leftIn.set(0);
    }

    public void setMotarVoltage(double power) {
        leftIn.set(power);
    }

    public void intake() {
        setMotarVoltage(.7);
    }

    public void outake() {
        setMotarVoltage(-.7);
    }

    public Command intakecm() {
        return Commands.runEnd(this::intake, () -> intakenothing());

    }

    public Command outakecm() {
        return Commands.runEnd(this::outake, () -> intakenothing());

    }

}
