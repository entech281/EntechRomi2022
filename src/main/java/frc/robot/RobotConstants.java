// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class RobotConstants {
    public interface PWM {
        public static final int LEFT_MOTOR = 0;
        public static final int RIGHT_MOTOR = 1;
    }
    public interface JOYSTICKS {
        public static final int DRIVER_JOYSTICK = 0;
    }
    public interface DRIVER_STICK {
        public static final int TURN_LEFT90 = 2;
        public static final int TURN_RIGHT90 = 3;
    }
    public interface DIGITAL_IO {
        public static final int BUTTON_A = 0;
        // Normally, the values would not be duplicated, but the this ROMI DIO can be either an input (button) or output (LED)
        public static final int BUTTON_B = 1;
        public static final int GREEN_LED = 1;
        public static final int BUTTON_C = 2;
        public static final int RED_LED = 2;
        public static final int YELLOW_LED = 3;
        public static final int LEFT_MOTOR_ENCODER_A = 4;
        public static final int LEFT_MOTOR_ENCODER_B = 5;
        public static final int RIGHT_MOTOR_ENCODER_A = 6;
        public static final int RIGHT_MOTOR_ENCODER_B = 7;
    }
}
