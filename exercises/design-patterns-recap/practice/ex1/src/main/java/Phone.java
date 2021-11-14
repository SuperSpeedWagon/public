public class Phone implements Updatable{
    protected void printToPhone(String data){
        System.out.println("Phone - New data : " + data);
    }

    @Override
    public void update(String data) {
        this.printToPhone(data);
    }
}
