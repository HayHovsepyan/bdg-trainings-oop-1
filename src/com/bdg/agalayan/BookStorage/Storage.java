package BookStorage;

public abstract class Storage {
    protected int storageSize;

    protected Storage(int storageSize){
        this.storageSize=storageSize;

    }
public abstract int getCurrentStorageSize();
}

