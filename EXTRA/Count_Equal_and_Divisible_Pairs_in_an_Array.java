

public int count(int[] nums , int k){
    int count = 0;
    int n = nums.length;
    for(int i=0;i<n-1;i++){

        for(int j=i+1;j<n;j++){
            int mul = i*j;
            if(mul%k==0 && nums[i] == nums[j]){
                count++;
            }
        }
    }

    return count;
}


public void main() {
    int[] nums = new int[]{3,1,2,2,2,1,3};

    int k = 2;

    System.out.println(count(nums,k));
}



