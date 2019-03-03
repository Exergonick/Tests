/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
/**
 * An example command.  You can replace me with your own command.
 */
public class DriveCommand extends Command {
private Double Speed;
private Double Rotation;
private Boolean value = true;

public DriveCommand(){
requires(Robot.DriveTrain);

}
protected void initialize(){}
protected void execute(){
    if (Speed != null){


    }
}







}