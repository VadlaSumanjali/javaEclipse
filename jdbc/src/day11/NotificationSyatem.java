package day11;
class Notification{
	public void send() {
		System.out.println("the notifications");
	}
}
class EmailNotification extends Notification {
	@Override
	public void send() {
		System.out.println("Notification sent through Email");
	}
}
class SMSNotification extends Notification {
	@Override
	public void send() {
		System.out.println("Notification sent through sms");
	}
}
class WhatsAppNotification extends Notification {
	@Override
	public void send() {
		System.out.println("Notification sent through whatsaap");
	}
}
public class NotificationSyatem {

	public static void main(String[] args) {
		EmailNotification e=new EmailNotification();
		e.send();
		
		SMSNotification s=new SMSNotification();
		s.send();
		
		WhatsAppNotification w=new WhatsAppNotification();
		w.send();
				

	}

}
