package abstractfactory;

public class AzureBlobStorage implements BlobStorage {
    @Override
    public void save(String name) {
        System.out.println("File " + name + " saved to Azure Blob Storage");
    }
}