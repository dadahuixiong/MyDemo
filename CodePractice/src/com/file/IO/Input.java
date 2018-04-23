package com.file.IO;

import java.io.PipedInputStream;

public class Input implements Runnable {
	private PipedInputStream in;
	
	public Input(PipedInputStream in) {
		super();
		this.in = in;
	}

	@Override
	public void run() {
		try {
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String s = new String(buf,0,len);
			System.out.println("s="+s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
