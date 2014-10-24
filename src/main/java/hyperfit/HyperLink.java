package hyperfit;

public class HyperLink {

    public HyperLink(String rel, String href, boolean templated) {
        this.rel = rel;
        this.href = href;
        this.templated = templated;
    }

    private final String rel;
    private final String href;
    private final boolean templated;

    public String getRel() {
        return rel;
    }

    public String getHref() {
        return href;
    }

    public boolean isTemplated() {
        return templated;
    }
}
