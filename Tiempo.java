package cert;
import javax.swing.*;
import java.awt.Font;
import java.util.*;
public class Tiempo extends JLabel implements Runnable {
	public Calendar date;
	public int horas;
	public int minutos;
	public int segundos;
	public void run() {
		setBounds(0,0,100,20);
		setFont(new java.awt.Font("Verdana",3,15));
		
		while (true) {
			try {
				Thread.sleep(100);
				date=Calendar.getInstance();
				horas=date.get(Calendar.HOUR);
				minutos=date.get(Calendar.MINUTE);
				segundos=date.get(Calendar.SECOND);
				setText(horas+":"+minutos+":"+segundos);
				repaint();
			} catch (Exception e) {
			
			}
		}
	}
}
