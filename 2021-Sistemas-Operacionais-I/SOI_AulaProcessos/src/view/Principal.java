package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		
		ProcessosController processosController = new ProcessosController();
		String os = processosController.os();
		System.out.println(os);
		
		//String process = "c:\\Windows\\write.exe";
		//processosController.callProcess(process);
		
		//String process = "TASKLIST /FO TABLE";
		//processosController.readProcess(process);
		
		//String param = "1180";
		//processosController.killProcess(param);
		
	}

}