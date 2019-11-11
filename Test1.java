给定一个字符串数组 words，找到 length(word[i]) * length(word[j]) 的最大值，并且这两个单
词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-product-of-word-lengths
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int maxProduct(String[] words) {
        int[] res=new int[words.length];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                res[i]|=1<<(words[i].charAt(j)-'a');
            }
        }
        int maxlen=0;
        for(int i=0;i<res.length-1;i++){
            for(int j=i+1;j<res.length;j++){
                if((res[i]&res[j])==0){
                    maxlen=Math.max(maxlen,words[i].length()*words[j].length());
                }
            }
        }
        return maxlen;
    }
}

给定两个字符串, A 和 B。

A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结
果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rotate-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public boolean rotateString(String A, String B) {
        return A.length()==B.length()&&(A+A).contains(B);
    }
}

