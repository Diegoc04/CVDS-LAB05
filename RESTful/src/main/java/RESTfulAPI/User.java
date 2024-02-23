package RESTfulAPI;

public class User {
    private String userId;
    private String id;
    private String title;
    private boolean completed;

    public String getUserId(){
        return userId;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean getCompleted(){
        return completed;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
