package abstractfactory;

public interface CloudFactory {
    ComputeInstance createCompute();
    BlobStorage createStorage();
}