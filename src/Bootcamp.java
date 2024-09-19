import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private Set<Dev> devSubscribed = new HashSet<>();
    private Set<Content> contentList = new LinkedHashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(devSubscribed, bootcamp.devSubscribed) && Objects.equals(contentList, bootcamp.contentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devSubscribed, contentList);
    }

    public Set<Content> getContentList() {
        return contentList;
    }

    public void setContentList(Set<Content> contentList) {
        this.contentList = contentList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Dev> getDevSubscribed() {
        return devSubscribed;
    }

    public void setDevSubscribed(Set<Dev> devSubscribed) {
        this.devSubscribed = devSubscribed;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}


