package frc.robot.subsystems.Intake;

import org.littletonrobotics.junction.Logger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private IntakeIO io;
    private IntakeInputsAutoLogged inputs = new IntakeInputsAutoLogged();

    public Intake(IntakeIO io) {
        this.io = io;

    }

    @Override
    public void periodic() {
        Logger.processInputs("intake", inputs);
        io.updateInputs(inputs);
    }

    public void SetMoterPower(double power) {
        Logger.recordOutput("intake/Voltage", power);
        io.setMoterPower(power);
    }

    public Command intakeCMD(double power) {
        return Commands.startEnd(() -> {
            SetMoterPower(power);
        }, () -> SetMoterPower(0), this);
    }

    public Command OuttakeCMD(double power) {
        return Commands.startEnd(() -> {
            SetMoterPower(-power);
        }, () -> {
            SetMoterPower(0);
        }, this);


    }

}


