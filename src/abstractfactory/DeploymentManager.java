package abstractfactory;

public class DeploymentManager {
    private final CloudFactory factory;

    public DeploymentManager(CloudFactory factory) {
        this.factory = factory;
    }

    public void deploy() {
        ComputeInstance instance = factory.createCompute();
        BlobStorage storage = factory.createStorage();

        instance.start();
        storage.save("config.yml");
    }
}