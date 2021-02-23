package builder;

/**
 * 电脑主机
 */
public class Computer {
    /**
     * cpu
     */
    private String cpu;
    /**
     * 内存
     */
    private int memory;
    /**
     * 硬盘
     */
    private int disk;
    /**
     * 显卡
     */
    private String gpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void run() {
        System.err.println("开机了");;
    }
}
