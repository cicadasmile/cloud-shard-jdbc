package cloud.shard.provider.config;

public class HashUtil {

    public static int rsHash(String value) {
        int one = 378551;
        int two = 63689;
        int hash = 0;
        for (int i = 0; i < value.length(); i++) {
            hash = hash * two + value.charAt(i);
            two = two * one;
        }
        return (hash & 0x7FFFFFFF);
    }
}
