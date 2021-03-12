package pres.inst.dynamique;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDAO;
import metier.IMetier;
public class Presentation {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// read from file on disk
		Scanner input = new Scanner(new File("config.txt"));
		
		//gettting wanted classes names
		String daoChoiceName = input.nextLine();
		String metierChoiceName = input.nextLine();
		
		//uploading class to memory
		Class class_dao = Class.forName(daoChoiceName);
		Class class_metier = Class.forName(metierChoiceName);
		
		//creating classes objects
		IDAO dao = (IDAO)class_dao.newInstance();  //consider changing to something less evil
		IMetier metier = (IMetier)class_metier.newInstance();
		
		//loading the wated setter into memory
		Method setDao = class_metier.getMethod("setDAO",IDAO.class);
		setDao.invoke(metier, dao);
		System.out.println(metier.calcul());
	}
}
