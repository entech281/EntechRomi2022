// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(DriveSubsystem drivetrain) {
    double sideY = 60;
    double sideX = 12;
    double sideH = Math.sqrt(sideY * sideY + sideX * sideX);
    double angle = Math.atan(sideX / sideY);
    addCommands(
        //new DriveDistance(0.5, sideH, drivetrain),
        new TurnDegrees(0.5, angle, drivetrain),
        new DriveDistance(0.5, sideH, drivetrain)
    );
  }
}
