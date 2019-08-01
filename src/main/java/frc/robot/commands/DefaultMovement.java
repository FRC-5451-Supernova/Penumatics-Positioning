/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.subsystems.TheOnlySystem.Direction;

public class DefaultMovement extends CommandGroup {
  /**
   * A series of demostration movements controlled by timing.
   */
  public DefaultMovement() {
    addSequential(new MoveTimed(Direction.A, 0.2));
    addSequential(new Wait(0.25));
    addSequential(new MoveTimed(Direction.A, 0.4));
    addSequential(new Wait(0.25));
    addSequential(new MoveTimed(Direction.B, 0.4));
    addSequential(new Wait(0.1));
    addSequential(new MoveTimed(Direction.A, 0.25));
    addSequential(new Wait(0.1));
    addSequential(new MoveTimed(Direction.B, 0.3));
    addSequential(new Wait(0.1));
    addSequential(new MoveTimed(Direction.A, 0.2));
    addSequential(new Wait(0.1));
    addSequential(new MoveTimed(Direction.A, 0.2));
    addSequential(new Wait(1));
    
    // Move to origin point.
    addSequential(new MoveTimed(Direction.B, 1));
    addSequential(new Wait(1));
  }
}
