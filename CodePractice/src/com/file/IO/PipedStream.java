package com.file.IO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

	/**
	 * 管道流结合多线程使用，否则出现线程死锁
	 * @author Administrator
	 *
	 */
public class PipedStream {

	public static void main(String[] args) throws IOException {
		PipedInputStream input = new PipedInputStream();
		PipedOutputStream	output = new PipedOutputStream();
		
		input.connect(output);//连接管道
		
		new Thread(new Input(input)).start();
		new Thread(new Output(output)).start();
		
		
	}

}
