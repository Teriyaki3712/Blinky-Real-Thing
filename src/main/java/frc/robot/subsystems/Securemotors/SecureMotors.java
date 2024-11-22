package frc.robot.subsystems.Securemotors;

import org.littletonrobotics.junction.Logger;
import org.littletonrobotics.junction.inputs.LoggableInputs;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Securemotors.SecureMotorsIO.SecureMotorsInputs;

public class SecureMotors extends SubsystemBase {
    private SecureMotorsIO io;
    private SecureMotorsInputs inputs = new SecureMotorsInputs();
    private double RMP;

    public SecureMotors(SecureMotorsIO io) {
        this.io = io;
    }

    @Override
    public void periodic() {
        Logger.processInputs("Motors", (LoggableInputs) inputs);
        io.updateInputs(inputs);
        SmartDashboard.putNumber("RPMofmotor", 1);
        RMP = SmartDashboard.getNumber("RPMofmotar", 1);
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
