package abstractfactory;

public class AzureCompute implements ComputeInstance {
    @Override
    public void start() {
        System.out.println("Azure Virtual Machine started");
    }
}