package frc.robot.subsystems.drive;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

/**
 * DrivetrainReal
 */
public class DrivetrainReal implements DrivetrainIO {
    private final VictorSP left = new VictorSP();
    private final VictorSP left1 = new VictorSP();
    private final VictorSP right = new VictorSP();
    private final VictorSP right1 = new VictorSP();

    public DrivetrainVSP{
        left.addFollower(left1);
        right.addFollower(right1);
        right.setInverted(true);
        right1.setInverted(true);

    }
    /**
     * Drivetrain Real
     */
    //public DrivetrainReal() {} don't know if I should use this

    @Override
    public void updateInputs(DrivetrainIOInputs inputs) {
        inputs.gyroYaw = Rotation2d.fromDegrees(0);
    }

    /**
     * Drive Voltage
     */
    public void setDriveVoltage(double lvolts, double rvolts) {}
    left1.set(lvolts);
    right.set(rvolts);
}
