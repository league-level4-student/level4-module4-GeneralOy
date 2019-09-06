package testingStuff;

import javax.swing.JOptionPane;

class Super {
}

class Sub extends Super {
}

public class Number8Test/*error here()*/ {
	public static void main(String[] args) {
		Super s = new Super();
		Super t = new Sub();
		Sub u = new Sub();
		/*error hereSub v = new Super();*/
		
		String in = JOptionPane.showInputDialog("Enter some words.");
		String out = "";
		for(int i = 0; i < in.length(); i++) {
			if((i % 2 )== 0) {
				out = out + in.substring(i, i + 1).toUpperCase();
			}else {
				out = out + in.substring(i, i + 1).toLowerCase();
			}
			
		}
		System.out.println(out);
	}
}

