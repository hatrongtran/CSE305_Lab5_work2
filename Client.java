public class Client {
    private DocumentBuilder builder;

    public Client(DocumentBuilder builder) {
        this.builder = builder;
    }

    public Document newDocument() {
        builder.SetEncryption(null);
        builder.SetExtention(null);
        return builder.buildDocument();
    };

    class Test {
        public static void main(String[] args) {
            DocumentBuilder DocumentBuilder = new normalDoc();
            Client client = new Client(DocumentBuilder);
            Document a = client.newDocument();
            System.out.println(a);
        }
    }
}
