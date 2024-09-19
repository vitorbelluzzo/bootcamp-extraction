import java.time.LocalDate;

public class Mentorship extends Content {
    private String title;
    private String description;
    private LocalDate date;

    @Override
    public double calcXP() {
        return standardXP + 10d;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "date=" + date +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
}
