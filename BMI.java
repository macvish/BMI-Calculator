import javax.swing.*;
public class BMI
{
public static void main(String[]args)
{
JOptionPane.showMessageDialog(null, "Welcome to the Body Mass Index Calculator!", "BMI", JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null, "BMI Values: \n\nUnderweight: Less than 18.5\nNormal: From 18.5 to 24.9\nOverweight: From 25 to 29.5\nObese: 30 and above", "SPECIFICATIONS", JOptionPane.PLAIN_MESSAGE);
float myweight;
float myheight;
String weight = JOptionPane.showInputDialog(null, "Input your weight in kilograms", "WEIGHT");
String height = JOptionPane.showInputDialog(null, "Input your height in metres", "HEIGHT");
myweight = Float.parseFloat(weight);
myheight = Float.parseFloat(height);
float myBmi = (myweight)/(myheight*myheight);
JOptionPane.showMessageDialog(null, "Your BMI is" + myBmi);
if (myBmi >= 30)
{
JOptionPane.showMessageDialog(null, "You are obese");
}
else if (myBmi >= 25)
{
JOptionPane.showMessageDialog(null, "You are overweight");
}
else if (myBmi >= 18.5)
{
JOptionPane.showMessageDialog(null, "You are normal");
}
else
{
JOptionPane.showMessageDialog(null, "You are underweight");
}
}
}