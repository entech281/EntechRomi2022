package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.CommandFactory;
import frc.robot.subsystems.SubsystemManager;

public class OperatorInterface {

    private Joystick driveStick;
    private JoystickButtonManager JoystickButtonManager;
    private SubsystemManager sm;
    private CommandFactory cf;

    public OperatorInterface(final SubsystemManager subMan, final CommandFactory cmdFact) {
        this.sm = subMan;
        this.cf = cmdFact;
        this.driveStick = new Joystick(RobotConstants.JOYSTICKS.DRIVER_JOYSTICK);
        this.JoystickButtonManager = new JoystickButtonManager(driveStick);

        // drivestickButtonManager.addButton(RobotConstants.DRIVER_STICK.TURN_LEFT90)
        //        .whenPressed(commandFactory.snapToYawCommand(-90.0))
        //        .add();

        // drivestickButtonManager.addButton(RobotConstants.DRIVER_STICK.TURN_RIGHT90)
        //        .whenPressed(commandFactory.snapToYawCommand( 90.0))
        //        .add();

        sm.getDriveSubsystem().setDefaultCommand ( cf.getArcadeDriveCommand(driveStick) );
    }

}
