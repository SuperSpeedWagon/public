import java.util.List;

public class DataStore {
    private String data;
    private List<Updatable> list;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // Data has changed. Update the UI
    }

    protected void update(Updatable u){
       u.update(this.data);
    }

}
