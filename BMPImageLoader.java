public class BMPImageLoader implements ImageLoader{

    private String imageName;

    public BMPImageLoader(String imageName)
    {
        this.imageName = imageName;
    }
    public void loadImage(String str) {
        System.out.println("Loaded image: " + str);
    }

}