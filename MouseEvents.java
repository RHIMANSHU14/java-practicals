import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents extends applet implements MouseListener ,MouseMotionListener
{
	String msg=" ";
	int mousex=0,mousey=0;
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvents me)
	{
		mousex=0;
		mousey=10;
		msg="MouseClicked";
		repaint();
	}
	
	public void mouseEntered(MouseEvents me)
	{
		mousex=0;
		mousey=10;
		msg="MouseEntered";
		repaint();
	}

	public void mouseExited(MouseEvents me)
	{
		mousex=0;
		mousey=10;
		msg="MouseExited";
		repaint();
	}

	public void mousePressed(MouseEvents me)
	{
		mousex=0;
		mousey=10;
		msg="Down";
		repaint();
	}

	public void mouseReleased(MouseEvents me)
	{
		mousex=0;
		mousey=10;
		msg="up";
		repaint();
	}

	public void mouseDragged(MouseEvents me)
	{
		mousex=me.getx();
		mousey=me.gety();
		showstatus("Dragging Mouse at   "+mousex+" , "+mousey);
	}

	public void mouseMoved(MouseEvents me)
	{
		mousex=me.getx();
		mousey=me.gety();
		showstatus("Moving Mouse at   "+mousex+" , "+mousey);
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,mousex,mousey);
	}
}
