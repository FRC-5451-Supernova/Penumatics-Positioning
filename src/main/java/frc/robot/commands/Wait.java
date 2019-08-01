/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 * Sleep for a while.
 */
public class Wait extends TimedCommand {
  public Wait(double timeout) {
    super(timeout);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
  }

  @Override
  protected void end() {}

  @Override
  protected void interrupted() {}
}
