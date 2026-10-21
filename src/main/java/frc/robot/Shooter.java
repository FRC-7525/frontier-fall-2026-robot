package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Shooter {

    private boolean _isShooting = false;
    
    private VictorSP _shooterMotorController;

    public Shooter(){
        _shooterMotorController = new VictorSP(5);
    }

    public void toggleShooter() {
        _isShooting = !_isShooting;
    }

    // motor control
    public void shooterPeriodic(){
        if(_isShooting){
            _shooterMotorController.set(1);
        }
        else{
            _shooterMotorController.set(0);
        }
    }

    public enum ShooterState{
        IDLE,
        SHOOTING

        private String
    }

    
}
