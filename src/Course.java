public class Course extends Content {
    private String title;
    private String description;
    private int workload;


    @Override
    public String toString() {
        return "Course{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public double calcXP() {
        return standardXP + 20d;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
