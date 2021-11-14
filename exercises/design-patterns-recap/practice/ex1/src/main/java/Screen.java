public class Screen implements Updatable {
    protected void display(String data){
        System.out.println("Screen - New data : " + data);
    }

    @Override
    public void update(String data) {
        this.display(data);
    }
}
