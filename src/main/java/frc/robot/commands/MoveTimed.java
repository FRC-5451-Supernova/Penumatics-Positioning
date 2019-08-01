/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;
import frc.robot.subsystems.TheOnlySystem.Direction;

public class MoveTimed extends TimedCommand {
  
  public Direction l_dir;

  public MoveTimed(Direction dir, double timeout) {
    super(timeout);
    requires(Robot.m_subsystem);
    l_dir = dir;
  }

  @Override
  protected void initialize() {}

  @Override
  protected void execute() {
    if (l_dir == Direction.A) {
      Robot.m_subsystem.SetChannelA(0);
      Robot.m_subsystem.SetChannelB(1);
    }
    else {
      Robot.m_subsystem.SetChannelA(1);
      Robot.m_subsystem.SetChannelB(0);
    }
  }

  @Override
  protected void end() {
    Robot.m_subsystem.SetChannelA(0);
    Robot.m_subsystem.SetChannelB(0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
