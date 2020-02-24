package com.fgonzalesv.project2;

public class Container implements ContainerInterface {
    private MyStack<DonationPackage> containerStack;

    public Container(int capacity) {
        this.containerStack = new MyStack<>(capacity);
    }

    public Container() {this.containerStack = new MyStack<>();}

    @Override
    public boolean loadContainer(DonationPackage dPackage) throws ContainerException {
        return false;
    }

    @Override
    public DonationPackage removePackageFromContainer() throws ContainerException {
        return null;
    }

    @Override
    public DonationPackage[] toArrayPackage() {
        return new DonationPackage[0];
    }
}
