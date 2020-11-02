import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{2, 7, 11, 15};
        int target=9;
        //System.out.print(nums+nums2);
        List<Integer> list= new ArrayList<>();
        list.add(1);
        System.out.println(list.contains(1));
    }

    public static int[] twoSum(int[] nums, int target) {
        int number1=0;
        int number2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    number1=i;
                    number2=j;
                    break;
                }
            }
        }
        int[ ] result={number1,number2};
        return result;
    }

    public static int numTimesAllBlue(int[] light) {
        int number=0;
        int max=light[0];

        for(int i=0;i<light.length;i++){
            if(light[i]>max)
                max=light[i];

            List<Integer> list= new ArrayList<>();

            for(int j=1;j<=max;j++){
                list.add(j);
            }
            if(list.size()==i+1)
                number++;
        }
        return number;
    }
}
