package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	Random salem = new Random();
	int t = salem.nextInt(100);
	int y = salem.nextInt(100);
	int l = salem.nextInt(100);
	int e = salem.nextInt(100);
	int r = salem.nextInt(100);
	JOptionPane.showMessageDialog(null, t+", "+y+", "+l+", "+e+", "+r);
}
}
