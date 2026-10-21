package frc.robot;

class IntakeSubsystem {
    public enum IntakePositions{
        DOWN,
        UP
    }

    public IntakePositions CurrentIntakePosition = IntakePositions.DOWN;

    public void ChangeIntakePositions() {
        if (CurrentIntakePosition == IntakePositions.DOWN){
            
            CurrentIntakePosition = IntakePositions.UP;
        }else{
            CurrentIntakePosition = IntakePositions.DOWN;
        }



    



    }

    public static void main(String[] args){


        //ChangeIntakePositions();
        IntakeSubsystem sub = new IntakeSubsystem();
        sub.ChangeIntakePositions();
        System.out.println(sub.CurrentIntakePosition);

    }

}
    



