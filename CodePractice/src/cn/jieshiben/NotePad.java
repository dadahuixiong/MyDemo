package cn.jieshiben;

import javax.swing.*;

import java.io.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NotePad  extends JFrame implements ActionListener{
	//定义需要的组件
	JTextArea jta = null;
	JMenuBar jmb = null;//定义菜单栏
	JMenu jm1,jm2,jm3,jm4 = null;
	JMenuItem jmi1 = null;
	JMenuItem jmi2 = null;
	JMenuItem jmi3 = null;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NotePad();
	}
	public NotePad(){
		jta = new JTextArea();
		jmb = new JMenuBar();
		jm1 = new JMenu("文件(F)");
		jm2 = new JMenu("编辑(E)");
		jm3 = new JMenu("格式(O)");
		jm4 = new JMenu("查看(V)");
		
		jm1.setMnemonic('F');//设置快捷键
		jm2.setMnemonic('E');
		jm3.setMnemonic('O');
		jm4.setMnemonic('V');
		
		jmi1 = new JMenuItem("打开",new ImageIcon("123.png"));
		jmi1.addActionListener(this);//注册监听
		jmi1.setActionCommand("open");//设置标签
		jmi2 = new JMenuItem("保存");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("save");
		jmi3 = new JMenuItem("退出");
		jmi3.addActionListener(this);
		jmi3.setActionCommand("exit");
		
		
		this.setJMenuBar(jmb);//jmb放入jframe
		jmb.add(jm1);//jm1放入jmb
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jm1.add(jmi1);//item放入Menu
		jm1.add(jmi2);
		jm1.add(jmi3);
		
		
		this.add(jta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//判断哪个菜单被选中(判断哪个标签被选中)
		if (e.getActionCommand().equals("open")) {
			System.out.println("open");
			
			//JFileChooser
			JFileChooser jfc1 = new JFileChooser();//创建文件选择组件(弹窗)
			jfc1.setDialogTitle("请选择文件...");//给弹窗命名
			jfc1.showOpenDialog(null);//默认打开位置
			jfc1.setVisible(true);
			
			//得到用户选择的文件全路径
			String filename = jfc1.getSelectedFile().getAbsolutePath();
			//System.out.println(filename);
			
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				
				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				
				//从文件中读取信息，并show
				String s = "";
				String allCon = "";
				while ((s=br.readLine())!=null) {
					allCon+=s+"\r\n";	
				}
				jta.setText(allCon);
				
			} catch (Exception e2) {
				// TODO: handle exception
			} finally{
				try {
					br.close();
					fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			
		}else if (e.getActionCommand().equals("save")) {
			//出现保存对话框
			JFileChooser jfc = new JFileChooser();
			jfc.setDialogTitle("另存为...");
			jfc.showSaveDialog(null);//按默认方式显示打开的窗口
			jfc.setVisible(true);
			
			//得到保存后的文件路径
			String file = jfc.getSelectedFile().getAbsolutePath();
			
			//准备写入到指定文件
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				bw.write(this.jta.getText());
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			} finally{
				try {
					bw.close();
					fw.close();
				} catch (Exception e3) {
					// TODO: handle exception
				}
			}
			
		} else if (e.getActionCommand().equals("exit")) {
			System.exit(0);
		}
		
	}

}
