import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import com.sun.glass.ui.Pixels.Format;

public class Lab301 {
	
	public static void main(String[] args)
	{
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int buffet = 299;
		String numcustomer = JOptionPane.showInputDialog("How many customber per bill?");
		int numbercustomer = Integer.parseInt(numcustomer);
		double total = numbercustomer*buffet;
		int choice = JOptionPane.showConfirmDialog(null,"Total Price is "
				+frm.format(total) +" baht."+"\nDo you have a member card"
				,"Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
		while(choice ==JOptionPane.CANCEL_OPTION)
		{
			choice = JOptionPane.showConfirmDialog(null,"Total Price is "
					+frm.format(total) +" baht."+"\nDo you have a member card"
					,"Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
		}
		if (choice == JOptionPane.YES_OPTION)
		{
			total = total - (total*0.1);
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(total)
					+" baht.");
		}
		else if (choice == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(total)
			+" baht.");
		}
		
		
	}

}
