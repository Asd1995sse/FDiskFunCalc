package core;

import core.gui.Frame;

public class MathHelper {
	public static double xernia;
	public static double v3all;
	public static double massa;
	public static double size;
	//расчеты	 
		 public static Object calcul(){
			 double fz = size;
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
		 public static void Init(){
			 size = Frame.GetSize();
			 if(size != 0 && size > 0){
				 System.out.print(1 + "f ");
				 for (int i = 1; i <= 0; i++) {
					  System.out.print(i + " ");
					}		
				 }else{
					 System.out.print(1 + "d ");
					 return;
				 }
			
		 }
		 }
