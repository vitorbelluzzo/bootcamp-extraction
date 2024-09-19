import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev extends Content {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> contentFinished = new LinkedHashSet<>();

    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.contentFinished.add(content.get());
            this.subscribedContent.remove(content.get());
        }

    }

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContentList());
        bootcamp.getDevSubscribed().add(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(contentFinished, dev.contentFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribedContent, contentFinished);
    }

    public Set<Content> getContentFinished() {
        return contentFinished;
    }

    public void setContentFinished(Set<Content> contentFinished) {
        this.contentFinished = contentFinished;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    @Override
    public double calcXP() {
        return this.contentFinished.stream().mapToDouble(Content::calcXP).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
