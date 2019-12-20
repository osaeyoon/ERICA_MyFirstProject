import java.awt.*;
import javax.swing.*;

public class Frame1 extends JFrame {
	public Frame1() {
		JLabel label = new JLabel("Press This: ");
		JButton button = new JButton("OK");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);
		c.add(button);
		setTitle("Example1");
		setSize(200, 60);
		setVisible(true);
	}

	public static void main(String[] args) { new Frame1(); }

}

