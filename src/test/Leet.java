package test;

public class Leet {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int value = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            value = value + nums[i];
            System.out.println(value);
            result[i] = value;
        }
        for(int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

        String IP = "192.0.0.1";
        String block = "[.]";
        String resultt = "";
        StringBuilder sb = new StringBuilder(resultt);
        System.out.println(IP);
        resultt = IP.replace(".", "[.]");
        System.out.println(resultt);
    }

}
