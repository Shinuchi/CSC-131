import java.awt.*;
import javax.swing.*;

// Name: Omar Betancourt
// CSC 131-5

/**
 * A window containing a PIN entry pad.
 */
public class PINPadWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	/**
     * Default Constructor.
     */
    public PINPadWindow()
    {
        super();
        setupLayout();
    }

    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout()
    {
    	// Layout this PINPadWindow
        Container     contentPane;
        Display       display;
        NumberPad     numberPad;        

        setSize(300, 300); 
        setTitle("ATM");        

        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        display = new Display();        
        contentPane.add(display, BorderLayout.NORTH);
        
        numberPad = new NumberPad(display);
        contentPane.add(numberPad, BorderLayout.CENTER);
        
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}