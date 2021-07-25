import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginForm3 extends Frame{
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	public LoginForm3(String title) {
		super(title);
		lbl_id = new Label("ID:", Label.RIGHT);
		lbl_pwd = new Label("PWD:", Label.RIGHT);
		
		txt_id= new TextField(10);
		txt_pwd = new TextField(10);
		txt_pwd.setEchoChar('*');
		btn_ok = new  Button("login");
		
		this.setLayout(new FlowLayout()); //���� (add)
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_id);
		this.add(txt_pwd);
		
		this.add(btn_ok);
		
		//����
		btn_ok.addActionListener(new ActionListener() {	//1ȸ�� ���� ���Ŵϱ� 1ȸ�� �͸��Լ��� ���°���
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText().trim();
				String pwd = txt_pwd.getText();
				
				if(id.equals("hong")) {
					System.out.println("�氡�氡 :" + "/" + pwd);
				}else {
					System.out.println("�����ִ� ���� �����ϱ�!!");
				}
				
			}
		});
		
		
		
		//Inner Class ���� (LoginForm2 outer �ڿ� ���)
		/*
		class Btn_Handler2 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = txt_id.getText().trim();
				String pwd = txt_pwd.getText();
				
				if(id.equals("hong")) {
					System.out.println("�氡�氡 :" + "/" + pwd);
				}else {
					System.out.println("�����ִ� ���� �����ϱ�!!");
				}
			}
			
		}
		*/
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
			
		});
		
		
		/*
		//���� (1ȸ��) 
		�ᱹ �������̽��� �����ϱ� ��������� �ʴ� �Լ��� �����ȴ�
		 
		: WindowListener �������̽� ����(�����ϴ� Ŭ������ ���� �͸�Ÿ��)
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				//â�ݱ� ...
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
	}
	
}
public class Ex14_Button_Event_Final {

	public static void main(String[] args) {
		LoginForm3 login = new LoginForm3("�α���");

	}

}
