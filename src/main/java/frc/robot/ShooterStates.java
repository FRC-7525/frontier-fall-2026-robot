package frc.robot.Subsystems.Shooter;

import static frc.robot.Subsystems.Shooter.ShooterConstants;

import edu.wpi.first.units.measure.AngularVelocity;

public class ShooterStates {
    public enum ShooterState{
        IDLE,
        SHOOTING;

        private String stateString;
        private AngularVelocity shooterSpeed;
    }
}
