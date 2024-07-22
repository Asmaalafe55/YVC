package examples;

public class MailMessage {

  // instance variable
  private String subject; // title of the message
  private String content; // content of the message
  private String sender; // sender's email address
  private String receiver; // sender's email address
  private boolean read; // is read? true=read, false=unread

  public MailMessage(
    String subject,
    String content,
    String sender,
    String receiver
  ) {
    this.subject = subject;
    this.content = content;
    this.sender = sender;
    this.receiver = receiver;
    this.read = false;
  }

  public String toString() {
    return (
      "MailMessage [subject=" +
      subject +
      ", content=" +
      content +
      ", sender=" +
      sender +
      ", receiver=" +
      receiver +
      ", read=" +
      read +
      "]"
    );
  }

  public boolean equals(String sub, String cont) {
    if (this.subject.equals(sub) && this.content.equals(cont)) {
      return true;
    }
    return false;
  }

  public void readMessage() {
    System.out.println();
  }

  public boolean isRead() {
    return this.read ? true : false;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public void setRead(boolean read) {
    this.read = read;
  }
}
