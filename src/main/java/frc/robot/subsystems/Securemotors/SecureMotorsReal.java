package frc.robot.subsystems.Securemotors;

import com.ctre.phoenix6.BaseStatusSignal;
import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj.DigitalInput;

public class SecureMotorsReal implements SecureMotorsIO {
    public final CANSparkMax neo550 = new CANSparkMax(57, MotorType.kBrushless);
    public final TalonFX falcon500 = new TalonFX(51);
    public final RelativeEncoder encoder = neo550.getEncoder();
    public final StatusSignal<Double> motorencoderposition;
    public final StatusSignal<Double> motorencodervelocity;
    public DigitalInput limitswitch = new DigitalInput(8);



    public SecureMotorsReal() {
        motorencoderposition = falcon500.getPosition();
        motorencodervelocity = falcon500.getVelocity();

    }


    public void setMotarPower(double power) {
        neo550.set(power);
        falcon500.set(power);

    }

    public void updateInputs() {
        BaseStatusSignal.refreshAll(motorencoderposition, motorencodervelocity);
    }

    public void encodervalues() {
        encoder.getVelocity();
    }

    public double falcon500positionm() {
        return motorencoderposition.refresh().getValue();

    }

    public double falcon500velocitym() {
        return motorencodervelocity.refresh().getValue();
    }



}
