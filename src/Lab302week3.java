import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lab302week3 {
	public static void main(String[] args)
	{
	DecimalFormat frm = new DecimalFormat("#,###.0");
	String weight = JOptionPane.showInputDialog("Input Weight");
	double Weight = Double.parseDouble(weight);
	String height = JOptionPane.showInputDialog("Input Height");
	double Height = Double.parseDouble(height);
	Height = Height/100;
	double bmi = Weight/(Height*Height);
	
	if (bmi < 18.5)
	{
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+
				"\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);

	}
	else if(bmi >= 18.5 && bmi <= 24.9)
	{
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+
				"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);

	}
	else if(bmi >= 20.5 && bmi <= 29.9)
	{
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+
				"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);

	}
	else if(bmi >= 30.0)
	{
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+
				"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);

	}
}

}
