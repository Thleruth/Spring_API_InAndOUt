package hello.model;

/**
 * Created by Thomas Leruth on 10/26/17
 */

public class BeerInfo {

    private String message;
    private Data data;
    private String Status;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }

    public String getStatus() {
        return Status;
    }

}
