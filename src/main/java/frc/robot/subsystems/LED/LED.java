package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LED extends SubsystemBase {
    private AddressableLEDBuffer LEDBuffer1;
    private AddressableLED ALED1;

    public LED(int lengthLED, int portnum) {
        LEDBuffer1 = new AddressableLEDBuffer(lengthLED);
        ALED1 = new AddressableLED(portnum);

        ALED1.setLength(LEDBuffer1.getLength());
        ALED1.setData(LEDBuffer1);

        ALED1.start();

    }



}
