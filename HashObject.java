public class HashObject {
    Object key;
    int freqCount, probeCount;

    public HashObject(Object key) {
        this.key = key;
        freqCount = probeCount = 0;
    }

    @Override
    public boolean Equals(Object obj) {
        return super.equals(obj);

    }
}
