package core;

import core.gui.Frame;

public class Loader {
	public static boolean decor = false; //декоратор окна(для элитыных пользователей)
	public static String name = "Floppy Disk Funny Calculator"; //имя программы
	public static String version = "0.1a"; //Версия(Спасибо КЭП!)
	public static boolean debug = true; //Режим программиста для яжпрограммистов!
	
	
	//объявляем переменные
	 static double disk = 1.44; //мб
	 static double v3disk = 24; //кубмм
	 static double mdisk = 4; //граммы	 
	
	//самая важная функция 
	 public static void main(String []args) {
		 System.out.println("FDiskFunCalc... Init");
		 sc.ss();		 			 
		new Frame();		
		return;
		 }
	
		
}
