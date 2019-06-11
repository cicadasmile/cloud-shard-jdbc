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

    /**
     * 判断新入库的位置
     */
    public static String moveDb (String value){
        int hashValue = rsHash(value) ;
        return "ds_" + ((hashValue % 3) + 2) ;
    }

    /**
     * 获取入表的位置
     */
    public static String moveTable (String value){
        int hashValue = rsHash(value) ;
        return "table_one_" + (hashValue % 5+1);
    }
}
