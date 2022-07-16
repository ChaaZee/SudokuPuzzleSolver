package sudoku;

import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class sudokuFrame extends JFrame {

	private JPanel contentPane;
	private JTextField input1;
	private JTextField input2;
	private JTextField input3;
	private JTextField input4;
	private JTextField input5;
	private JTextField input6;
	private JTextField input7;
	private JTextField input8;
	private JTextField input9;
	private JTextField input10;
	private JTextField input11;
	private JTextField input12;
	private JTextField input13;
	private JTextField input14;
	private JTextField input15;
	private JTextField input16;
	private JTextField input17;
	private JTextField input18;
	private JTextField input19;
	private JTextField input20;
	private JTextField input21;
	private JTextField input22;
	private JTextField input23;
	private JTextField input24;
	private JTextField input25;
	private JTextField input26;
	private JTextField input27;
	private JTextField input28;
	private JTextField input29;
	private JTextField input30;
	private JTextField input31;
	private JTextField input32;
	private JTextField input33;
	private JTextField input34;
	private JTextField input35;
	private JTextField input36;
	private JTextField input37;
	private JTextField input38;
	private JTextField input39;
	private JTextField input40;
	private JTextField input41;
	private JTextField input42;
	private JTextField input43;
	private JTextField input44;
	private JTextField input45;
	private JTextField input46;
	private JTextField input47;
	private JTextField input48;
	private JTextField input49;
	private JTextField input50;
	private JTextField input51;
	private JTextField input52;
	private JTextField input53;
	private JTextField input54;
	private JTextField input55;
	private JTextField input56;
	private JTextField input57;
	private JTextField input58;
	private JTextField input59;
	private JTextField input60;
	private JTextField input61;
	private JTextField input62;
	private JTextField input63;
	private JTextField input64;
	private JTextField input65;
	private JTextField input66;
	private JTextField input67;
	private JTextField input68;
	private JTextField input69;
	private JTextField input70;
	private JTextField input71;
	private JTextField input72;
	private JTextField input73;
	private JTextField input74;
	private JTextField input75;
	private JTextField input76;
	private JTextField input77;
	private JTextField input78;
	private JTextField input79;
	private JTextField input80;
	private JTextField input81;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sudokuFrame frame = new sudokuFrame();
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
	public sudokuFrame() {
		setTitle("Sudoku Solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sudoku");
		lblNewLabel.setBounds(372, 10, 40, 22);
		lblNewLabel.setFont(new Font("Myanmar Text", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		input1 = new JTextField();
		input1.setHorizontalAlignment(SwingConstants.CENTER);
		input1.setBounds(190, 50, 30, 30);
		contentPane.add(input1);
		input1.setColumns(10);
		
		input2 = new JTextField();
		input2.setHorizontalAlignment(SwingConstants.CENTER);
		input2.setColumns(10);
		input2.setBounds(230, 50, 30, 30);
		contentPane.add(input2);
		
		input3 = new JTextField();
		input3.setHorizontalAlignment(SwingConstants.CENTER);
		input3.setColumns(10);
		input3.setBounds(270, 50, 30, 30);
		contentPane.add(input3);
		
		input4 = new JTextField();
		input4.setHorizontalAlignment(SwingConstants.CENTER);
		input4.setColumns(10);
		input4.setBounds(340, 50, 30, 30);
		contentPane.add(input4);
		
		input5 = new JTextField();
		input5.setHorizontalAlignment(SwingConstants.CENTER);
		input5.setColumns(10);
		input5.setBounds(380, 50, 30, 30);
		contentPane.add(input5);
		
		input6 = new JTextField();
		input6.setHorizontalAlignment(SwingConstants.CENTER);
		input6.setColumns(10);
		input6.setBounds(420, 50, 30, 30);
		contentPane.add(input6);
		
		input7 = new JTextField();
		input7.setHorizontalAlignment(SwingConstants.CENTER);
		input7.setColumns(10);
		input7.setBounds(490, 50, 30, 30);
		contentPane.add(input7);
		
		input8 = new JTextField();
		input8.setHorizontalAlignment(SwingConstants.CENTER);
		input8.setColumns(10);
		input8.setBounds(530, 50, 30, 30);
		contentPane.add(input8);
		
		input9 = new JTextField();
		input9.setHorizontalAlignment(SwingConstants.CENTER);
		input9.setColumns(10);
		input9.setBounds(570, 50, 30, 30);
		contentPane.add(input9);
		
		input10 = new JTextField();
		input10.setHorizontalAlignment(SwingConstants.CENTER);
		input10.setColumns(10);
		input10.setBounds(190, 90, 30, 30);
		contentPane.add(input10);
		
		input11 = new JTextField();
		input11.setHorizontalAlignment(SwingConstants.CENTER);
		input11.setColumns(10);
		input11.setBounds(230, 90, 30, 30);
		contentPane.add(input11);
		
		input12 = new JTextField();
		input12.setHorizontalAlignment(SwingConstants.CENTER);
		input12.setColumns(10);
		input12.setBounds(270, 90, 30, 30);
		contentPane.add(input12);
		
		input13 = new JTextField();
		input13.setHorizontalAlignment(SwingConstants.CENTER);
		input13.setColumns(10);
		input13.setBounds(190, 130, 30, 30);
		contentPane.add(input13);
		
		input14 = new JTextField();
		input14.setHorizontalAlignment(SwingConstants.CENTER);
		input14.setColumns(10);
		input14.setBounds(230, 130, 30, 30);
		contentPane.add(input14);
		
		input15 = new JTextField();
		input15.setHorizontalAlignment(SwingConstants.CENTER);
		input15.setColumns(10);
		input15.setBounds(270, 130, 30, 30);
		contentPane.add(input15);
		
		input16 = new JTextField();
		input16.setHorizontalAlignment(SwingConstants.CENTER);
		input16.setColumns(10);
		input16.setBounds(340, 90, 30, 30);
		contentPane.add(input16);
		
		input17 = new JTextField();
		input17.setHorizontalAlignment(SwingConstants.CENTER);
		input17.setColumns(10);
		input17.setBounds(382, 90, 30, 30);
		contentPane.add(input17);
		
		input18 = new JTextField();
		input18.setHorizontalAlignment(SwingConstants.CENTER);
		input18.setColumns(10);
		input18.setBounds(420, 90, 30, 30);
		contentPane.add(input18);
		
		input19 = new JTextField();
		input19.setHorizontalAlignment(SwingConstants.CENTER);
		input19.setColumns(10);
		input19.setBounds(340, 130, 30, 30);
		contentPane.add(input19);
		
		input20 = new JTextField();
		input20.setHorizontalAlignment(SwingConstants.CENTER);
		input20.setColumns(10);
		input20.setBounds(382, 130, 30, 30);
		contentPane.add(input20);
		
		input21 = new JTextField();
		input21.setHorizontalAlignment(SwingConstants.CENTER);
		input21.setColumns(10);
		input21.setBounds(420, 130, 30, 30);
		contentPane.add(input21);
		
		input22 = new JTextField();
		input22.setHorizontalAlignment(SwingConstants.CENTER);
		input22.setColumns(10);
		input22.setBounds(490, 90, 30, 30);
		contentPane.add(input22);
		
		input23 = new JTextField();
		input23.setHorizontalAlignment(SwingConstants.CENTER);
		input23.setColumns(10);
		input23.setBounds(530, 90, 30, 30);
		contentPane.add(input23);
		
		input24 = new JTextField();
		input24.setHorizontalAlignment(SwingConstants.CENTER);
		input24.setColumns(10);
		input24.setBounds(570, 90, 30, 30);
		contentPane.add(input24);
		
		input25 = new JTextField();
		input25.setHorizontalAlignment(SwingConstants.CENTER);
		input25.setColumns(10);
		input25.setBounds(490, 130, 30, 30);
		contentPane.add(input25);
		
		input26 = new JTextField();
		input26.setHorizontalAlignment(SwingConstants.CENTER);
		input26.setColumns(10);
		input26.setBounds(530, 130, 30, 30);
		contentPane.add(input26);
		
		input27 = new JTextField();
		input27.setHorizontalAlignment(SwingConstants.CENTER);
		input27.setColumns(10);
		input27.setBounds(570, 130, 30, 30);
		contentPane.add(input27);
		
		input28 = new JTextField();
		input28.setHorizontalAlignment(SwingConstants.CENTER);
		input28.setColumns(10);
		input28.setBounds(190, 200, 30, 30);
		contentPane.add(input28);
		
		input29 = new JTextField();
		input29.setHorizontalAlignment(SwingConstants.CENTER);
		input29.setColumns(10);
		input29.setBounds(230, 200, 30, 30);
		contentPane.add(input29);
		
		input30 = new JTextField();
		input30.setHorizontalAlignment(SwingConstants.CENTER);
		input30.setColumns(10);
		input30.setBounds(270, 200, 30, 30);
		contentPane.add(input30);
		
		input31 = new JTextField();
		input31.setHorizontalAlignment(SwingConstants.CENTER);
		input31.setColumns(10);
		input31.setBounds(340, 200, 30, 30);
		contentPane.add(input31);
		
		input32 = new JTextField();
		input32.setHorizontalAlignment(SwingConstants.CENTER);
		input32.setColumns(10);
		input32.setBounds(380, 200, 30, 30);
		contentPane.add(input32);
		
		input33 = new JTextField();
		input33.setHorizontalAlignment(SwingConstants.CENTER);
		input33.setColumns(10);
		input33.setBounds(420, 200, 30, 30);
		contentPane.add(input33);
		
		input34 = new JTextField();
		input34.setHorizontalAlignment(SwingConstants.CENTER);
		input34.setColumns(10);
		input34.setBounds(490, 200, 30, 30);
		contentPane.add(input34);
		
		input35 = new JTextField();
		input35.setHorizontalAlignment(SwingConstants.CENTER);
		input35.setColumns(10);
		input35.setBounds(530, 200, 30, 30);
		contentPane.add(input35);
		
		input36 = new JTextField();
		input36.setHorizontalAlignment(SwingConstants.CENTER);
		input36.setColumns(10);
		input36.setBounds(570, 200, 30, 30);
		contentPane.add(input36);
		
		input37 = new JTextField();
		input37.setHorizontalAlignment(SwingConstants.CENTER);
		input37.setColumns(10);
		input37.setBounds(190, 240, 30, 30);
		contentPane.add(input37);
		
		input38 = new JTextField();
		input38.setHorizontalAlignment(SwingConstants.CENTER);
		input38.setColumns(10);
		input38.setBounds(230, 240, 30, 30);
		contentPane.add(input38);
		
		input39 = new JTextField();
		input39.setHorizontalAlignment(SwingConstants.CENTER);
		input39.setColumns(10);
		input39.setBounds(270, 240, 30, 30);
		contentPane.add(input39);
		
		input40 = new JTextField();
		input40.setHorizontalAlignment(SwingConstants.CENTER);
		input40.setColumns(10);
		input40.setBounds(190, 280, 30, 30);
		contentPane.add(input40);
		
		input41 = new JTextField();
		input41.setHorizontalAlignment(SwingConstants.CENTER);
		input41.setColumns(10);
		input41.setBounds(230, 280, 30, 30);
		contentPane.add(input41);
		
		input42 = new JTextField();
		input42.setHorizontalAlignment(SwingConstants.CENTER);
		input42.setColumns(10);
		input42.setBounds(270, 280, 30, 30);
		contentPane.add(input42);
		
		input43 = new JTextField();
		input43.setHorizontalAlignment(SwingConstants.CENTER);
		input43.setColumns(10);
		input43.setBounds(340, 240, 30, 30);
		contentPane.add(input43);
		
		input44 = new JTextField();
		input44.setHorizontalAlignment(SwingConstants.CENTER);
		input44.setColumns(10);
		input44.setBounds(382, 240, 30, 30);
		contentPane.add(input44);
		
		input45 = new JTextField();
		input45.setHorizontalAlignment(SwingConstants.CENTER);
		input45.setColumns(10);
		input45.setBounds(420, 240, 30, 30);
		contentPane.add(input45);
		
		input46 = new JTextField();
		input46.setHorizontalAlignment(SwingConstants.CENTER);
		input46.setColumns(10);
		input46.setBounds(340, 280, 30, 30);
		contentPane.add(input46);
		
		input47 = new JTextField();
		input47.setHorizontalAlignment(SwingConstants.CENTER);
		input47.setColumns(10);
		input47.setBounds(382, 280, 30, 30);
		contentPane.add(input47);
		
		input48 = new JTextField();
		input48.setHorizontalAlignment(SwingConstants.CENTER);
		input48.setColumns(10);
		input48.setBounds(420, 280, 30, 30);
		contentPane.add(input48);
		
		input49 = new JTextField();
		input49.setHorizontalAlignment(SwingConstants.CENTER);
		input49.setColumns(10);
		input49.setBounds(490, 240, 30, 30);
		contentPane.add(input49);
		
		input50 = new JTextField();
		input50.setHorizontalAlignment(SwingConstants.CENTER);
		input50.setColumns(10);
		input50.setBounds(530, 240, 30, 30);
		contentPane.add(input50);
		
		input51 = new JTextField();
		input51.setHorizontalAlignment(SwingConstants.CENTER);
		input51.setColumns(10);
		input51.setBounds(570, 240, 30, 30);
		contentPane.add(input51);
		
		input52 = new JTextField();
		input52.setHorizontalAlignment(SwingConstants.CENTER);
		input52.setColumns(10);
		input52.setBounds(490, 280, 30, 30);
		contentPane.add(input52);
		
		input53 = new JTextField();
		input53.setHorizontalAlignment(SwingConstants.CENTER);
		input53.setColumns(10);
		input53.setBounds(530, 280, 30, 30);
		contentPane.add(input53);
		
		input54 = new JTextField();
		input54.setHorizontalAlignment(SwingConstants.CENTER);
		input54.setColumns(10);
		input54.setBounds(570, 280, 30, 30);
		contentPane.add(input54);
		
		input55 = new JTextField();
		input55.setHorizontalAlignment(SwingConstants.CENTER);
		input55.setColumns(10);
		input55.setBounds(190, 350, 30, 30);
		contentPane.add(input55);
		
		input56 = new JTextField();
		input56.setHorizontalAlignment(SwingConstants.CENTER);
		input56.setColumns(10);
		input56.setBounds(230, 350, 30, 30);
		contentPane.add(input56);
		
		input57 = new JTextField();
		input57.setHorizontalAlignment(SwingConstants.CENTER);
		input57.setColumns(10);
		input57.setBounds(270, 350, 30, 30);
		contentPane.add(input57);
		
		input58 = new JTextField();
		input58.setHorizontalAlignment(SwingConstants.CENTER);
		input58.setColumns(10);
		input58.setBounds(340, 350, 30, 30);
		contentPane.add(input58);
		
		input59 = new JTextField();
		input59.setHorizontalAlignment(SwingConstants.CENTER);
		input59.setColumns(10);
		input59.setBounds(380, 350, 30, 30);
		contentPane.add(input59);
		
		input60 = new JTextField();
		input60.setHorizontalAlignment(SwingConstants.CENTER);
		input60.setColumns(10);
		input60.setBounds(420, 350, 30, 30);
		contentPane.add(input60);
		
		input61 = new JTextField();
		input61.setHorizontalAlignment(SwingConstants.CENTER);
		input61.setColumns(10);
		input61.setBounds(490, 350, 30, 30);
		contentPane.add(input61);
		
		input62 = new JTextField();
		input62.setHorizontalAlignment(SwingConstants.CENTER);
		input62.setColumns(10);
		input62.setBounds(530, 350, 30, 30);
		contentPane.add(input62);
		
		input63 = new JTextField();
		input63.setHorizontalAlignment(SwingConstants.CENTER);
		input63.setColumns(10);
		input63.setBounds(570, 350, 30, 30);
		contentPane.add(input63);
		
		input64 = new JTextField();
		input64.setHorizontalAlignment(SwingConstants.CENTER);
		input64.setColumns(10);
		input64.setBounds(190, 390, 30, 30);
		contentPane.add(input64);
		
		input65 = new JTextField();
		input65.setHorizontalAlignment(SwingConstants.CENTER);
		input65.setColumns(10);
		input65.setBounds(230, 390, 30, 30);
		contentPane.add(input65);
		
		input66 = new JTextField();
		input66.setHorizontalAlignment(SwingConstants.CENTER);
		input66.setColumns(10);
		input66.setBounds(270, 390, 30, 30);
		contentPane.add(input66);
		
		input67 = new JTextField();
		input67.setHorizontalAlignment(SwingConstants.CENTER);
		input67.setColumns(10);
		input67.setBounds(190, 430, 30, 30);
		contentPane.add(input67);
		
		input68 = new JTextField();
		input68.setHorizontalAlignment(SwingConstants.CENTER);
		input68.setColumns(10);
		input68.setBounds(230, 430, 30, 30);
		contentPane.add(input68);
		
		input69 = new JTextField();
		input69.setHorizontalAlignment(SwingConstants.CENTER);
		input69.setColumns(10);
		input69.setBounds(270, 430, 30, 30);
		contentPane.add(input69);
		
		input70 = new JTextField();
		input70.setHorizontalAlignment(SwingConstants.CENTER);
		input70.setColumns(10);
		input70.setBounds(340, 390, 30, 30);
		contentPane.add(input70);
		
		input71 = new JTextField();
		input71.setHorizontalAlignment(SwingConstants.CENTER);
		input71.setColumns(10);
		input71.setBounds(382, 390, 30, 30);
		contentPane.add(input71);
		
		input72 = new JTextField();
		input72.setHorizontalAlignment(SwingConstants.CENTER);
		input72.setColumns(10);
		input72.setBounds(420, 390, 30, 30);
		contentPane.add(input72);
		
		input73 = new JTextField();
		input73.setHorizontalAlignment(SwingConstants.CENTER);
		input73.setColumns(10);
		input73.setBounds(340, 430, 30, 30);
		contentPane.add(input73);
		
		input74 = new JTextField();
		input74.setHorizontalAlignment(SwingConstants.CENTER);
		input74.setColumns(10);
		input74.setBounds(382, 430, 30, 30);
		contentPane.add(input74);
		
		input75 = new JTextField();
		input75.setHorizontalAlignment(SwingConstants.CENTER);
		input75.setColumns(10);
		input75.setBounds(420, 430, 30, 30);
		contentPane.add(input75);
		
		input76 = new JTextField();
		input76.setHorizontalAlignment(SwingConstants.CENTER);
		input76.setColumns(10);
		input76.setBounds(490, 390, 30, 30);
		contentPane.add(input76);
		
		input77 = new JTextField();
		input77.setHorizontalAlignment(SwingConstants.CENTER);
		input77.setColumns(10);
		input77.setBounds(530, 390, 30, 30);
		contentPane.add(input77);
		
		input78 = new JTextField();
		input78.setHorizontalAlignment(SwingConstants.CENTER);
		input78.setColumns(10);
		input78.setBounds(570, 390, 30, 30);
		contentPane.add(input78);
		
		input79 = new JTextField();
		input79.setHorizontalAlignment(SwingConstants.CENTER);
		input79.setColumns(10);
		input79.setBounds(490, 430, 30, 30);
		contentPane.add(input79);
		
		input80 = new JTextField();
		input80.setHorizontalAlignment(SwingConstants.CENTER);
		input80.setColumns(10);
		input80.setBounds(530, 430, 30, 30);
		contentPane.add(input80);
		
		input81 = new JTextField();
		input81.setHorizontalAlignment(SwingConstants.CENTER);
		input81.setColumns(10);
		input81.setBounds(570, 430, 30, 30);
		contentPane.add(input81);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] inputs = {
						{input1.getText(), input2.getText(), input3.getText(),      input4.getText(), input5.getText(), input6.getText(),      input7.getText(), input8.getText(), input9.getText()},
						{input10.getText(), input11.getText(), input12.getText(),   input16.getText(), input17.getText(), input18.getText(),   input22.getText(), input23.getText(), input24.getText()},
						{input13.getText(), input14.getText(), input15.getText(),   input19.getText(), input20.getText(), input21.getText(),   input25.getText(), input26.getText(), input27.getText()},
						
						
						{input28.getText(), input29.getText(), input30.getText(),   input31.getText(), input32.getText(), input33.getText(),   input34.getText(), input35.getText(), input36.getText()},
						{input37.getText(), input38.getText(), input39.getText(),   input43.getText(), input44.getText(), input45.getText(),   input49.getText(), input50.getText(), input51.getText()},
						{input40.getText(), input41.getText(), input42.getText(),   input46.getText(), input47.getText(), input48.getText(),   input52.getText(), input53.getText(), input54.getText()},
						
						
						{input55.getText(), input56.getText(), input57.getText(),   input58.getText(), input59.getText(), input60.getText(),   input61.getText(), input62.getText(), input63.getText()},
						{input64.getText(), input65.getText(), input66.getText(),   input70.getText(), input71.getText(), input72.getText(),   input76.getText(), input77.getText(), input78.getText()},
						{input67.getText(), input68.getText(), input69.getText(),   input73.getText(), input74.getText(), input75.getText(),   input79.getText(), input80.getText(), input81.getText()}
						};
				
				int[][] square = new int[9][9];	
				
				for(int y = 0; y < inputs.length; y++) {
					for(int x = 0; x < inputs[y].length; x++) {
						if(inputs[y][x].equals("")) {
							square[y][x] = 0;
						} else {
							int i = Integer.parseInt(inputs[y][x]);
							square[y][x] = i;
						}
					}
				}
				
				Sudoku sudoku = new Sudoku(square);
				sudoku.display();
				sudoku.solve();
				System.out.println();
				System.out.println();
				sudoku.display();
				
				int[][] solution = sudoku.square;
				String[][] displaySolution = new String[9][9];
				
				
				for(int y = 0; y < solution.length; y++) {
					for(int x = 0; x < solution[y].length; x++) {
						String s = String.valueOf(solution[y][x]);
						displaySolution[y][x] = s;
					}
				}
				
				input1.setText(displaySolution[0][0]);
				input2.setText(displaySolution[0][1]);
				input3.setText(displaySolution[0][2]);
				input4.setText(displaySolution[0][3]);
				input5.setText(displaySolution[0][4]);
				input6.setText(displaySolution[0][5]);
				input7.setText(displaySolution[0][6]);
				input8.setText(displaySolution[0][7]);
				input9.setText(displaySolution[0][8]);
				
				input10.setText(displaySolution[1][0]);
				input11.setText(displaySolution[1][1]);
				input12.setText(displaySolution[1][2]);
				input16.setText(displaySolution[1][3]);
				input17.setText(displaySolution[1][4]);
				input18.setText(displaySolution[1][5]);
				input22.setText(displaySolution[1][6]);
				input23.setText(displaySolution[1][7]);
				input24.setText(displaySolution[1][8]);
				
				input13.setText(displaySolution[2][0]);
				input14.setText(displaySolution[2][1]);
				input15.setText(displaySolution[2][2]);
				input19.setText(displaySolution[2][3]);
				input20.setText(displaySolution[2][4]);
				input21.setText(displaySolution[2][5]);	
				input25.setText(displaySolution[2][6]);
				input26.setText(displaySolution[2][7]);
				input27.setText(displaySolution[2][8]);
				
				input28.setText(displaySolution[3][0]);
				input29.setText(displaySolution[3][1]);
				input30.setText(displaySolution[3][2]);
				input31.setText(displaySolution[3][3]);
				input32.setText(displaySolution[3][4]);
				input33.setText(displaySolution[3][5]);
				input34.setText(displaySolution[3][6]);
				input35.setText(displaySolution[3][7]);
				input36.setText(displaySolution[3][8]);
				
				input37.setText(displaySolution[4][0]);
				input38.setText(displaySolution[4][1]);
				input39.setText(displaySolution[4][2]);
				input43.setText(displaySolution[4][3]);
				input44.setText(displaySolution[4][4]);
				input45.setText(displaySolution[4][5]);
				input49.setText(displaySolution[4][6]);
				input50.setText(displaySolution[4][7]);
				input51.setText(displaySolution[4][8]);
				
				input40.setText(displaySolution[5][0]);
				input41.setText(displaySolution[5][1]);
				input42.setText(displaySolution[5][2]);
				input46.setText(displaySolution[5][3]);
				input47.setText(displaySolution[5][4]);
				input48.setText(displaySolution[5][5]);
				input52.setText(displaySolution[5][6]);
				input53.setText(displaySolution[5][7]);
				input54.setText(displaySolution[5][8]);
				
				input55.setText(displaySolution[6][0]);
				input56.setText(displaySolution[6][1]);
				input57.setText(displaySolution[6][2]);
				input58.setText(displaySolution[6][3]);
				input59.setText(displaySolution[6][4]);
				input60.setText(displaySolution[6][5]);
				input61.setText(displaySolution[6][6]);
				input62.setText(displaySolution[6][7]);
				input63.setText(displaySolution[6][8]);
				
				input64.setText(displaySolution[7][0]);
				input65.setText(displaySolution[7][1]);
				input66.setText(displaySolution[7][2]);
				input70.setText(displaySolution[7][3]);
				input71.setText(displaySolution[7][4]);
				input72.setText(displaySolution[7][5]);
				input76.setText(displaySolution[7][6]);
				input77.setText(displaySolution[7][7]);
				input78.setText(displaySolution[7][8]);
				
				input67.setText(displaySolution[8][0]);
				input68.setText(displaySolution[8][1]);
				input69.setText(displaySolution[8][2]);
				input73.setText(displaySolution[8][3]);
				input74.setText(displaySolution[8][4]);
				input75.setText(displaySolution[8][5]);
				input79.setText(displaySolution[8][6]);
				input80.setText(displaySolution[8][7]);
				input81.setText(displaySolution[8][8]);
			
				}
			});
	
		btnSolve.setBounds(270, 527, 89, 23);
		contentPane.add(btnSolve);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText("");
				input2.setText("");
				input3.setText("");
				input4.setText("");
				input5.setText("");
				input6.setText("");
				input7.setText("");
				input8.setText("");
				input9.setText("");
				input10.setText("");
				input11.setText("");
				input12.setText("");
				input13.setText("");
				input14.setText("");
				input15.setText("");
				input16.setText("");
				input17.setText("");
				input18.setText("");
				input19.setText("");
				input20.setText("");
				input21.setText("");
				input22.setText("");
				input23.setText("");
				input24.setText("");
				input25.setText("");
				input26.setText("");
				input27.setText("");
				input28.setText("");
				input29.setText("");
				input30.setText("");
				input31.setText("");
				input32.setText("");
				input33.setText("");
				input34.setText("");
				input35.setText("");
				input36.setText("");
				input37.setText("");
				input38.setText("");
				input39.setText("");
				input40.setText("");
				input41.setText("");
				input42.setText("");
				input43.setText("");
				input44.setText("");
				input45.setText("");
				input46.setText("");
				input47.setText("");
				input48.setText("");
				input49.setText("");
				input50.setText("");
				input51.setText("");
				input52.setText("");
				input53.setText("");
				input54.setText("");
				input55.setText("");
				input56.setText("");
				input57.setText("");
				input58.setText("");
				input59.setText("");
				input60.setText("");
				input61.setText("");
				input62.setText("");
				input63.setText("");
				input64.setText("");
				input65.setText("");
				input66.setText("");
				input67.setText("");
				input68.setText("");
				input69.setText("");
				input70.setText("");
				input71.setText("");
				input72.setText("");
				input73.setText("");
				input74.setText("");
				input75.setText("");
				input76.setText("");
				input77.setText("");
				input78.setText("");
				input79.setText("");
				input80.setText("");
				input81.setText("");
			}
		});
		btnClear.setBounds(431, 527, 89, 23);
		contentPane.add(btnClear);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(170, 30, 150, 150);
		contentPane.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(320, 30, 150, 150);
		contentPane.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(470, 30, 150, 150);
		contentPane.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(170, 180, 150, 150);
		contentPane.add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(320, 180, 150, 150);
		contentPane.add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(470, 180, 150, 150);
		contentPane.add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(170, 330, 150, 150);
		contentPane.add(panel_6);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(320, 330, 150, 150);
		contentPane.add(panel_7);
		
		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(470, 330, 150, 150);
		contentPane.add(panel_8);
	}
}
