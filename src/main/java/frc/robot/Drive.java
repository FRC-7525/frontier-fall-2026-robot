package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drive {
    private final WPI_VictorSPX backLeftMotor = new WPI_VictorSPX(Constants.BACK_LEFT_MOTOR_PORT);
    private final WPI_VictorSPX backRightMotor = new WPI_VictorSPX(Constants.BACK_RIGHT_MOTOR_PORT);
    private WPI_VictorSPX frontLeftMotor;
    private WPI_VictorSPX frontRightMotor;
    
    private final DifferentialDrive differentialDrive = 
        new DifferentialDrive(backLeftMotor, backRightMotor);
        
    
    private final XboxController xboxController = 
        new XboxController(Constants.CONTROLLER_PORT);

    Drive() {
        if (Constants.FRONT_MOTORS_ENABLED) {
            frontLeftMotor = new WPI_VictorSPX(Constants.FRONT_LEFT_MOTOR_PORT);
            frontRightMotor = new WPI_VictorSPX(Constants.FRONT_RIGHT_MOTOR_PORT);
            backLeftMotor.follow(frontLeftMotor);
            backRightMotor.follow(frontRightMotor);

            // THE FRONT MOTORS MIGHT NEED INVERSION CONFIGURED
        }

        // the back left motor needs to be inverted
        backLeftMotor.setInverted(true);
        backRightMotor.setInverted(false);
    }

    public void teleopInit() {}
        
    public void teleopPeriodic() {
        final double speed = xboxController.getLeftY() * Constants.SPEED_MULTIPLIER;
        final double rotation = xboxController.getRightX() * Constants.ROTATION_MULTIPLIER;

        differentialDrive.arcadeDrive(
            MathUtil.applyDeadband(speed, Constants.DEADBAND),
            MathUtil.applyDeadband(rotation, Constants.DEADBAND)
        );
    }
}
