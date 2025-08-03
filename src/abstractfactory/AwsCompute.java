package abstractfactory;

public class AwsCompute implements ComputeInstance {
    @Override
    public void start() {
        System.out.println("AWS EC2 instance started");
    }
}