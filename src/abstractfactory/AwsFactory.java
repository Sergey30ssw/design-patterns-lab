package abstractfactory;

public class AwsFactory implements CloudFactory {
    @Override
    public ComputeInstance createCompute() {
        return new AwsCompute();
    }

    @Override
    public BlobStorage createStorage() {
        return new AwsBlobStorage();
    }
}