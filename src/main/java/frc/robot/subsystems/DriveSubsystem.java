// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotConstants;
import frc.robot.sensors.RomiGyro;

public class DriveSubsystem extends EntechSubsystem {
  private static final double kCountsPerRevolution = 1440.0;
  private static final double kWheelDiameterInch = 2.75591; // 70 mm

  // The Romi has the left and right motors set to
  // PWM channels 0 and 1 respectively
  private Spark m_leftMotor;
  private Spark m_rightMotor;

  // The Romi has onboard encoders that are hardcoded
  // to use DIO pins 4/5 and 6/7 for the left and right
  private Encoder m_leftEncoder;
  private Encoder m_rightEncoder;

  // differential drive controller
  private DifferentialDrive m_diffDrive;

  // RomiGyro and Accelerometer
  private RomiGyro m_gyro;
  private BuiltInAccelerometer m_accelerometer;

  public DriveSubsystem() {
  }

  // Entech does all the creation work in the initialize method
  public void initialize() {
    // Create motor controllers and the differential drive
    m_leftMotor = new Spark(RobotConstants.PWM.LEFT_MOTOR);
    m_rightMotor = new Spark(RobotConstants.PWM.RIGHT_MOTOR);
    m_diffDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);

    // Create the drive sensors
    m_gyro = new RomiGyro();
    m_accelerometer = new BuiltInAccelerometer();

    // Create encoders and use inches as unit for encoder distances
    m_leftEncoder = new Encoder(RobotConstants.DIGITAL_IO.LEFT_MOTOR_ENCODER_A, RobotConstants.DIGITAL_IO.LEFT_MOTOR_ENCODER_B);
    m_rightEncoder = new Encoder(RobotConstants.DIGITAL_IO.RIGHT_MOTOR_ENCODER_A, RobotConstants.DIGITAL_IO.RIGHT_MOTOR_ENCODER_B);
    m_leftEncoder.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
    m_rightEncoder.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
    resetEncoders();
  }

  @Override
  public void periodic() {
    // Exercise 1: Send some current drive status (e.g. gyro angle, motor speeds, encoder values, accelerations) to the SmartDashBoard
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(Joystick js) {
    // Exercise 1: Use m_diffDrive and Joytick to make the robot move
  }

  public void arcadeDrive(double xSpeed, double zRotation) {
    m_diffDrive.arcadeDrive(xSpeed, zRotation);
  }

  public void resetEncoders() {
    m_leftEncoder.reset();
    m_rightEncoder.reset();
  }

  public int getLeftEncoderCount() {
    return m_leftEncoder.get();
  }

  public int getRightEncoderCount() {
    return m_rightEncoder.get();
  }

  public double getLeftDistanceInch() {
    return m_leftEncoder.getDistance();
  }

  public double getRightDistanceInch() {
    return m_rightEncoder.getDistance();
  }

  public double getAverageDistanceInch() {
    return (getLeftDistanceInch() + getRightDistanceInch()) / 2.0;
  }

  /**
   * The acceleration in the X-axis.
   *
   * @return The acceleration of the Romi along the X-axis in Gs
   */
  public double getAccelX() {
    return m_accelerometer.getX();
  }

  /**
   * The acceleration in the Y-axis.
   *
   * @return The acceleration of the Romi along the Y-axis in Gs
   */
  public double getAccelY() {
    return m_accelerometer.getY();
  }

  /**
   * The acceleration in the Z-axis.
   *
   * @return The acceleration of the Romi along the Z-axis in Gs
   */
  public double getAccelZ() {
    return m_accelerometer.getZ();
  }

  /**
   * Current angle of the Romi around the X-axis.
   *
   * @return The current angle of the Romi in degrees
   */
  public double getGyroAngleX() {
    return m_gyro.getAngleX();
  }

  /**
   * Current angle of the Romi around the Y-axis.
   *
   * @return The current angle of the Romi in degrees
   */
  public double getGyroAngleY() {
    return m_gyro.getAngleY();
  }

  /**
   * Current angle of the Romi around the Z-axis.
   *
   * @return The current angle of the Romi in degrees
   */
  public double getGyroAngleZ() {
    return m_gyro.getAngleZ();
  }

  /** Reset the gyro. */
  public void resetGyro() {
    m_gyro.reset();
  }
}
