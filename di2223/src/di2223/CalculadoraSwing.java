package di2223;

import java.awt.*;
import javax.swing.*;

public class CalculadoraSwing {

	public static void main(String[] args) {
		Marco marco1 = new Marco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Lamina extends JPanel{
	
	private static final long serialVersionUID = -2495012887631989312L;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Calculando????????",100, 100);
	}
}

class Marco extends JFrame{
	
	private static final long serialVersionUID = 2894371221444677478L;

	public Marco() {

		//setSize(500, 300);
		setBounds(500,300, 600, 600);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Dimension tamañoPantalla=pantalla.getScreenSize();
		
		int altura=tamañoPantalla.height;
		int anchoPantalla=tamañoPantalla.width;
		
		setSize(anchoPantalla/2, altura/2);
		
		setLocation(anchoPantalla/4,altura/4);
		
		setTitle("Calculadora");
		
		Image icono=pantalla.getImage("https://p.kindpng.com/picc/s/107-1075239_pokeball-pixel-png-png-download-pokeball-pixel-art.png");
		
		setIconImage(icono);
		
		Lamina unalamina=new Lamina();
		
		add(unalamina);
	}
}