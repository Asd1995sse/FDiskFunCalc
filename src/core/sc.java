package core;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class sc{
//хардкорим по черному!	
private static boolean debug = Loader.debug;
static File confdir = new File("config");

	//говнокод
	public static void ss(){
		//создадим папку конфиг
		File conf = new File(Paths.get("").toAbsolutePath().toString()+ File.separator + confdir);
		if(debug == true){
		System.out.println("DEBUG_"+conf);	
		}
		if (!conf.exists()) {
			System.out.println("Create config folder");
			conf.mkdir();
		}
		//Теперь конфиг файл
		File confyml = new File(conf + File.separator + "config.yml");
		if(debug == true){
		System.out.println("DEBUG_"+confyml);
		}
		if (!confyml.exists()) {
		    System.out.println("Create config file");
		try {
			confyml.createNewFile();
		} catch (IOException e) {
			System.out.println("Ошибка ввода-вывода! Т.Е. Пизда рулю... Рулю и седушке!");
			e.printStackTrace();
		}
	}
	}
}
