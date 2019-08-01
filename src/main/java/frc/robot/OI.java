/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DefaultMovement;
import frc.robot.commands.MoveToward;
import frc.robot.subsystems.TheOnlySystem.Direction;

public class OI {
  public XboxController stick = new XboxController(0);
  Button buttonA = new JoystickButton(stick, 1);
  Button buttonB = new JoystickButton(stick, 2);
  Button buttonX = new JoystickButton(stick, 3);

  public OI () {
    buttonA.whileHeld(new MoveToward(Direction.B));
    buttonB.whileHeld(new MoveToward(Direction.A));
    buttonX.toggleWhenPressed(new DefaultMovement());
  }
}
