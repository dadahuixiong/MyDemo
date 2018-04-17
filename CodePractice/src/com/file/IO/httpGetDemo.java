package com.file.IO;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import javax.swing.text.html.parser.Entity;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;

public class httpGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建默认的httpClient实例
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			//使用get方法发送http请求
			HttpGet get = new HttpGet("http://www.baidu.com");
			System.out.println("执行get请求的URL是："+get.getURI());
			CloseableHttpResponse httpResponse = null;
			//发送get请求
			httpResponse = httpClient.execute(get);
			try {
				//response实体
				HttpEntity entity = httpResponse.getEntity();
				if(null != entity){
					System.out.println("响应状态码是："+httpResponse.getStatusLine());
					System.out.println("-------------------------------------------------");
					System.out.println("响应内容是："+EntityUtils.toString(entity));
				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally{
				httpResponse.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				closeHttpClient(httpClient);
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		
	}
	 private CloseableHttpClient getHttpClient(){
	        return HttpClients.createDefault();
	 }
	 private static void closeHttpClient(CloseableHttpClient client) throws IOException{
	        if (client != null){
	            client.close();
	        }
	    }
	 
}













