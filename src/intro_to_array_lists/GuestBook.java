package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
// all the names added to the list. Format the list as follows:
// Guest #1: Bob Banders
// Guest #2: Sandy Summers
// Guest #3: Greg Ganders
// Guest #4: Donny Doners

public class GuestBook implements ActionListener {

	ArrayList<String> names = new ArrayList<String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add a Name");
	JButton button2 = new JButton("View Names");

	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		guestBook.run();

	}

	public void run() {
		button1.addActionListener(this);
		button2.addActionListener(this);

		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 60);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			names.add(JOptionPane.showInputDialog("Enter a name. "));
		} else if (e.getSource() == button2) {
			for (int i = 0; i < names.size(); i++) {
				int a = i + 1;
				System.out.println("Guest #" + a + ": " + names.get(i));
			}

			System.out.println("\n");

		}
	}
}
