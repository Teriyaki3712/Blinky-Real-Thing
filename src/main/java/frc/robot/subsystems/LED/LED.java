package frc.robot.subsystems;


public class LED extends SubsystemBase{
    private AddressableLEDBuffer LEDBuffer1;
    private AddressableLED ALED1;

    public LED(int lengthLED, int portnum){
        LEDBuffer1 = new AddressableLEDBuffer(lengthLED);
        ALED1 = new AddressableLED(portnum);

        ALED1.setlength(LEDBuffer1.getlength());
        ALED1.setData(LEDBuffer);

        ALED1.start();
        
    }
    


}