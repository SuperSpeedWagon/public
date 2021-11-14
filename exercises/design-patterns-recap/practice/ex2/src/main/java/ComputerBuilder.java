public class ComputerBuilder {
    private String name;
    private int dram;
    private int storage;
    private double frequency;
    private boolean integratedGraphics;
    private boolean hasUsbC;
    private int color;
    private int screenWidth;
    private int screenHeight;
    private boolean hasHDMI;
    private boolean hasSDReader;
    private boolean hasJack;

    public ComputerBuilder(String name){
        this.name = name;
    }

    public void dramAdd(int dram){
        this.dram = dram;
    }



    public Computer build(){
        return new Computer(name,dram,storage,frequency,integratedGraphics,hasUsbC,color,screenWidth,screenHeight,hasHDMI,hasSDReader,hasJack);
    }


}
