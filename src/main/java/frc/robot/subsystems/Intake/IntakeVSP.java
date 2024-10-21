package frc.robot.subsystems.intake;

import org.littletonrobotics.junction.Logger;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.AutoLog;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class IntakeVSP{
    private final VictorSP leftIn = new VictorSP();
    private final VictorSP rightIn = new VictorSP();
    public void setMotarVoltage(double power){
        leftIn.addFollower(rightIn);
        leftIn.set(power);
    }
    public void intakenothing{
        leftIn.set(0);
    }

}