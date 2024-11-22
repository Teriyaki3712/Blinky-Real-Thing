package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LED extends SubsystemBase {
    AddressableLEDBuffer LEDBuffer1;
    AddressableLED ALED1;

    public LED(int portNum, int length) {
        this.LEDBuffer1 = new AddressableLEDBuffer(length);
        this.ALED1 = new AddressableLED(portnum);

        ALED1.setLength(LEDBuffer1.getLength());
        ALED1.setData(LEDBuffer1);
        ALED1.start();

    }
    public void setColor(Color colors){
        for(var i = 0; i < LEDBuffer1.getLength(); i++{
            LEDBuffer1.setLED(i, colors);
        }
        leds.setData(LEDBuffer1);
    }
    public Command setAllianceColor(){
        return Commands.run(() ->{
            Color color = Color.kYellow;
            if(DriverStation.getAlliance().isPresent()){
                if(DriverStation.getAlliance().get() == Alliance.Red){
                    color = Color.kRed;
                } else{
                    color = Color.kBlue;
                }
            }
            setColor(color);

        },this);
    }
    public CommandintakeColorPurple(){
        Color purple = Color.kPurple;
        return Commands.run(()-> setColor(purpble), this);
    }
    public Command SecureMotors100percent(){
        Color green = Color.kGreen;
        return Commands.run(() -> setColor(purple),this);
    }
    



}
