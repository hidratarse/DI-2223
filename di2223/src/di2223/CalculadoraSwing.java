package di2223;

import javax.swing.*;

public class CalculadoraSwing {

	public static void main(String[] args) {
		Marco marco1 = new Marco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Marco extends JFrame{
	/**
	 * Nose pa que sirve esto.
	 */
	private static final long serialVersionUID = 1L;

	public Marco() {
		//setSize(500, 300);
		setBounds(500,300, 600, 600);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Calculadora");
	}
}