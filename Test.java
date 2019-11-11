class Solution {
    public int[] singleNumber(int[] nums) {
       int[] res={0,0};
        int a=0;
        for(int i:nums){
            a^=i;
        }
        int b=a&(-a);
        for(int i:nums){
            if((i&b)==0){
                res[0]^=i;
            }else{
                res[1]^=i;
            }
        }
        return res;
    }
}

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
       int count=0;
        while(m!=n){
            n>>=1;
            m>>=1;
            count++;
        }
        return n<<count;
    }
}

class Solution {
    public int[] countBits(int num) {
        int[] arr=new int[num+1];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i&(i-1)]+1;
        }
        return arr;
    }
}

class Solution {
    public int integerReplacement(int n) {
        int count=0;
        while(n!=1){
           if((n&1)==0){
               n>>>=1;
               count++;
           }else{
               if((n&2)==0){
                   n--;
                   count++;
               }else{
                   if(n==3){
                       count+=2;
                       break;
                   }else{
                       n++;
                       count++;
                   }
               }
           }
        }
        return count;
    }
}
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只
出现了一次的元素。
class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        int b=0;
        for(int num:nums){
            a=(a^num)&~b;
            b=(b^num)&~a;
        }
        return a;
    }
}

