package q.thread.chat;

import java.net.Socket;

public class ClientSend extends Thread {
	private Socket socket;

	public ClientSend(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
	
}
