package org.siren.pattern.create.builder;

public class Computer {
    private String memory;
    private String mainboard;
    private String cpu;
    private String gpu;

    private Computer(Builder builder) {
        memory = builder.memory;
        mainboard = builder.mainboard;
        cpu = builder.cpu;
        gpu = builder.gpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public static final class Builder {
        private String memory;
        private String mainboard;
        private String cpu;
        private String gpu;

        private Builder() {
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder setMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
