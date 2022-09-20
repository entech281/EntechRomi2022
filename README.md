# EntechRomi
Romi project using Entech classes and robot organization.  This code is NOT complete.  It is meant as a training exercise for new programmers.

Exercises
---------
 1. Hook up the drive subsystem to the joystick input.
    Hint: From the OperatorInterface, see what command is run by default for the drive subsystem.  Look in that command
    and see what method is being used in the DriveSusbsystem.  Look at what that method does.
 2. Add output to SmartDashboard for drive subsystem status (e.g. gyro angle, speed, accelerations, ...)
    Hint: use logger
 3. Get automomous working.
    Hint: The CommandFactory returns null for the autonomous command.  Have it use the AutonomousDistance command.
 4. Provide a command that when a button on the joystick is pressed, moves the robot forward by 6 inches

 5. Create a OnBoardIO subsystem that extends EntechSubsystem and has access the LEDs (more details needed here)
 6. Pick an LED and provide a LED on/off method(s) for the subsystem
 7. Provide an EntechCommand (or commands) that turns the LED on/off
 8. Connect the LED to a button on the joystick.  The button can either be a toggle (press -> off -> press -> on) or hold on, release off
 9. Make the previous command(s) run when robot is disabled

Preparation
-----------
 1. Get (Download) and install "git" for your computer from git-scm.org
 2. Get (Download) and install WPI tools following the instructions on the FIRST web site (docs.wpilib.org)
 3. Create a directory to hold all your robot programming projects (what is the default in vscode??)
 4. Open a git command window in the directory you created in step 3 and set some default git parameters
       git config user.name _your name_
       git config user.email _your@email_
 5. Issue the following command to clone the example code and create your open branch to work on:
       git clone https://github.com/entech281/EntechRomi
       git branch _INITIALS-start01_
 6. Start VSCODE and use "File | Open Directory ..." and select the EntechRomi directory

Exercise 1 Details
------------------
