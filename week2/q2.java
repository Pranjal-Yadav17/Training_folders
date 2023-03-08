import java.sql.PseudoColumnUsage;

public class q2 {
  public static void main(String[] args) {
    int[] nums= {12, 4, 9, 78, 90, 5, 64, 38, 11,3, 66, 55};

    int first_max= Integer.MIN_VALUE;
    int second_max= Integer.MIN_VALUE;

    for(int i=0; i<nums.length; i++){
      if(nums[i] > first_max){
        second_max = first_max;
        first_max= nums[i];
      }
    }
    System.out.println(second_max);
  }
}
