package util;

public class Test {
 public static void main(String[] args) {
	EmailSend emailSend = new EmailSend("1362523066@qq.com");
	try {
		emailSend.send();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
