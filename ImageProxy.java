public class ImageProxy implements Element,Picture{
    private String url;
    private Dimension dim = new Dimension(300, 300);
    private Image img;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if(this.img==null)
        {
            this.img = new Image(url);
        }
        return this.img;
    }

    public String url() {
        return null;
    }

    public Dimension dim() {
        return null;
    }

    public void print() {
        System.out.println("Image proxy with url " + this.url + "dimension " + dim);
        loadImage().print();
    }

    public void add(Element element) throws Exception {

    }

    public void remove(Element element) {

    }

    public boolean find(Element element) {
        return false;
    }

    public Element clone() {
        ImageProxy newProxy = new ImageProxy(this.url);
        return newProxy;
    }
}