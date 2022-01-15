// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import frc.robot.RobotConstants;

// This is an example subsystem that implements a simple counter that resets itself to 0 automatically
// when the robot gets disabled.  It displays the current counter value on the dashboard.

public class ExampleSubsystem extends EntechSubsystem {

    // Private objects are defined here
    private int counter;
    private boolean counter_active;

    // Create the subsystem
    public ExampleSubsystem() {
    }

    // Entech does all the creation work in the initialize method
    public void initialize() {
        // Create the internal objects here
        resetCounter();
        enableCounter();
    }

    @Override
    public void periodic() {
        incrementCounter();
        if (DriverStation.isDisabled()) {
            resetCounter();
        }
        logger.log("Example Counter",getCounter());
    }

    // These are the public methods that describe how the subsystem acts to the rest of the robot

    /**
     * Enable the counter
     */
    public void enableCounter() {
        counter_active = true;
    }

    /**
     * Disable the counter
     */
    public void disableCounter() {
        counter_active = false;
    }

    /**
     * Increment the counter by one is the counter is enabled
     */
    public void incrementCounter() {
        if (counter_active) {
            counter += 1;
        }
    }

    /**
     * Reset the counter to zero
     */
    public void resetCounter() {
        counter = 0;
    }

    /**
     * Get the current counter value
     *
     * @return The current counter value (integer)
     */
    public int getCounter() {
        return counter;
    }
}
