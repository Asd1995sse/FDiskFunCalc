package core;

public class Loader {
	//объявляем переменные
	 static double disk = 1.44; //мб
	 static double v3disk = 24; //кубмм
	 static double mdisk = 4; //граммы	 
	
	//самая важная функция 
	 public static void main(String []args) {
		 System.out.println("FDiskFunCalc... Init");
		 calcul();		 
			 
		 }
	//расчеты	 
	 public static Object calcul(){
		 double fz = 60;
		 double mbfz = fz*1024;
		 double xernia = mbfz / disk;
		 System.out.println(xernia + " - Количество дискет");
		 double v3all = v3disk*xernia;
		 System.out.println(v3all + " - Объем дискет");
		 double massa = xernia*mdisk;
		 System.out.println(massa + " - Вес дискет");
		return null;		 
		 
		
	 }
	 // больше жогова
		
}
