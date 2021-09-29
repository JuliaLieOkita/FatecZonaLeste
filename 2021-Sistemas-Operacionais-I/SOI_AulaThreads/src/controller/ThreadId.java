package controller;

//extends Thread => Para herdar caracter�sticas de Thread
//Par�metros por construtor
//M�todo run() => Para rodar

public class ThreadId extends Thread{
	
	private int idThread;
	
	//Construtor
	//N�o usa o super (), pq ter� passagem de par�metros
	public ThreadId (int idThread) {
		this.idThread = idThread;		
	}
	
	@Override
	public void run() {
		//S� executa o que est� aqui dentro
		System.out.println(idThread);
	}

}
