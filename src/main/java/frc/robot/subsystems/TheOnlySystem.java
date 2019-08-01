/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The only subsystem used in this demo project.
 */
public class TheOnlySystem extends Subsystem {
  
  public enum Direction { A, B }
  public Servo channelA_open = new Servo(0);
  public Servo channelA_close = new Servo(1);
  public Servo channelB_open = new Servo(2);
  public Servo channelB_close = new Servo(3);
  public Encoder encoder = new Encoder(0, 1);

  // Just to activate the air pump. Not used.
  public Solenoid s = new Solenoid(0);

  public double setpoint = 0;

  @Override
  public void initDefaultCommand() {}

  public void ChannelAOSet(double ang) {
    // The coefficient and the constant is to correct the
    // difference between servos. Same for below.
    channelA_open.set(0.59 * ang + 0.01);
  }

  public void ChannelACSet(double ang) {
    channelA_close.set(0.57 * ang + 0.06);
  }

  public void ChannelBOSet(double ang) {
    channelB_open.set(0.59 * ang + 0.01);
  }
  
  public void ChannelBCSet(double ang) {
    channelB_close.set(0.54 * ang + 0.01);
  }
  
  public void SetChannelB(double val) {
    if (val == 1) {
      ChannelAOSet(1);
    }
    else {
      ChannelAOSet(0);
    }
    ChannelBCSet(val);
  }

  public void SetChannelA(double val) {
    if (val == 1) {
      ChannelBOSet(1);
    }
    else {
      ChannelBOSet(0);
    }
    ChannelACSet(val);
  }

  public void Log() {
    SmartDashboard.putNumber("Position", encoder.get());
    SmartDashboard.putNumber("Setpoint", setpoint);
  }
}
