package palette;
public class Palette {
    private int r;
    private int g;
    private int b;
    private int brightness;
    private Color col;

    public Palette(int r, int g, int b, int brightness){
        this.r = r;
        this.g = g;
        this.b = b;
        this.brightness = brightness;
        col = new Color(r, g, b, brightness);
    }

    public static Palette Red = new Palette(255, 0, 0, 255);
    public static Palette Orange = new Palette(255, 69, 0, 255);
    public static Palette Yellow = new Palette(255, 255, 204, 255);
    public static Palette Green = new Palette(0, 255, 0, 255);
    public static Palette Blue = new Palette(0, 0, 255, 255);
    public static Palette Purple = new Palette(128, 0, 128, 255);
}
