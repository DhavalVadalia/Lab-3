package ca.sait.simplenotekeeper.javabeans;
import java.io.Serializable;

public class Note implements Serializable {
    private String ttl;
    private String con;

    public Note() {}
    
    public Note(String title, String contents) {
        ttl = title;
        con = contents;
    }

    public String getTitle() {
        return ttl;
    }

    public void setTitle(String title) {
        ttl= title;
    }

    public String getContents() {
        return con;
    }

    public void setContents(String contents) {
        con = contents;
    }
    
}
