import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

public class ATM extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel slot;
	
	private String pinEntry = "", amount = "";
	private Banknote banknote;
	private JTextPane ScreenText;
	private Card card;
	
	Timer timer = new Timer(5000, (e)->reset());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM frame = new ATM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ATM() {
		setTitle("SCREEN TOUCH ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		banknote = new Banknote();
		banknote.setVisible(false);
		banknote.setBackground(Color.GREEN);
		banknote.setBounds(423, 271, 70, 112);
		contentPane.add(banknote);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(Color.CYAN);
		panel.setBounds(110, 11, 455, 175);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ScreenText = new JTextPane();
		ScreenText.setFont(new Font("Arial", Font.BOLD, 14));
		ScreenText.setBackground(Color.CYAN);
		ScreenText.setEditable(false);
		ScreenText.setText("Welcome to Your Bank, Please enter your CARD to start...");
		ScreenText.setBounds(120, 42, 226, 54);
		panel.add(ScreenText);
		

		
		card = new Card();
		
		card.setBackground(Color.RED);
		card.setBounds(425, 290, 60, 90);
		contentPane.add(card);
		slot = new JPanel();
		slot.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		slot.setBounds(423, 224, 81, 15);
		contentPane.add(slot);
		
		//panel to put in keypad/buttons
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(203, 212, 198, 123);
		contentPane.add(btnPanel);
		btnPanel.setLayout(new GridLayout(4, 3, 0, 0));
		JButton keyPadbt1 = new JButton("1");
		JButton keyPadbt2 = new JButton("2");
		JButton keyPadbt3 = new JButton("3");
		JButton keyPadbt4 = new JButton("4");
		JButton keyPadbt5 = new JButton("5");
		JButton keyPadbt6 = new JButton("6");
		JButton keyPadbt7 = new JButton("7");
		JButton keyPadbt8 = new JButton("8");
		JButton keyPadbt9 = new JButton("9");
		JButton keypadbt0 = new JButton("0");
		//Button/Keypad action handler
		//Balance
	
		//button 1
		keyPadbt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "1";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt1.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt1);
		
		//Button 2
		keyPadbt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "2";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt2.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt2);
		
		//button #3
		keyPadbt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "3";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt3.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt3);
		//Button 4
		
		keyPadbt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "4";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt4.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt4);
		//Button 5
		keyPadbt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "5";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt5.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt5);
		//Button 6
		
		keyPadbt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "6";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt6.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt6);
		//Button 7
		
		keyPadbt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "7";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt7.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt7);
		//Button 8

		keyPadbt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "8";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt8.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt8);
		//Button 9
		keyPadbt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry += "9";
				ScreenText.setText(ScreenText.getText()+"*");
			}
		});
		keyPadbt9.setBackground(Color.GREEN);
		btnPanel.add(keyPadbt9);
		
		//Button for free space
		JButton BtSpace = new JButton("?");
		btnPanel.add(BtSpace);
		//Create a cancle button
	
		JButton BtClear = new JButton("Clear");
		BtClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinEntry = "";
				//timer.stop();
			}
		});
		BtClear.setBackground(Color.PINK);
		BtClear.setUI((ButtonUI) BasicButtonUI.createUI(BtClear));
		btnPanel.add(BtClear);
		//Button 0
		
			keypadbt0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pinEntry += "0";
					ScreenText.setText(ScreenText.getText()+"*");
				}
			});
					
			keypadbt0.setBackground(Color.GREEN);
			btnPanel.add(keypadbt0);
		// buttons to withdraw
		JButton withdarBT1 = new JButton("1");
	  
		withdarBT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				amount = "1";
				ScreenText.setText("Chosen amount: "+amount);
				System.out.println("Your New Balance"+Balance(1));
				
			}
		});
		
		withdarBT1.setBounds(128, 24, 100, 28);
		contentPane.add(withdarBT1);
		withdarBT1.setVisible(false);
		
		JButton withdraBT5 = new JButton("5");
		withdraBT5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				amount = "5";
				ScreenText.setText("Chosen amount: "+amount+"\nYour todays maximum amount of withdraw balance is: $"+Balance(5));
			}
		});
		withdraBT5.setBounds(128, 63, 100, 28);
		contentPane.add(withdraBT5);
		withdraBT5.setVisible(false);
		JButton withdraBT10 = new JButton("10");
		withdraBT10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				amount = "10";
				ScreenText.setText("Chosen amount: "+amount+"\nYour todays maximum amount of withdraw balance is: $"+Balance(10));
			}
		});
		
		JButton withdrawBT15 = new JButton("15");
		withdrawBT15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				amount = "15";
				ScreenText.setText("Chosen amount: "+amount+"\nYour todays maximum amount of withdraw balance is: $"+Balance(15));

			}
		});
		withdrawBT15.setBounds(455, 24, 100, 28);
		contentPane.add(withdrawBT15);
		withdrawBT15.setVisible(false);
		
		JButton withdrawBT20 = new JButton("20");
		withdrawBT20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if (!lblOk.isVisible()) return;
				//amount = "";
				ScreenText.setText("Chosen amount: "+amount+"\nYour maximum amount of withdraw today is 15");
				reset();

			}
		});
		withdrawBT20.setBounds(455, 63, 100, 28);
		contentPane.add(withdrawBT20);
		withdrawBT20.setVisible(false);
		
		JButton BtBalance = new JButton("Balance");
		BtBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if (!lblOk.isVisible()) return;
			
				ScreenText.setText("You can only withdraw $15 per day: "+"Your balance is: $"+Balance(0));
				reset();
			}
		});
		BtBalance.setBounds(455, 103, 100, 28);
		contentPane.add(BtBalance);
		BtBalance.setVisible(false);
		JButton btEnter = new JButton("Enter");
		btEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdarBT1.setVisible(true);
				withdraBT5.setVisible(true);
				withdraBT10.setVisible(true);
				withdrawBT15.setVisible(true);
				withdrawBT20.setVisible(true);
				BtBalance.setVisible(true);
				//if (!lblOk.isVisible()) return;
				if (pinEntry.compareTo("1234")==0) {
					if (amount.length()>0) {
						// an amount was chosen, eject note
						System.out.println("Ejecting amount: "+amount);
						ScreenText.setText("Withdarwing...\n"+"$"+amount);
						banknote.animate(amount);
						timer.start();
						
					}
					else {
						System.out.println("PIN Ok");
						ScreenText.setText("Choose amount and press Ok.");

						amount = "";
					}
				}
				else {
					System.err.println("Wrong PIN");
					ScreenText.setText("PIN was incorrect. Try again.");
					pinEntry="";
				}
				
			}
		});
		//action handler for end button
		withdraBT10.setBounds(128, 103, 100, 28);
		contentPane.add(withdraBT10);
		withdraBT10.setVisible(false);
		JButton btnCancel = new JButton("End");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				withdarBT1.setVisible(false);
				withdraBT5.setVisible(false);
				withdraBT10.setVisible(false);
				withdrawBT15.setVisible(false);
				withdrawBT20.setVisible(false);
				BtBalance.setVisible(false);
				btEnter.setVisible(false);
				btnCancel.setVisible(false);
				
				ScreenText.setText("Thankyou for using our ATM");
				System.out.println("Thankyou for using our ATM");
				
				try {
					swait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ScreenText.setText("Welcome to Your Bank, Please enter your CARD to start...");

				
			}
		});
		btnCancel.setBounds(285, 152, 100, 28);
		contentPane.add(btnCancel);
		btnCancel.setVisible(false);
		btEnter.setBounds(260, 105, 150, 46);
		contentPane.add(btEnter);
		btEnter.setVisible(false);
		JPanel outputSlot = new JPanel();
		outputSlot.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		outputSlot.setBounds(411, 265, 93, 15);
		contentPane.add(outputSlot);
		//action handiling to show the animation of card going in
		card.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card.moveToTarget(slot.getX()+10, slot.getY()+10);
	
				ScreenText.setText("Enter your PIN, and press Enter\n");
				pinEntry = "";
				
				btEnter.setVisible(true);
				btnCancel.setVisible(true);
				
			}
		});
		
		
		
		
		JPanel background = new JPanel();
		background.setBackground(Color.GRAY);
		background.setBounds(0, 5, 690,470);
		contentPane.add(background);
		
		JLabel lblIdBank = new JLabel("Your| Bank");
		lblIdBank.setIcon(new ImageIcon(getClass().getResource("logo.png")));
		lblIdBank.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_background = new GroupLayout(background);
		gl_background.setHorizontalGroup(
			gl_background.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_background.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIdBank, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(349, Short.MAX_VALUE))
		);
		gl_background.setVerticalGroup(
			gl_background.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_background.createSequentialGroup()
					.addContainerGap(343, Short.MAX_VALUE)
					.addComponent(lblIdBank, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		background.setLayout(gl_background);
	}
	
	// wait method
	
	public void swait() throws InterruptedException {
		Thread.sleep(100);
	}
	
	public int Balance(int a) {
		int balance = 15;
		if (balance-a<=0) {
			System.out.println("You have exceeded your withdraw balance.. \n please come back tommarow");
			return 0;
			
		}
		balance = balance-a;
		return balance;
	}
	public void reset() {
		pinEntry=""; 
		amount="";
		banknote.setVisible(false);
		card.setBounds(10, 245, 60, 90);
		timer.stop();
	}
}
