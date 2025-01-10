package frc.robot.subsystems.Intake;

import org.littletonrobotics.junction.Logger;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private IntakeIO io;
    private IntakeInputsAutoLogged inputs = new IntakeInputsAutoLogged();
    private boolean Intake1;

    public Intake(IntakeIO io) {
        this.io = io;

    }

    @Override
    public void periodic() {
        Logger.processInputs("intake", inputs);
        io.updateInputs(inputs);
        SmartDashboard.putBoolean("Intakemotor", true);
        Intake1 = SmartDashboard.getBoolean("Intakemotor", true);
    }

    public void SetMoterPower(double power) {
        Logger.recordOutput("intake/Voltage", power);
        io.setMoterPower(power);
    }

    public Command intakeCMD(double power) {
        return startEnd(() -> {
            SetMoterPower(power);
        }, () -> SetMoterPower(0));
    }
}


