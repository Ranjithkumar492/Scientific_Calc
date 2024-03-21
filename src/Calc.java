import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double no1;
	double no2;
	double total;
	
	String action;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 28));
		textField.setBounds(44, 11, 535, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 24));
		btn4.setBounds(44, 189, 76, 46);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 24));
		btn7.setBounds(44, 140, 76, 46);
		frame.getContentPane().add(btn7);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setForeground(new Color(255, 255, 255));
		btnSin.setBackground(Color.GRAY);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				double s=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("sin value =");
				textField.setText(textField.getText()+s);
				}
			}
		});
		btnSin.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSin.setBounds(44, 92, 76, 46);
		frame.getContentPane().add(btnSin);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Calibri", Font.BOLD, 24));
		btn1.setBounds(44, 238, 76, 46);
		frame.getContentPane().add(btn1);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setForeground(Color.WHITE);
		btnCos.setBackground(Color.GRAY);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				double s=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("cos value =");
				textField.setText(textField.getText()+s);
				}
			}
		});
		btnCos.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCos.setBounds(130, 92, 70, 46);
		frame.getContentPane().add(btnCos);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 24));
		btn8.setBounds(130, 140, 70, 46);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Calibri", Font.BOLD, 24));
		btn5.setBounds(130, 189, 70, 46);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 24));
		btn2.setBounds(130, 238, 70, 46);
		frame.getContentPane().add(btn2);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setForeground(Color.WHITE);
		btnTan.setBackground(Color.GRAY);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				double s=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("tan value =");
				textField.setText(textField.getText()+s);
			}
			}
		});
		btnTan.setFont(new Font("Calibri", Font.BOLD, 24));
		btnTan.setBounds(204, 92, 80, 46);
		frame.getContentPane().add(btnTan);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 24));
		btn9.setBounds(204, 140, 80, 46);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
			
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 24));
		btn6.setBounds(204, 189, 80, 46);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 24));
		btn3.setBounds(204, 238, 80, 46);
		frame.getContentPane().add(btn3);
		
		JButton btnB = new JButton("B");
		btnB.setForeground(new Color(0, 0, 0));
		btnB.setBackground(new Color(255, 69, 0));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck=str.toString();
					textField.setText(bck);
				}
			}
		});
		btnB.setFont(new Font("Calibri", Font.BOLD, 24));
		btnB.setBounds(294, 92, 80, 46);
		frame.getContentPane().add(btnB);
		
		JButton btnSqr = new JButton("x^2");
		btnSqr.setForeground(Color.WHITE);
		btnSqr.setBackground(Color.GRAY);
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				double x= Double.parseDouble(textField.getText());
				x=x*x;
				textField.setText("square value = ");
				textField.setText(textField.getText()+x);
			}
			}
		});
		btnSqr.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSqr.setBounds(294, 140, 80, 46);
		frame.getContentPane().add(btnSqr);
		
		JButton btnCube = new JButton("x^3");
		btnCube.setForeground(Color.WHITE);
		btnCube.setBackground(Color.GRAY);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				double x= Double.parseDouble(textField.getText());
				x=x*x*x;
				textField.setText("cube value = ");
				textField.setText(textField.getText()+x);
				}
			}
		});
		btnCube.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCube.setBounds(294, 189, 80, 46);
		frame.getContentPane().add(btnCube);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.setForeground(Color.WHITE);
		btnSqrt.setBackground(Color.GRAY);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				double sqrt=Double.parseDouble(textField.getText());
				sqrt=Math.sqrt(sqrt);
				textField.setText("sqrt value = ");
				textField.setText(textField.getText()+sqrt);
			}
			}
		});
		btnSqrt.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSqrt.setBounds(294, 238, 80, 46);
		frame.getContentPane().add(btnSqrt);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 24));
		btn0.setBounds(44, 291, 156, 46);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Calibri", Font.BOLD, 24));
		btnDot.setBounds(204, 291, 80, 46);
		frame.getContentPane().add(btnDot);
		
		JButton btnEql = new JButton("=");
		btnEql.setForeground(new Color(0, 0, 0));
		btnEql.setBackground(new Color(255, 0, 0));
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				if(textField.getText().contains("^")) {
					String s=textField.getText(); String str="";
					for(int i=s.length()-1;i>=0;i--) {
						if(s.charAt(i)=='^')
							break;
						else
							str=str+s.charAt(i);
					}
					no2=Double.parseDouble(str);
					double x=Math.pow(no1, no2);
					textField.setText("power value = ");
					textField.setText(textField.getText()+x);

				}else {
				
				no2=Double.parseDouble(textField.getText());
				if(action=="+") {
					total=no1+no2;
					answer=String.format("%.1f + %.1f = %.2f",no1,no2,total);
					textField.setText(answer);
				}else if(action=="-") {
					total=no1-no2;
					answer=String.format("%.1f - %.1f = %.2f",no1,no2,total);
					textField.setText(answer);
				}else if(action=="*") {
					total=no1*no2;
					answer=String.format("%.1f * %.1f = %.2f",no1,no2,total);
					textField.setText(answer);
				}else if(action=="/") {
					total=no1/no2;
					answer=String.format("%.1f / %.1f = %.2f",no1,no2,total);
					textField.setText(answer);
				}
			}
			}
			}
		});
		btnEql.setFont(new Font("Calibri", Font.BOLD, 24));
		btnEql.setBounds(294, 291, 168, 46);
		frame.getContentPane().add(btnEql);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setBackground(new Color(0, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Calibri", Font.BOLD, 24));
		btnC.setBounds(384, 92, 195, 46);
		frame.getContentPane().add(btnC);
		
		JButton btnFact = new JButton("x!");
		btnFact.setForeground(Color.WHITE);
		btnFact.setBackground(Color.GRAY);
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				double fact=1;
				for(int i=2;i<=no1;i++) {
					fact=fact*i;
				}
				textField.setText(no1+"! = ");
				textField.setText(textField.getText()+fact);
			}
			}
		});
		btnFact.setFont(new Font("Calibri", Font.BOLD, 24));
		btnFact.setBounds(384, 140, 80, 46);
		frame.getContentPane().add(btnFact);
		
		JButton btnLog = new JButton("Log");
		btnLog.setForeground(Color.WHITE);
		btnLog.setBackground(Color.GRAY);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				double a=Math.log(no1);
				textField.setText("log value = ");
				textField.setText(textField.getText()+a);
			}
			}
		});
		btnLog.setFont(new Font("Calibri", Font.BOLD, 24));
		btnLog.setBounds(384, 189, 80, 46);
		frame.getContentPane().add(btnLog);
		
		JButton btnPow = new JButton("x^y");
		btnPow.setForeground(Color.WHITE);
		btnPow.setBackground(Color.GRAY);
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				textField.setText(no1 + "^");	
				}
			}
		});
		btnPow.setFont(new Font("Calibri", Font.BOLD, 24));
		btnPow.setBounds(384, 238, 80, 46);
		frame.getContentPane().add(btnPow);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="+";
				}
			}
		});
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 24));
		btnAdd.setBounds(468, 140, 111, 46);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="-";
				}
			}
		});
		btnSub.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSub.setBounds(468, 189, 111, 46);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="*";
				}
			}
		});
		btnMul.setFont(new Font("Calibri", Font.BOLD, 24));
		btnMul.setBounds(468, 238, 111, 46);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frame,"Enter a value");
				else {
				no1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="/";
				}
			}
		});
		btnDiv.setFont(new Font("Calibri", Font.BOLD, 24));
		btnDiv.setBounds(468, 291, 111, 46);
		frame.getContentPane().add(btnDiv);
		
		JRadioButton btnon = new JRadioButton("ON");
		btnon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnLog.setEnabled(true);
				btnSqr.setEnabled(true);
				btnCube.setEnabled(true);
				btnSqrt.setEnabled(true);
				btnFact.setEnabled(true);
				btnPow.setEnabled(true);
			}
		});
		btnon.setBounds(44, 345, 56, 23);
		frame.getContentPane().add(btnon);
		
		JRadioButton btnclose = new JRadioButton("CLOSE");
		btnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnLog.setEnabled(false);
				btnSqr.setEnabled(false);
				btnCube.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnFact.setEnabled(false);
				btnPow.setEnabled(false);
			}
		});
		btnclose.setBounds(521, 344, 89, 23);
		frame.getContentPane().add(btnclose);
		ButtonGroup bg=new ButtonGroup();
		bg.add(btnclose);
		bg.add(btnon);
	}
}
