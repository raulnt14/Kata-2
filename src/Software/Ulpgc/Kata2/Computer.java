package Software.Ulpgc.Kata2;

public class Computer {
    private final String manufacturer;
    private final String model;
    private final String category;
    private final String screenSize;
    private final String screen;
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String gpu;
    private final String os;
    private final String osVersion;
    private final String weight;
    private final String price;

    public Computer(String manufacturer, String model, String category, String screenSize, String screen, String cpu, String ram, String storage, String gpu, String os, String osVersion, String weight, String price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.category = category;
        this.screenSize = screenSize;
        this.screen = screen;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
        this.osVersion = osVersion;
        this.weight = weight;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getScreen() {
        return screen;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getOs() {
        return os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getWeight() {
        return weight;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", category='" + category + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", screen='" + screen + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", os='" + os + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", weight='" + weight + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
