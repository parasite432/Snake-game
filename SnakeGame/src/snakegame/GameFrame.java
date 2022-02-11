/** 
 * Made by Jibin Gallistus following  bro code https://www.youtube.com/watch?v=bI6e6qjJ8JQ
 **/

package snakegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	
	GameFrame() {
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
