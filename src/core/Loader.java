package core;

public class Loader {
	 static double disk = 1.44; //��
	 static double v3disk = 24; //�����
	 static double mdisk = 4; //������	 
	 public static void main(String []args) {
		 System.out.println("Equestria System Graphic Lib_v1.0... Init");
		 calcul();
		 
			 
		 }
		 
	 public static Object calcul(){
		 double fz = 60;
		 double mbfz = fz*1024;
		 double xernia = mbfz / disk;
		 System.out.println(xernia + " - ���������� ������");
		 double v3all = v3disk*xernia;
		 System.out.println(v3all + " - ����� ������");
		 double massa = xernia*mdisk;
		 System.out.println(massa + " - ��� ������");
		return null;		 
		 
		
	 }	 
		
}
