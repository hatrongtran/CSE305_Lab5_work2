public interface DocumentBuilder {
    void SetExtention(String extention);

    void SetEncryption(String encryption);

    public Document buildDocument();
}
