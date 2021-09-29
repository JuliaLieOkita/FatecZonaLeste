package view;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String path = "C:\\TEMP";
		String name = "generic_food.csv";
		
		try {
			arqCont.readFile(path, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}