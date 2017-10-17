package msabook.ch02.oauth;

import java.io.Serializable;

public class Greet implements Serializable {

    private String message;

    public Greet() {
    }

    public Greet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
