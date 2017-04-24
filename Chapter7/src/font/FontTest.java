package font;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * Created by Administrator on 2017/4/24.
 */
public class FontTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
        {
            JFrame frame = new FontFrame();
            frame.setTitle("FontTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    });
    }

}

/**
 * A frame with a text message component.
 */
class FontFrame extends JFrame
{
    public FontFrame()
    {
        add(new FontComponent());
        pack();
    }
}

/**
 * A componnet that shows a centerd message in a box.
 */
class FontComponent extends JComponent
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        String message = "Hello World!";
        Font f = new Font("Serif", Font.BOLD, 36);
        g2.setFont(f);

        //mwasure the size of the message.
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        //set(x,y) = top left corner of text
        double x = (getWidth() - bounds.getWidth() / 2);
        double y = (getHeight() - bounds.getHeight() / 2);

        //add ascent to y to erach the baseline
        double ascent = -bounds.getY();
        double baseY = y + ascent;

        //draw the memsage
        g2.drawString(message, (int)x, (int)baseY);

        g2.setPaint(Color.LIGHT_GRAY);

        //draw the baseline
        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

        //draw the enclosing rectangle
        Rectangle2D rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH ,DEFAULT_HEIGHT);
    }
}
