import javax.swing.JOptionPane;

public class Example1week3 {

	public static void main(String[] args) 
	{
		int var = JOptionPane.showConfirmDialog(null, "Please click any button"
				,"Click Button",JOptionPane.YES_NO_CANCEL_OPTION);
		if(var == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "You clicked YES button.");
			
		}
		else if(var == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "You clicked NO button.");
		}
		else if(var == JOptionPane.CANCEL_OPTION)
		{
			JOptionPane.showMessageDialog(null, "You clicked CANCEL button.");
		}	
	}

}
