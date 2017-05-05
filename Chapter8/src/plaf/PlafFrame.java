package plaf;

import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Administrator on 2017/5/5.
 * A frame with a button panel for changing look-and-feel.
 */
public class PlafFrame extends JFrame
{
    private JPanel buttonPanel;
    public PlafFrame()
    {
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();

        for(UIManager.LookAndFeelInfo info : infos)
            makeButton(info.getName(), info.getClassName());

        add(buttonPanel);
        pack();
    }

    /**
     * Makes a button to change the pluggable look-and-feel.
     */
    void makeButton(String name, final String plafName)
    {
        //add button to panel

        JButton button = new JButton(name);
        buttonPanel.add(button);

        //set button action

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                //button aciton: switch to the new look-and-feel
                try
                {
                    UIManager.setLookAndFeel(plafName);
                    SwingUtilities.updateComponentTreeUI(PlafFrame.this);
                    pack();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        });
    }
}