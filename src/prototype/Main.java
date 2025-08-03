package prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating template resume (this will take 1 second)...");
        List<String> skills = List.of("Java", "Spring", "Hibernate");
        Resume template = new Resume("Template", "Senior Java Developer", skills);

        System.out.println("Cloning resumes (instant operation)...");
        Resume junior = template.clone();
        junior.setName("Junior Dev");
        junior.setPosition("Junior Java Developer");

        Resume middle = template.clone();
        middle.setName("Middle Dev");
        middle.setPosition("Middle Java Developer");

        Resume anotherSenior = template.clone();
        anotherSenior.setName("Senior Dev 2");

        System.out.println("\nResults:");
        System.out.println("Original: " + template);
        System.out.println("Junior: " + junior);
        System.out.println("Middle: " + middle);
        System.out.println("Another Senior: " + anotherSenior);

        System.out.println("\nNote how cloning was instant while original creation took time.");
    }
}