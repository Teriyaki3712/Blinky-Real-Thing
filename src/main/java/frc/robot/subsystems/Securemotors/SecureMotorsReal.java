package frc.robot.subsystems.Securemotors;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class SecureMotorsReal implements SecureMotorsIO {
    private final SparkMax neo550 = new SparkMax(57, MotorType.kBrushless);
    private final TalonFX falcon500 = new TalonFX(51);

    public SecureMotorsReal() {
    }

    public void setMotarPower(double power) {
        neo550.set(power);
        falcon500.set(power);
    }

}
