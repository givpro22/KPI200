package stock_game_1.copy;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ScretNote {
	private Image screenImage;
	private Graphics screenGraphic;

	// 배경화면 타이틀
	private Image title = new ImageIcon(Main.class.getResource("/images/title.png")).getImage();// kpx200의 그림 제목 title

	// 메뉴바 시작하기 구성
	private ImageIcon start_mover = new ImageIcon(Main.class.getResource("/images/start_mover.png"));
	private ImageIcon start_mdown = new ImageIcon(Main.class.getResource("/images/start_mdown.png"));

	private ImageIcon seed = new ImageIcon(Main.class.getResource("/images/seed.png"));

	// 메뉴바 시작하기 클릭시
	private JButton startButton = new JButton(start_mover);
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScretNote window = new ScretNote();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScretNote() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	}

}
