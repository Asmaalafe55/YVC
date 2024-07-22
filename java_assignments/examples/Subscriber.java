package examples;

import java.util.ArrayList;

public class Subscriber {

  // instance variable
  private String name; // subscriber's name
  private ArrayList<MailMessage> messages; // mail messages collections

  public Subscriber(String name) {
    this.name = name;
    messages = new ArrayList<MailMessage>();
  }

  public void addMailMessage(MailMessage msg) {
    messages.add(msg);
  }

  public boolean equals(Object o) {
    return false;
  }

  public void sort() {
    sort(messages);
  }

  private void sort(ArrayList<MailMessage> messages2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sort'");
  }
  //   public void readFrom(String sender) throws NoMessageException {
  //     String msg = "";
  //     for (int i = 0; i < messages.size(); i++) {
  //       if (messages.get(i).getSender().equals(sender)) {
  //         msg = messages.get(i).getContent();
  //       }
  //     }
  //     // try {} catch (Exception e) {}

  //     if (msg == "") {
  //       throw NoMessageException;
  //     } else {
  //       System.out.println(msg);
  //     }
  //   }
}
