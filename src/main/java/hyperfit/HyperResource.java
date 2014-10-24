package hyperfit;


public interface HyperResource {
    public HyperLink getLink(String relationship);
    public HyperLink[] getLinks(String relationship);


}
