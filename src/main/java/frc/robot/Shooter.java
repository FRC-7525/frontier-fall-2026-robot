package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;


public class Shooter {

    private boolean _isShooting = false;
    
    private final PWMVictorSPX _shooterMotorController;

    public Shooter(){
        _shooterMotorController = new PWMVictorSPX(5);
    }

    public void toggleShooter() {
        _isShooting = !_isShooting;
    }

    // motor control
    public void shooterPeriodic(){
        if(_isShooting){
            _shooterMotorController.set(1.0);
        }
        else{
            _shooterMotorController.set(0.0);
        }
    }
    
}
