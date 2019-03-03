/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.Joystick;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public XboxController xbox = new XboxController(1);
  
boolean clickedA = xbox.getAButton();
boolean clickedB = xbox.getBButton();
 boolean clickedY = xbox.getYButton();
boolean clickedX = xbox.getXButton();
		
 
       boolean clicked7 = xbox.getBButton();
public Joystick m_rightStick = new Joystick(0);            
Double driveSpeed =  m_rightStick.getThrottle();

}
