package abstractfactory;

public class Main {
    public static void main(String[] args) {
        String provider = args.length > 0 ? args[0] : "aws";

        CloudFactory factory = switch(provider.toLowerCase()) {
            case "aws" -> new AwsFactory();
            case "azure" -> new AzureFactory();
            default -> throw new IllegalArgumentException("Invalid cloud provider: " + provider);
        };

        new DeploymentManager(factory).deploy();
    }
}