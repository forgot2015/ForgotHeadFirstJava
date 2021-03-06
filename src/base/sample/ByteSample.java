package base.sample;

import java.util.Arrays;

/**
 * @author forgot
 * @date 2017/7/8
 */
public class ByteSample {
    static byte[] bytes = {(byte) 0x98, 0x68, (byte) 0xff, 0x01, 0x00, 0x01, 0x02, 0x00, 0x00, (byte) 0xFE, (byte) 0xDA, 0x6E};

    public static void main(String[] args) {
        System.out.println(bytesToHexString(bytes, bytes.length));
        String[] strings = bytesToHexString(bytes, bytes.length).split(" ");
        System.out.println(Arrays.toString(strings));
        int i5 = Integer.parseInt(strings[5]);
        int i6 = Integer.parseInt(strings[6]);
    }

    static String bytesToHexString(byte[] src, int size) {
        StringBuilder ret = new StringBuilder();
        if (src == null || size <= 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            String hex = Integer.toHexString(src[i] & 0xFF);
            ret.append(hex).append(" ");
        }
        return new String(ret);
    }


}
