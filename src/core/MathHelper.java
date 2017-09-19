package core;

import core.gui.Frame;

public class MathHelper {
	public static double xernia;
	public static double v3all;
	public static double massa;
	//расчеты	 
		 public static Object calcul(){
			 double fz = Frame.size;
			 double mbfz = fz*1024;
			 xernia = mbfz / Loader.disk;
			 System.out.println(xernia + " - Количество дискет");
			 v3all = Loader.v3disk*xernia;
			 System.out.println(v3all + " - Объем дискет");
			 massa = xernia*Loader.mdisk;
			 System.out.println(massa + " - Вес дискет");
			 
			return null;		 
			 
			
		 }
		 // больше жогова
}
