package com.file.IO;

import java.io.PipedOutputStream;

public class Output implements Runnable {
	private PipedOutputStream out;
	
	public Output(PipedOutputStream out) {
		super();
		this.out = out;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			out.write("hi,管道来了".getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
