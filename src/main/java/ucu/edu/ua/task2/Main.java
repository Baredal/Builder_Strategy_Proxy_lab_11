package ucu.edu.ua.task2;

public class Main {

  public static void main(String[] args) {
    Client client1 = new Client("Vasya", 18, Sex.Male, "WRITE HERE CLIENT'S EMAIL");
    MailInfo mailInfo1 = new MailInfo(client1, new BirthdayMailcode());
    MailBox mailBox = new MailBox();
    mailBox.addMailInfo(mailInfo1);
    mailBox.sendAll();
    Client client2 = new Client("Vaso", 50, Sex.Male, "WRITE HERE CLIENT'S EMAIL");
    MailInfo mailInfo2 = new MailInfo(client2, new DiscountMailCode());
    mailBox.addMailInfo(mailInfo2);
    mailBox.sendAll();
    MailInfo MailInfo3 = new MailInfo(client2, new InvitationMailCode());
    mailBox.addMailInfo(MailInfo3);
    mailBox.sendAll();

  }
}