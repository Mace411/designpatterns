package builder;

/**
 * 建造者模式
 * 定义：将一个复杂的对象的构建和表示分离，是相同的构建过程可以产生不同的表示。
 * 将一个复杂对象分解成多个对象，然后一步一步地构建。
 * 主要目的是将对象的变和不变分离，对象的组成部分不变，但是每一部分可以灵活选择。
 * 优点：可以控制产品每部分的构建顺序，有的部分可能存在依赖关系，有效处理了这个问题
 * 缺点：如果产品的组成部分发生变化，建造者也要跟着变化，维护成本大
 */
public class Builder {

    public static void main(String[] args) {
        Computer computer = ComputerBuilder.newBuilder()
                .setCpu("i7 10700")
                .setMemory(32)
                .setDisk(1024)
                .setGpu("rtx3070")
                .build();
        computer.run();
    }

}
