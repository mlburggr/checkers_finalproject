/******************************************
*                                         
* Official Name:  Maxwell Burggraf       
*                                         
* Nickname:  Max                      
*                                         
* E-mail:  mlburggr@syr.edu             
*                                         
* Final Project:  2-player checkers game              
*                                         
* Compiler:  drJava on a pc            
*                                         
* Date:  Dec. 2, 2013              
*                                         
*******************************************/
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
public class GameOverPanelBlack extends JPanel {
  private boolean playPressed=false;
  public GameOverPanelBlack(String playername){
    setLayout(null);
    setPreferredSize(new Dimension(500, 500));
    setBackground(Color.black);
    //DR
    JLabel title = new JLabel("");
    title.setText("<html><font color='white'><font size=30>"+playername+" wins!!!</font></html>");
    title.setLocation(175,0);
    title.setSize(200,200);
    JLabel credit = new JLabel("<html><font color='white'>Go back to main menu?</font></html>");
    credit.setLocation(200,0);
    credit.setSize(100,300);
    JButton play = new JButton("Main Menu");
    play.setLocation(220,350);
    play.setSize(100,50);
    add(title);
    add(credit);
    play.addActionListener(new ButtonListener());
    add(play);
    
  }
  
  //LI
   private class ButtonListener implements ActionListener
  {

    public void actionPerformed(ActionEvent event)
    {
    setVisible(false);
    JFrame window = new JFrame("Checkers");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TitlePanel game = new TitlePanel();
    window.getContentPane().add(game);
    window.pack();
    window.setVisible(true);
    window.setBackground(Color.black);
    window.setResizable(false);
    }
  }
   public boolean isPressed(){
     return playPressed;
   }
}