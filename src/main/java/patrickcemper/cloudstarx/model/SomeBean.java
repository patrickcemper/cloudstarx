package patrickcemper.cloudstarx.model;

public class SomeBean {

    private long id;
    private String content;

    public SomeBean(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
