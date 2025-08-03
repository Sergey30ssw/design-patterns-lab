package abstractfactory;

public class AwsBlobStorage implements BlobStorage {
    @Override
    public void save(String name) {
        System.out.println("File " + name + " saved to S3 bucket");
    }
}