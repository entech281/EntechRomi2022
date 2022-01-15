package frc.robot.subsystems;

// Exercise 2: Add the OnboardIO subsystem to the subsystem manager.  
// This involves storing the subsystem privately in this class, initializing it, and providing a get method.
// You can use the drive subsystem as an example.

public class SubsystemManager {
    private DriveSubsystem driveSubsystem;

    public SubsystemManager() {
    }

    public DriveSubsystem getDriveSubsystem() {
        return driveSubsystem;
    }


    public void initAll() {
        driveSubsystem = new DriveSubsystem();

        driveSubsystem.initialize();
    }
}
