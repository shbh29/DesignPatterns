package org.example.designpatterns.builder;


public class Computer {

    private RAM RAM;
    private HDD HDD;
    private boolean hasUSBc;

    public static class ComputerBuilder {
        private RAM RAM;
        private HDD HDD;
        private boolean hasUSBc;

        public ComputerBuilder addRam(RAM ram) {
            this.RAM = ram;
            return this;
        }

        public ComputerBuilder addHDD(HDD hdd) {
            this.HDD = hdd;
            return this;

        }

        public ComputerBuilder addUsbC(boolean hasUSBc) {
            this.hasUSBc = hasUSBc;
            return this;
        }

        public Computer build() {
            return new Computer(this.RAM, this.HDD, this.hasUSBc);
        }
    }

    public org.example.designpatterns.builder.RAM getRAM() {
        return RAM;
    }


    public org.example.designpatterns.builder.HDD getHDD() {
        return HDD;
    }

    public boolean isHasUSBc() {
        return hasUSBc;
    }

    private Computer(org.example.designpatterns.builder.RAM RAM, org.example.designpatterns.builder.HDD HDD, boolean hasUSBc) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.hasUSBc = hasUSBc;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM=" + RAM +
                ", HDD=" + HDD +
                ", hasUSBc=" + hasUSBc +
                '}';
    }
}
