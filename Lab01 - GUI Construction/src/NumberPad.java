import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Name: Omar Betancourt
//CSC 131-5

/**
 * A numeric keypad
 */
public class NumberPad extends    JPanel
{
	private static final long serialVersionUID = 1L;
	private static final Font BUTTON_FONT = new Font("DejaVu Sans", Font.PLAIN, 12);
	private ActionListener listener;
	
    /**
     * Default Constructor
     * @param listener 
     */
    public NumberPad(ActionListener listener)
    {
        super();
        
        this.listener = listener; 
        setupLayout();
    }
    
    private void addButton(String text)
    {
        JButton      button;

        button = new JButton(text);
        button.setFont(BUTTON_FONT);
        button.addActionListener(listener);
        add(button);
    }


    /**
     * Setup and layout this NumberPad
     */
    private void setupLayout()
    {
        // Setup and layout this NumberPad
        setLayout(new GridLayout(4, 3));
        
        for (int i=1; i<=9; i++) addButton(String.format("%1d", i));
        addButton("DEL");
        addButton("0");
        addButton("C");
    }
}
