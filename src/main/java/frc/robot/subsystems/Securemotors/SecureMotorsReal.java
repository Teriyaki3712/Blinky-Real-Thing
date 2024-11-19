package frc.robot.subsystems.Securemotors;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

public class SecureMotorsReal {
    private final CANSparkMax neo550 = new CANSparkMax(57, MotorType.kBrushless);
    private final TalonFX falcon500 = new TalonFX(51);

    public SecureMotorsReal() {}

    public void setMotarPower(double power) {
        neo550.set(power);
        falcon500.set(power);
    }


}
