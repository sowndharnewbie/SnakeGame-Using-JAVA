import javax.swing.JFrame;

public class GameFrame extends JFrame {
	//JFrame Windowing Component
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);  //window to appear on middle of our screen
	}
}
 