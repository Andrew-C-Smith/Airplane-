public enum PlaneType {

    BIPLANE(2,5),
    THE_MILANO(12,600);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

}
