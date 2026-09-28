class Solution {
    public boolean checkPerfectNumber(int num) {
        int original = num;
        int sum = 0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==original){
            return true;
        }
        return false;
    }
}