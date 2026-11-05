package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.units.measure.Voltage;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Drive {
    private final VictorSPX backLeftMotor = new VictorSPX(1);
    private final VictorSPX frontLeftMotor = new VictorSPX(4);
    private final VictorSPX backRightMotor = new VictorSPX(2);
    private final VictorSPX frontRightMotor = new VictorSPX(3);

//    private final DifferentialDrive differentialDrive = 
        
    
    private final XboxController xboxController = 
        new XboxController(0);

    Drive() {
        //frontLeftMotor.addFollower(backLeftMotor);
        //frontRightMotor.addFollower(backRightMotor);
        System.out.println("it works!");
    }

    public void teleopInit() {
        //0backLeftMotor.set(2);
       // Voltage v = Voltage.ofRelativeUnits(5, null);
        //frontRightMotor.setVoltage(5);
    }
        
    public void teleopPeriodic() {
        final double speed = -xboxController.getLeftY();
        final double rotation = xboxController.getRightX();
        //frontRightMotor.setVoltage(5);
        System.out.println("speed: " + speed);
        
        //backLeftMotor.set(VictorSPXControlMode.PercentOutput, 1);
        //backRightMotor.set(VictorSPXControlMode.PercentOutput, 1);
        frontLeftMotor.set(VictorSPXControlMode.PercentOutput, 1);
        frontRightMotor.set(VictorSPXControlMode.PercentOutput, 1);
        /* 
        differentialDrive.arcadeDrive(
            MathUtil.applyDeadband(speed, Constants.DEADBAND),
            MathUtil.applyDeadband(rotation, Constants.DEADBAND)
        );
        */
       // backLeftMotor.set(1);
    }
}
