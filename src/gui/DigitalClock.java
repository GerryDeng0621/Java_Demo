/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

package gui;
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.text.*;

public class DigitalClock extends Applet implements Runnable {
    Thread timer;                // The thread that displays clock
    DateFormat formatter;        // Formats the date displayed
    String lastdate;             // String to hold date displayed
    Date currentDate;            // Used to get date to display
    Color numberColor;           // Color of numbers
    Font clockFaceFont;
    Locale locale;
    String language, country;

    public void init() {
        numberColor = Color.black;
        locale = Locale.CHINA;

        try {
            setBackground(new Color(Integer.parseInt(getParameter("bgcolor"),16)));
        } catch (Exception E) { }
        try {
            numberColor = new Color(Integer.parseInt(getParameter("fgcolor"),16));
        } catch (Exception E) { }

        formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
        currentDate = new Date();
        lastdate = formatter.format(currentDate);
        clockFaceFont = new Font("Sans-Serif", Font.PLAIN, 14);
        resize(275,25);              // Set clock window size
    }

    // Paint is the main part of the program
    public void paint(Graphics g) {
        String today;
        currentDate = new Date();
        formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
        today = formatter.format(currentDate);
 				g.setFont(clockFaceFont);

   		  // Erase and redraw
        g.setColor(getBackground());
           g.drawString(lastdate, 0, 12);

        g.setColor(numberColor);
           g.drawString(today, 0, 12);
        lastdate = today;
        currentDate=null;
    }

    public void start() {
        timer = new Thread(this);
        timer.start();
    }

    public void stop() {
        timer = null;
    }

    public void run() {
        Thread me = Thread.currentThread();
        while (timer == me) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
            }
            repaint();
        }
    }

    public void update(Graphics g) {
        paint(g);
    }

    public String getAppletInfo() {
        return "Digital Clock.";
    }

    public String[][] getParameterInfo() {
        String[][] info = {
            {"bgcolor", "hexadecimal RGB number", "The background color. Default is the color of your browser."},
            {"fgcolor", "hexadecimal RGB number", "The color of the date."}
        };
        return info;
    }
}
