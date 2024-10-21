package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

/**
 * DrivetrainReal
 */
public class Drive extends SubsystemBase {
    private final VictorSP left = new VictorSP(6);
    private final VictorSP left1 = new VictorSP(7);
    private final VictorSP right = new VictorSP(4);
    private final VictorSP right1 = new VictorSP(5);

    public void DrivetrainVSP() {
        left.addFollower(left1);
        right.addFollower(right1);



    }
    /**
     * Drivetrain Real
     */
    // public DrivetrainReal() {} don't know if I should use this



    /**
     * Drive Voltage
     */
    public void setDriveVoltage(double lvolts, double rvolts) {
        left.set(lvolts);
        right.set(rvolts);
    }

    public Command teleopSwerve(CommandXboxController a) {
        return this.run(() -> setDriveVoltage(a.getLeftY(), a.getRightY()));

    }
}
