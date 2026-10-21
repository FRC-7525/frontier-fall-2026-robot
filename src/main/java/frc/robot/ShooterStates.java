package frc.robot.System.Shooter;

import edu.wpi.first.units.measure.AngularVelocity;

public class ShooterStates {
    public enum ShooterState{
        IDLE,
        SHOOTING;

        private String stateString;
        private AngularVelocity shooterSpeed;
    }
}
