package com.outlook.jim;

import java.awt.*;
import javax.swing.*;

public class JustaFrame extends Frame {

	public JustaFrame(){
		super();
	}
	
	public void Paint(Graphics g){
		g.drawLine(10, 10, 150, 150);
	}
	
	public static void main(String[] arg){
		JustaFrame frame = new JustaFrame();
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
