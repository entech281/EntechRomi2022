package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SubsystemManager;
/**
 *
 * @author dcowden
 */
public class CommandFactory {

    private final SubsystemManager sm;
    public CommandFactory(SubsystemManager subsystemManager){
        this.sm = subsystemManager;
    }

    // ********** START OF ELEVATOR AND INTAKE COMMANDS

    public Command driveDistance(double speed, double distance){
        return new DriveDistance(speed,distance,sm.getDriveSubsystem());
    }

    public Command snapToYawCommand(double angle) {
        return null;
    }
    public Command getAutonomousCommand(){
        return new AutonomousDistance(sm.getDriveSubsystem());
    }
    public Command getArcadeDriveCommand( Joystick stick ) {
        return new ArcadeDriveCommand(sm.getDriveSubsystem(), stick);
    }
}
