package controller;

//extends Thread => Para herdar características de Thread
//Parâmetros por construtor
//Método run() => Para rodar

public class ThreadId extends Thread{
	
	private int idThread;
	
	//Construtor
	//Não usa o super (), pq terá passagem de parâmetros
	public ThreadId (int idThread) {
		this.idThread = idThread;		
	}
	
	@Override
	public void run() {
		//Só executa o que está aqui dentro
		System.out.println(idThread);
	}

}
