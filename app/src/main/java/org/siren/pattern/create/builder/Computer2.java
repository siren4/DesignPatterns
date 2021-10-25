package org.siren.pattern.create.builder;

public class Computer2 {
    private String memory;
    private String mainboard;
    private String cpu;
    private String gpu;

    public String getMemory() {
        return memory;
    }

    public Computer2 setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getMainboard() {
        return mainboard;
    }

    public Computer2 setMainboard(String mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public Computer2 setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getGpu() {
        return gpu;
    }

    public Computer2 setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
}
