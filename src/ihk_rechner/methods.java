package ihk_rechner;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Arrays;

public class methods
{
	public static void mindPunkteB() {
		if (Integer.parseInt(gui.textField_16.getText()) <30)
		{
			gui.textField_19.setText("nicht bestanden");
		}
		else
		{
			gui.textField_19.setText("bestanden");
		}
		if (Integer.parseInt(gui.textField_17.getText()) <30)
		{
			gui.textField_20.setText("nicht bestanden");
		}
		else
		{
			gui.textField_20.setText("bestanden");
		}
		if (Integer.parseInt(gui.textField_18.getText()) <30)
		{
			gui.textField_21.setText("nicht bestanden");
		}
		else
		{
			gui.textField_21.setText("bestanden");
		}

	}

	public static void mindPunkteA(){
		if (Integer.parseInt(gui.textField.getText()) <30)
		{
			gui.textField_4.setText("nicht bestanden");
		}
		else
		{
			gui.textField_4.setText("bestanden");
		}
		if (Integer.parseInt(gui.textField_1.getText()) <30)
		{
			gui.textField_5.setText("nicht bestanden");
		}
		else
		{
			gui.textField_5.setText("bestanden");
		}
		if (Integer.parseInt(gui.textField_2.getText()) <30)
		{
			gui.textField_6.setText("nicht bestanden");
		}
		else
		{
			gui.textField_6.setText("bestanden");
		}
		if (Integer.parseInt(gui.textField_3.getText()) <30)
		{
			gui.textField_7.setText("nicht bestanden");
		}
		else
		{
			gui.textField_7.setText("bestanden");
		}
	}

	public static void gewichtungA(){
		double gewichtA = 0.25;
		int gewichtC = 25;
		NumberFormat nf = NumberFormat.getIntegerInstance(Locale.ENGLISH);
		nf.setMaximumFractionDigits(4);

		gui.textField_8.setText((gewichtC)+ "%");
		gui.textField_9.setText(gewichtC + "%");
		gui.textField_10.setText(gewichtC + "%");
		gui.textField_11.setText(gewichtC + "%");
		gui.textField_12.setText(String.valueOf(nf.format(Double.parseDouble(gui.textField.getText()) * gewichtA)));
		gui.textField_13.setText(String.valueOf(nf.format(Double.parseDouble(gui.textField_1.getText()) * gewichtA)));
		gui.textField_14.setText(String.valueOf(nf.format(Double.parseDouble(gui.textField_2.getText()) * gewichtA)));
		gui.textField_15.setText(String.valueOf(nf.format(Double.parseDouble(gui.textField_3.getText()) * gewichtA)));
	}

	public static void gewichtungB(){
		double gewichtA = 0.40;
		double gewichtB = 0.20;
		int gewichtC = 40;
		int gewichtD = 20;
		NumberFormat nf = NumberFormat.getIntegerInstance(Locale.ENGLISH);
				nf.setMaximumFractionDigits(4);

		gui.textField_22.setText(gewichtC + "%");
		gui.textField_23.setText(gewichtC + "%");
		gui.textField_24.setText(gewichtD + "%");
		double summe= Double.parseDouble(gui.textField_16.getText()) * gewichtA;
		gui.textField_25.setText(String.valueOf(nf.format(summe)));
		gui.textField_26.setText(String.valueOf(nf.format(Double.parseDouble(gui.textField_17.getText()) * gewichtA)));
		gui.textField_27.setText(String.valueOf(nf.format(Double.parseDouble(gui.textField_18.getText()) * gewichtB)));
	}

	public static void summeTeilA ()
	{
		gui.textField_28.setText(String.valueOf(Double.parseDouble(gui.textField_12.getText()) + Double.parseDouble(gui.textField_13.getText())
							+Double.parseDouble(gui.textField_14.getText()) +Double.parseDouble(gui.textField_15.getText())));
//		System.out.println(gui.textField_12.getText());
//		System.out.println(gui.textField_13.getText());
//		System.out.println(gui.textField_14.getText());
//		System.out.println(gui.textField_15.getText());
//		System.out.println(gui.textField_28.getText());


	}

	public static void summeTeilB ()
	{
		double summe= (Double.parseDouble(gui.textField_25.getText()) + Double.parseDouble(gui.textField_26.getText())
				 +Double.parseDouble(gui.textField_27.getText()));
//		System.out.println("double "+ summe);
		gui.textField_29.setText(String.valueOf(summe));
//		System.out.println("string "+String.valueOf(summe));
	}

	public static void rundenA ()
	{
		gui.textField_30.setText(String.valueOf(Math.round(Double.parseDouble(gui.textField_28.getText()))));
	}
	public static void rundenB()
	{
		gui.textField_31.setText(String.valueOf(Math.round(Double.parseDouble(gui.textField_29.getText()))));
	}

	public static void ergebnis()
	{
		int	summe=	(Integer.parseInt(gui.textField_30.getText())+ Integer.parseInt(gui.textField_31.getText())) /2;
		gui.textField_34.setText(String.valueOf(summe));
		String ergebnis=null;

		if (summe <30)
		{
			ergebnis= "ungenügend";
		}
		else if ( summe >=30 && summe <=49)
		{
			ergebnis = "mangelhaft";
		}
		else if ( summe >= 50 && summe <=66)
		{
			ergebnis= "ausreichend";
		}
		else if ( summe >=67 && summe <=80)
		{
			ergebnis = "befriedigend";
		}
		else if ( summe >=81 && summe <=91)
		{
			ergebnis = "gut";
		}
		else if ( summe >=92)
		{
			ergebnis = "sehr gut";
		}
		gui.textField_35.setText(ergebnis);
	}

}




