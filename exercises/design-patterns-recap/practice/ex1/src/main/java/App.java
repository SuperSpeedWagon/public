public class App {
    public static void main(String[] args) {
        // Create two screens
        Screen screen = new Screen();
        Phone phone = new Phone();
        // Create a datastore
        DataStore dataStore = new DataStore();
        // Connect the dataStore and the screens

        // Update data in the dataStore
        String data = "Some data";
        dataStore.setData(data);
        dataStore.update(screen);
        dataStore.update(phone);

        data = "New data";
        dataStore.setData(data);
        dataStore.update(screen);
        dataStore.update(phone);
    }
}
