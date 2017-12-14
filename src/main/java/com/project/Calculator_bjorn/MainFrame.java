package com.project.Calculator_bjorn;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
/***
 * Assignment Calculator
 * 
 * @author Björn Åström
 * @version 1.0
 * 
 *
 */

public class MainFrame {

	private JFrame frame;
	private JTextField tffirstNumber;
	private JTextField tfsecondNumber;
	private JLabel lblEnterYourFirst = new JLabel("Add a number:");
	private JLabel lblNewLabel = new JLabel("Add a second number:");
	private JLabel lblResult = new JLabel("Answer:");
	private ScientificCalculator sc = new ScientificCalculator();
	private SimpleCalculator sic = new SimpleCalculator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Properties frame
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(150, 150, 345, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tffirstNumber = new JTextField();
		tffirstNumber.setBounds(130, 20, 125, 20);	
		frame.getContentPane().add(tffirstNumber);
		tffirstNumber.setColumns(10);
		
		JButton btaddition = new JButton("+");
		btaddition.setBackground(SystemColor.info);
		btaddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double addition = sic.addition(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(addition);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		
		tfsecondNumber = new JTextField();
		tfsecondNumber.setBounds(198, 42, 125, 20);
		frame.getContentPane().add(tfsecondNumber);
		tfsecondNumber.setColumns(10);
		btaddition.setBounds(24, 134, 129, 23);
		frame.getContentPane().add(btaddition);
		
		JButton btnsubstraction = new JButton("-");
		btnsubstraction.setBackground(SystemColor.info);
		btnsubstraction.setForeground(Color.BLACK);
		btnsubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double substraction = sic.substraction(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(substraction);
				lblResult.setText("Result: " + result);
			}
		});
		btnsubstraction.setBounds(24, 99, 129, 23);
		frame.getContentPane().add(btnsubstraction);
		
		JButton btnmultiplication = new JButton("*");
		btnmultiplication.setBackground(SystemColor.info);
		btnmultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double multiplication = sic.multiplication(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(multiplication);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnmultiplication.setBounds(185, 99, 120, 23);
		frame.getContentPane().add(btnmultiplication);
		
		JButton btndivide = new JButton("/");
		btndivide.setBackground(SystemColor.info);
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double division = sic.division(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(division);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btndivide.setBounds(185, 134, 121, 23);
		frame.getContentPane().add(btndivide);
		
		JButton btnpow2 = new JButton("x^2");
		btnpow2.setBackground(SystemColor.info);
		btnpow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double pow2 = sc.math2(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(pow2);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
			
			
			
			
		});
		btnpow2.setBounds(24, 169, 64, 23);
		frame.getContentPane().add(btnpow2);
		
		JButton btnpow3 = new JButton("x^3");
		btnpow3.setBackground(SystemColor.info);
		btnpow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double pow3 = sc.math2(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(pow3);
				lblResult.setText("Result: " + result);
				cleanTextFields();

			}
		});
		btnpow3.setBounds(24, 204, 64, 23);
		frame.getContentPane().add(btnpow3);
		
		
		lblEnterYourFirst.setBounds(24, 22, 205, 14);
		frame.getContentPane().add(lblEnterYourFirst);
		
		
		lblNewLabel.setBounds(24, 44, 186, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		lblResult.setBounds(24, 344, 129, 14);
		frame.getContentPane().add(lblResult);
		
		JButton button = new JButton("√2");
		button.setBackground(SystemColor.info);
		button.addActionListener(new ActionListener() {
			private JComponent btnSquared;

			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tffirstNumber.getText().toString());
				ScientificCalculator scientific = new ScientificCalculator();
				double result = scientific.squareRoot(firstNumber);
				
				lblResult.setText("Result: " + result);
				tffirstNumber.setText(""); 
				tfsecondNumber.setText("");
				
				btnSquared = null;
				btnSquared.setBackground(Color.GRAY);
			}
			
			
		});
		button.setBounds(102, 169, 64, 25);
		frame.getContentPane().add(button);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double COS = sc.COS(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(COS);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnCos.setBackground(SystemColor.info);
		btnCos.setBounds(100, 203, 64, 25);
		frame.getContentPane().add(btnCos);
		
		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double SIN = sc.SIN(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(SIN);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnSin.setBackground(SystemColor.info);
		btnSin.setBounds(102, 240, 64, 25);
		frame.getContentPane().add(btnSin);
		
		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					double TAN =sc.TAN(Double.parseDouble(tffirstNumber.getText()));
					String result = String.valueOf(TAN);
					lblResult.setText("Result: " + result);
					cleanTextFields();
				
			}
		});
		btnTan.setBackground(SystemColor.info);
		btnTan.setBounds(24, 239, 69, 25);
		frame.getContentPane().add(btnTan);
	}
	public void cleanTextFields() {
		tffirstNumber.setText("");
		tfsecondNumber.setText("");
	}
}
