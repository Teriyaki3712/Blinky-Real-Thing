package frc.robot.subsystems.Securemotors;

import org.littletonrobotics.junction.Logger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SecureMotors extends SubsystemBase {
    private SecureMotorsIO io;
    private SecureMotorsInputsAutoLogged inputs = new SecureMotorsInputsAutoLogged();

    public SecureMotors(SecureMotorsIO io) {
        this.io = io;
    }

    @Override
    public void periodic() {
        Logger.processInputs("Motors", inputs);
        io.updateInputs(inputs);
    }

    public void SetMotorPower(double power) {
        Logger.recordOutput("motor1", power);
        io.setMotarPower(power);
    }

    public Command sCMD(double power) {
        return Commands.startEnd(() -> {
            SetMotorPower(power);
        }, () -> {
            SetMotorPower(0);
        }, this);

    }

}
