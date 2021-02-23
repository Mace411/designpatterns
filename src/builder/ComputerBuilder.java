package builder;

/**
 * 主机创建者
 */
public class ComputerBuilder {

    private Computer computer;

    public static ComputerBuilder newBuilder() {
        ComputerBuilder builder = new ComputerBuilder();
        builder.computer = new Computer();
        return builder;
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setMemory(int memory) {
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder setDisk(int disk) {
        computer.setDisk(disk);
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        computer.setGpu(gpu);
        return this;
    }

    public Computer build() {
        //这里可以对某些必要参数校验
        return computer;
    }
}
