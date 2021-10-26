public class Paragraph implements Element{
    private String text;
    private AlignStrategy align;

    public Paragraph(String text) {
        this.text = text;
    }

    public void add(Element element) {
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }

    public void remove(Element element) {
    }

    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).text.equals(this.text);
        }
    }

   public Element clone() {
        Paragraph newparagraph = new Paragraph(this.text);
        return newparagraph;
    }

    public void print() {
        if (this.align!=null) {
            this.align.render(this, null);
        }
        System.out.println("Paragraph" + this.text);
    }

}