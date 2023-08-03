package solid.live.ocp;

public interface Slot {
    int findFree();
    void markFree(int resourceId);
    void markBusy(int resourceId);
}