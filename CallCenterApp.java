/*
CallCenter.java
Umer Iqbal
30 04 2018
*/
	import javax.swing.*;
	public class CallCenterApp{
		public static void main(String args){
			//var
			 String name;
			 String location;
			 String number;
			 String verdict;
			 String voucher;
		//objects
		CallCenter myCallCenter;
		myCallCenter= new CallCenter();
		//input
		name=JOptionPane.showInputDialog(null,"Please enter your name");
		myCallCenter.setName(name);

		location=JOptionPane.showInputDialog(null,"Please enter your name");
		myCallCenter.setLocation(location);

		number=JOptionPane.showInputDialog(null,"Please enter your name");
		myCallCenter.setNumber(number);

		//compute
		myCallCenter.compute();




}
}