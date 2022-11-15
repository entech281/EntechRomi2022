package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousCommands extends SequentialCommandGroup {

    public AutonomousCommands(DriveSubsystem drive) {
        addCommands(
            new TurnDegrees(0.5, 11.31, drive),
            new DriveDistance(0.5, 120, drive)
        );
    }
  }