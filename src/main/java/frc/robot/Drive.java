package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Drive {
    private final PWMSparkMax leftMotor = new PWMSparkMax(0);
    private final PWMSparkMax rightMotor = new PWMSparkMax(1);
    
    private final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor, rightMotor);
    
    private final XboxController xboxController = new XboxController(0);

    public void teleopPeriodic() {
        final double speed = -xboxController.getLeftY();
        final double rotation = xboxController.getRightX();

        differentialDrive.arcadeDrive(
            MathUtil.applyDeadband(speed, Constants.DEADBAND),
            MathUtil.applyDeadband(rotation, Constants.DEADBAND)
        );
    }
}
