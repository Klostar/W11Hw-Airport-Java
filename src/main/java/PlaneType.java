public enum PlaneType {
    BOEING747(10),
    BOEING767(9),
    BOEING777(8),
    BOEING787(7),

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
