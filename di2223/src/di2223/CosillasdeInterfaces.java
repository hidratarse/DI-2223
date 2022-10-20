package di2223;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CosillasdeInterfaces {

	public static void main(String[] args) {
		Marco marco1 = new Marco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Lamina extends JPanel{
	
	private static final long serialVersionUID = -2495012887631989312L;
	
	private Image imagen;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File miimagen=new File("ruta");
		 try {
			 imagen=ImageIO.read(miimagen);
		} catch (Exception e) {
			System.out.println("No se encontró imagen");
		}
		
		 g.drawImage(imagen, 5, 5, null);
		
		//g.drawString("Calculando????????",100, 100);
		
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//Graphics2D g2=(Graphics2D) g;
		
		//Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		//Font fuente = new Font("Arial", Font.BOLD, 26);
		
		//g2.setFont(fuente);
		
		//g2.setColor(Color.blue);
		
		//g2.drawString("Juan", 100, 100);
		
		//g2.setFont(new Font("Arial", Font.ITALIC, 14));
		
		//g2.setColor(new Color(128, 90, 50));
		
		//g2.drawString("Curso de Java", 100, 200);
		
		//g2.draw(rectangulo);
		
		//Ellipse2D elipse = new Ellipse2D.Double();
		
		//elipse.setFrame(rectangulo);
		
		//g2.draw(elipse);
		
		//g2.draw(new Line2D.Double(100,100,300,250));
		
		//double CentroenX=rectangulo.getCenterX();
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
		
		Image icono=pantalla.getImage("https://www.seekpng.com/png/detail/604-6049751_pixel-art-poke-ball.png");
		
		setIconImage(icono);
		
		Lamina unalamina=new Lamina();
		
		add(unalamina);
	}
}