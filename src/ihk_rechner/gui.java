package ihk_rechner;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class gui extends JFrame {

	JPanel contentPane;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_12;
	static JTextField textField_3;
	static JTextField textField_4;
	static JTextField textField_5;
	static JTextField textField_6;
	static JTextField textField_7;
	static JTextField textField_8;
	static JTextField textField_9;
	static JTextField textField_10;
	static JTextField textField_11;
	static JTextField textField_13;
	static JTextField textField_14;
	static JTextField textField_15;
	static JTextField textField_16;
	static JTextField textField_17;
	static JTextField textField_18;
	static JTextField textField_20;
	static JTextField textField_21;
	static JTextField textField_22;
	static JTextField textField_24;
	static JTextField textField_25;
	static JTextField textField_26;
	static JTextField textField_28;
	static JTextField textField_29;
	static JTextField textField_30;
	static JTextField textField_19;
	static JTextField textField_23;
	static JTextField textField_27;
	static JTextField textField_31;
	static JTextField textField_32;
	static JTextField textField_33;
	static JTextField textField_34;
	static JTextField textField_35;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 555);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IHK -PR\u00DCFUNG Auswertungsmodel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(544, 10, 327, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pr\u00FCflingsname:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 44, 149, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00FCflingsID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 66, 138, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Teil A Projektarbeit");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(263, 100, 148, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Projektarbeit");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 170, 106, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Projekt Dokumentation");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 194, 133, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Projekt Pr\u00E4sentation");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 219, 116, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Projekt Fachgespr\u00E4ch");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 244, 159, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("erreichte Punkte");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(166, 133, 91, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("mind. 30 Punkte");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(273, 133, 104, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Gewichtungsfaktor");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(390, 133, 106, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Punkte gewichtet");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(503, 133, 123, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Teil B Schriftliche Pr\u00FCfung");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(978, 100, 188, 23);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Fachqualifikation");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(671, 170, 96, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Kernqualifikation");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(671, 195, 96, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Wirtschaft/Sozialkunde");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(672, 220, 138, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_8_1 = new JLabel("erreichte Punkte");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(836, 133, 91, 14);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("mind. 30 Punkte");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(937, 133, 104, 14);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Gewichtungsfaktor");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10_1.setBounds(1051, 133, 106, 14);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Punkte gewichtet");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(1167, 133, 106, 14);
		contentPane.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_16 = new JLabel("Punkte :");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16.setBounds(10, 483, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_18 = new JLabel("sehr gut");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18.setBounds(153, 483, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("gut");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_19.setBounds(331, 483, 46, 14);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("befriedigend");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_20.setBounds(472, 483, 71, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("ausreichend");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_21.setBounds(673, 483, 91, 14);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("mangelhaft");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_22.setBounds(870, 483, 96, 14);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("ungen\u00FCgend");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_23.setBounds(1062, 483, 116, 14);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("100 - 92");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_24.setBounds(97, 483, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("91 - 81");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_25.setBounds(275, 483, 46, 14);
		contentPane.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("80 - 67");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_26.setBounds(424, 483, 46, 14);
		contentPane.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("66 - 50");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_27.setBounds(617, 483, 46, 14);
		contentPane.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("49 - 30");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_28.setBounds(825, 483, 46, 14);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("< 30");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_29.setBounds(1018, 483, 46, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Summe Teil A:");
		lblNewLabel_30.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_30.setBounds(331, 272, 156, 24);
		contentPane.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Punkte Teil A entsprechen:");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_31.setBounds(331, 306, 159, 14);
		contentPane.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Summe Teil B:");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_32.setBounds(1008, 270, 96, 14);
		contentPane.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Punkte Teil B entsprechen:");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_33.setBounds(1008, 306, 158, 14);
		contentPane.add(lblNewLabel_33);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField.setBounds(157, 167, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_1.setBounds(157, 191, 100, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_2.setBounds(157, 216, 100, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(503, 167, 100, 20);
		contentPane.add(textField_12);
		textField_12.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(157, 241, 100, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(277, 167, 100, 20);
		contentPane.add(textField_4);
		textField_4.setEditable(false);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(277, 191, 100, 20);
		contentPane.add(textField_5);
		textField_5.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(277, 216, 100, 20);
		contentPane.add(textField_6);
		textField_6.setEditable(false);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(277, 241, 100, 20);
		contentPane.add(textField_7);
		textField_7.setEditable(false);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(390, 167, 100, 20);
		contentPane.add(textField_8);
		textField_8.setEditable(false);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(390, 191, 100, 20);
		contentPane.add(textField_9);
		textField_9.setEditable(false);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(390, 216, 100, 20);
		contentPane.add(textField_10);
		textField_10.setEditable(false);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(390, 241, 100, 20);
		contentPane.add(textField_11);
		textField_11.setEditable(false);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(503, 191, 100, 20);
		contentPane.add(textField_13);
		textField_13.setEditable(false);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_14.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_14.setColumns(10);
		textField_14.setBounds(503, 216, 100, 20);
		contentPane.add(textField_14);
		textField_14.setEditable(false);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_15.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_15.setColumns(10);
		textField_15.setBounds(503, 241, 100, 20);
		contentPane.add(textField_15);
		textField_15.setEditable(false);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_16.setColumns(10);
		textField_16.setBounds(823, 170, 100, 20);
		contentPane.add(textField_16);
		textField_16.setEditable(true);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_17.setColumns(10);
		textField_17.setBounds(823, 194, 100, 20);
		contentPane.add(textField_17);
		textField_17.setEditable(true);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_18.setColumns(10);
		textField_18.setBounds(823, 219, 100, 20);
		contentPane.add(textField_18);
		textField_18.setEditable(true);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_20.setColumns(10);
		textField_20.setBounds(941, 191, 100, 20);
		contentPane.add(textField_20);
		textField_20.setEditable(false);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_21.setColumns(10);
		textField_21.setBounds(941, 216, 100, 20);
		contentPane.add(textField_21);
		textField_21.setEditable(false);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_22.setColumns(10);
		textField_22.setBounds(1051, 167, 100, 20);
		contentPane.add(textField_22);
		textField_22.setEditable(false);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_24.setColumns(10);
		textField_24.setBounds(1051, 216, 100, 20);
		contentPane.add(textField_24);
		textField_24.setEditable(false);
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_25.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_25.setColumns(10);
		textField_25.setBounds(1167, 167, 100, 20);
		contentPane.add(textField_25);
		textField_25.setEditable(false);
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_26.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_26.setColumns(10);
		textField_26.setBounds(1167, 191, 100, 20);
		contentPane.add(textField_26);
		textField_26.setEditable(false);
		
		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_28.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_28.setColumns(10);
		textField_28.setBounds(503, 270, 100, 20);
		contentPane.add(textField_28);
		textField_28.setEditable(false);
		
		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_29.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_29.setColumns(10);
		textField_29.setBounds(1167, 270, 100, 20);
		contentPane.add(textField_29);
		textField_29.setEditable(false);
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_30.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_30.setColumns(10);
		textField_30.setBounds(503, 300, 100, 20);
		contentPane.add(textField_30);
		textField_30.setEditable(false);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_19.setColumns(10);
		textField_19.setBounds(941, 167, 100, 20);
		contentPane.add(textField_19);
		textField_19.setEditable(false);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_23.setColumns(10);
		textField_23.setBounds(1051, 191, 100, 20);
		contentPane.add(textField_23);
		textField_23.setEditable(false);
		
		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_27.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_27.setColumns(10);
		textField_27.setBounds(1167, 216, 100, 20);
		contentPane.add(textField_27);
		textField_27.setEditable(false);
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_31.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_31.setColumns(10);
		textField_31.setBounds(1167, 300, 100, 20);
		contentPane.add(textField_31);
		textField_31.setEditable(false);
		
		JButton btnNewButton = new JButton("berechnen");
		btnNewButton.setBounds(969, 407, 95, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" Speichern");
		btnNewButton_1.setBounds(1068, 407, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_32 = new JTextField();
		textField_32.setBounds(124, 47, 86, 20);
		contentPane.add(textField_32);
		textField_32.setColumns(10);
		textField_32.setEditable(true);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(124, 69, 86, 20);
		contentPane.add(textField_33);
		textField_33.setEditable(true);
		
		textField_34 = new JTextField();
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_34.setBackground(Color.LIGHT_GRAY);
		textField_34.setBounds(97, 368, 86, 62);
		contentPane.add(textField_34);
		textField_34.setColumns(10);
		textField_34.setEditable(false);
		
		textField_35 = new JTextField();
		textField_35.setBackground(Color.LIGHT_GRAY);
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_35.setBounds(193, 368, 166, 62);
		contentPane.add(textField_35);
		textField_35.setColumns(10);
		textField_35.setEditable(false);
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				//Prüfen ob mindest Punkte und eintragen
				try {
					methods.mindPunkteA();
					methods.gewichtungA();
					methods.summeTeilA();
					methods.rundenA();
					methods.mindPunkteB();
					methods.gewichtungB();
					methods.summeTeilB();
					methods.rundenB();
					methods.ergebnis();

				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog( null, "Bitte Zahlen eingeben!");
				}
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				db.insert();
			}
		});

	}
}
