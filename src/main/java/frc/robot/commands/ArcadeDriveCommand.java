// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.Joystick;

public class ArcadeDriveCommand extends EntechCommandBase {
    private final DriveSubsystem m_drivetrain;
    private final Joystick m_stick;

    /**
     * Creates a new ArcadeDrive. This command will drive your robot according to the joystick
     * This command does not terminate.
     *
     * @param drivetrain The drivetrain subsystem on which this command will run
     * @param stick Joystick object
     */
    public ArcadeDriveCommand(DriveSubsystem drivetrain, Joystick stick) {
        super(drivetrain);
        m_drivetrain = drivetrain;
        m_stick = stick;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_drivetrain.arcadeDrive(m_stick);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Returns true if command should run when robot is disabled.
    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
