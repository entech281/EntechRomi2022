// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.EntechSubsystem;

public class ExampleCommand extends EntechCommandBase {
    private final EntechSubsystem m_subsys;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsys The subsystem on which this command will run
   */
    public ExampleCommand(EntechSubsystem subsys) {
      super(subsys);
      m_subsys = subsys;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }

    // Returns whether this command should run when disabled
    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
