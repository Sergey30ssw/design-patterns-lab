package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Resume implements Cloneable {
    private String name;
    private String position;
    private List<String> skills;

    public Resume(String name, String position, List<String> skills) {
        this.name = name;
        this.position = position;
        this.skills = new ArrayList<>(skills);

        // Имитация дорогой операции
        try {
            Thread.sleep(1000);
            System.out.println("Created new resume for " + name);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Resume clone() {
        try {
            Resume clone = (Resume) super.clone();
            clone.skills = new ArrayList<>(this.skills);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", skills=" + skills +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return Objects.equals(name, resume.name) &&
                Objects.equals(position, resume.position) &&
                Objects.equals(skills, resume.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, skills);
    }
}