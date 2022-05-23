package bsu.rfe.java.group7.lab8.Chikilev.var5a;

public class ChatMessage {
    //  public int getf;
    // Текст сообщения
    private String message;
    // Автор сообщения
    private ChatUser author;
    // Временная метка сообщения (в микросекундах)
    private long timestamp;

    private long sek = 1;

    public ChatMessage(String message, ChatUser author, long timestamp) {
        super();
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
       // this.getf = getf;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatUser getAuthor() {
        return author;
    }

    public void setAuthor(ChatUser author) {
        this.author = author;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getSek() {
        return sek;
    }


}
