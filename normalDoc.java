public class normalDoc implements DocumentBuilder {
    private String extention;
    private String encryption;
    @Override
    public void SetEncryption(String encryption) {
      this.encryption=encryption;
        
    }
    @Override
    public void SetExtention(String extention) {
       this.extention=extention;
        
    }
    @Override
    public Document buildDocument() {
       
        return null;
    }
}
