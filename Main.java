import java.util.*;

/*public class MyClass {
    public static int[] twoSum(int[] nums, int target ){
        int[] arr = new int[2];
        
        for(int i =0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
      
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
      
    
}*/

//dsa -1
/* class Solution
{
    public static int findSum(int A[], int N) 
    {
        //code here
        int small= 0;
        int large= 0;
        
        for(int i=0; i<N-1; i++){
            if(A[small] > A[i+1]){
                small = i+1;
            }
            if(A[large] < A[i+1]){
                large = i+1;
            }
        }
        
        return A[small] + A[large];
    }
    
    public static void main(String args[]){
        int A[] = {-2,1,-4,5,3};
        
        System.out.println(findSum(A,5));
    }
}
*/

//dsa-2
/*class Reverse
{
    
    public static String reverseWord(String str)
    
    {
        // Reverse the string str
        
        String newStr = "";
        
        for(int i= str.length()-1; i>=0; i--){
            newStr += str.charAt(i);
        }
        
        return newStr;
    }
    
    public static void main(String args[]){
        String str = "Geeks";
        System.out.println(reverseWord(str));
    }
}*/

 // palindrome
 /*class Solution {
    public static boolean isPalindrome(int x) {
        
        int y = x;
        ArrayList<Integer> arr = new ArrayList<>();
           
        if(y<0){
            
           //while(-y>0){
            //    arr.add(-y%10);
           //     y=y/10;
          //  }
           // arr.add(0);
          //  arr.set(0,-(arr.get(0)));
           // arr.remove(arr.size()-1);
            return false;
        }else if(y>0){
            while(y>0){
                arr.add(y%10);
                y=y/10;
            }
        }else if(y==0){
            arr.add(0);
        }

        String str = "";

        for(int i=0;i<arr.size(); i++){
            str += Integer.toString(arr.get(i));
        }
         
         System.out.println(str);
        return str.equals(Integer.toString(x));


    }

    public static void main(String args[]){
        System.out.println(isPalindrome(121));
    }
}

*/
// return true if duplicates are present in an array else return false

/*class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

  public static void main(String args[]){
    int nums[] = {1,2,3,1};
    System.out.println(containsDuplicate(nums));

  }
}*/

/*class Solution {
    public int reverse(int x) {
        long temp = 0;

        while(x!=0){
            temp += x%10;
            temp *= 10;
            x /= 10;
        }

        temp /= 10;
        if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
            return 0;
        }

        if(x < 0){
            return (int)(-temp);
        }else{
            return (int) (temp);
        }
    }
}*/

//find the max length substring with non repeating characters 

/*class MyClass{
    public static void find(String s, HashSet<String> h1, int idx,String str){
        if(idx==s.length()){
            if(h1.contains(str)){
                return;
            }else{
                h1.add(str);
                return;
            }
        }
        
        char curr = s.charAt(idx);
        find(s,h1,idx+1,str+curr);
        find(s,h1,idx+1,str);
    }
    public static void lengthOfLongestSubstring(String s) {
        HashSet<String> h1 = new HashSet<>();
        find(s,h1,0,"");
        
        String comb[] = h1.toArray(new String[h1.size()]);
        int large = 0;
        
        //System.out.println(Arrays.toString(comb));
        
        int[] arr = new int[comb.length];
        
        String str1 = "";
        
        for(int i=0; i<comb.length;i++){
            str1 = comb[i];
           // System.out.println(str1);
            char[] arr2 = str1.toCharArray();
            Arrays.sort(arr2);
           // System.out.println(Arrays.toString(arr2));
            
            for(int j=0; j<arr2.length-1; j++){
              if(arr2[j] == arr2[j+1]){
                  h1.remove(str1);
                  break;
              }
            } 
        }
        
        
        System.out.println(h1);

       // for (int i=0; i<comb.length-1; i++){
       //    if((comb[large]).length() < (comb[i+1]).length()){
       //        large = i+1;
       //   }
       // }

        //return comb[large].length();
    }

    public static void main(String args[]){
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));
        lengthOfLongestSubstring("abaabcyc");
    }
          }*/

//remove elements

/*class Solution {
    public int removeElement(int[] nums, int val) {
        int len =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[len];
                nums[len] = temp;
                len++;

            }
        }
        return len;
    }
}*/

//or


  /*public class Main {
     public static int remove(int nums[], int val){
        int[] arr = new int[nums.length];
        int count = 0;
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=val){
                arr[idx] = nums[i];
                idx++;
            }else{
                count++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        int k = nums.length - count;
        return k;
        
     }
    public static void main(String args[]){
        int[] nums = {3,2,2,3};
        System.out.println(remove(nums,3));
    }
}*/

//find the subArray with the given size-->k having the maximum value

//normal method 

/*public class Main{
  public static int find(int[] arr,int k){
     int sum = 0;
     int maxSum = 0;
     for(int i=0;i<arr.length-2;i++){
       for(int j=i;j<k;j++){
         sum += arr[j];
       }
       maxSum = Math.max(maxSum, sum);
       sum = 0;//reasigning because I need add fresh 3 numbers
       k++;
     }
   
    return maxSum;


  }
  public static void main(String args[]){
    int[] arr = {2,9,31,-4,21,7};
    System.out.println(find(arr,3));

  }
}*/

//by SLIDING WINDOW TECHNIQUE 
/*public class Main{
  public static int find(int[] arr,int k){
    int sum = 0;
    int maxSum = 0;
    for(int i=0;i<k;i++){
      sum += arr[i];
    }
    maxSum = Math.max(maxSum,sum);


    for(int i=k;i<arr.length;i++){
      sum = sum - arr[i-k] + arr[i];
      maxSum = Math.max(maxSum,sum);
    }

   return maxSum;
  }

  
  public static void main(String args[]){
    int[] arr = {2,9,31,-4,21,7};
    System.out.println(find(arr,3));
  }
}*/

// move all duplicates to the end of sorted array
/*class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[len] = nums[i];
                len++;
            }
        }
        nums[len] = nums[nums.length-1];
        
        return ++len;
    }
}*/

// longest Substring Without Repeating Characters 

/*class Main {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        int i=0, j=0, maxlen=0;

        while(j<s.length()){
            if(h1.containsKey(s.charAt(j))){
                i = Math.max(h1.get(s.charAt(j))+1,i);
            }


            h1.put(s.charAt(j),j);
            maxlen = Math.max(j-i+1,maxlen);
            ++j;
        }

        return maxlen;

    }
}*/

//merge sorted array

/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         if(n==0){
            return;
         }

        int idx = m;

        for(int i=0; i<nums2.length; i++){
            nums1[idx] = nums2[i];
            idx++;
        }

        Arrays.sort(nums1);
    }
}*/

//print the most repeating element

/*public class MyClass {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i=0, j=0, maxLen=0, mostRep=0;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                i = Math.max(hm.get(nums[i])+1,i);
            }
            hm.put(nums[j],j);
            maxLen = Math.max(j-i+1,maxLen);
            if(j-i+1 >= maxLen){
                mostRep = nums[j];
            }
            j++;
        }
        return mostRep;
    }
    
    public static void main(String args[]){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
*/

//rotate the array

/*class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<=1){
            return;
        }

        k %= nums.length;
        if(k==0){
            return;
        }
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }

    public void rev(int[] nums,int si,int ei){
        while(si<ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }

    }
}
*/

//best time to buy and sell a stock

/*class Solution {
    public int maxProfit(int[] prices) {
        int small = prices[0];
        int large = prices[0];
        int i = 0, maxP = 0, currP = 0;
        while(i<prices.length-1){
           if(small>prices[i+1]){
              small = prices[i+1];
              large = prices[i+1];
            }
           if(large<prices[i+1]){
            large = prices[i+1];
           }
            currP = large-small;
            maxP = Math.max(currP,maxP);
            i++;
        }
        return maxP;
    }
    
}*/

// Roman to Integer

/*class Solution {
    public int romanToInt(String s) {
        int[] arr = new int[26];
        arr[8] = 1;
        arr[21] = 5;
        arr[23] = 10;
        arr[11] = 50;
        arr[2] = 100;
        arr[3] = 500;
        arr[12] = 1000;

        int currSum=0,total=0,i=0,x=0;
        char curr;
        while(i<s.length()){
            curr = s.charAt(i);
            currSum = arr[curr - 'A'];
            if(i!=s.length()-1){
            if(arr[curr-'A'] < arr[s.charAt(i+1) - 'A']){
                x = arr[s.charAt(i+1) - 'A'] - arr[curr - 'A'];
                currSum = x;
                i += 2;
            }else{
                i++;
            }
        }else{
            i++;
        }
            total += currSum;
            currSum = 0;
        }
        return total;
    }
}*/

//median of two sorted array
/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = Arrays.copyOfRange(nums1,0,nums1.length+nums2.length);
        int i=0,j=nums1.length;
        while(i<nums2.length){
           arr[j++] = nums2[i++];
        }
        Arrays.sort(arr);
        double mid = 0.0;
        int ei= arr.length-1;

        if(arr.length%2==0){
            mid = (double) (arr[ei/2]+arr[(ei/2)+1])/2;
        }else{
            mid = (double) arr[ei/2];
        }
        return mid;

    }
}*/

//length of the last word
/*class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1,len=0;
        while(s.charAt(i) == ' '){
            i--;

        }
        if(s.length()==1){
            return ++len;
        }
        while(i>=0){
           if(s.charAt(i) != ' '){
              len++;
              i--;
            }else{
                break;
            }
       }
       return len;
    }
}*/

//reversing a string 
/*public class Main{
    public static void main(String args[]){
        String s1 = "abcdef";
        String s2 = "";
        for(int i=0;i<s1.length();i++){
           char curr = s1.charAt(i);
           s2 = curr + s2;
        }
        System.out.println(s2);
    }
}*/

// maximum string pairs
/*class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs = 0;
        String s2 = "";
        char curr;
        for(int i =0; i<words.length-1; i++){
            String str = words[i];
            for(int j=0; j<str.length(); j++){
               curr = str.charAt(j);
               s2 = curr+s2;                
            }
            for(int y=i+1;y<words.length;y++){
               if(s2.equals(words[y])){
                    pairs++;
                  }
            }
           s2 = "";
        }
       return pairs;
    }
}*/

//Reverse words in a string
 /*class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\s+"," ");
        String arr[] = s.trim().split(" ");
        String y = "";
        for(int i=0;i<arr.length;i++){
            y = " "+ arr[i] + y;
        }

        return y.trim();
    }
}*/

//intersection of two arrays
/*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                al.add(nums2[i]);
                s.remove(nums2[i]);
            }
        }
      
        int arr[] = al.stream().mapToInt(i -> i).toArray();

        return  arr;
    }
}*/

//majority element
/*
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])) hm.put(nums[i],hm.get(nums[i])+1);
            else hm.put(nums[i],1);
        }

        for(int keys: hm.keySet()){
            if(hm.get(keys) > n/3) arr.add(keys);
        }
        return arr;
    }
}*/


//kth largest element
/*class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}*/

//next greater element for every element in an array
/*
public class MyClass {
    public static void main(String args[]) {
     int arr[] = {3,2,4,5,1};
     int arr2[] = new int[arr.length];
     int max = arr.length-1, curr = max-1, idx = max;
     arr2[idx--] = -1;
     while(curr>=0){
         if(arr[max] > arr[curr]){
             arr2[idx--]  = arr[max];
             if(curr!=0){
                if(arr[curr] > arr[curr-1]){
                  max = curr--;
                }else curr--;
              }else curr--;
         }else{
             arr2[idx--] = -1;
             max = curr--;
         }
     }
     System.out.println(Arrays.toString(arr2));
     
    }
}*/

//longest common prefix 
/*
class Solution {
    class Node{
        Node[] arr;
        boolean eow;
        char val;
        int appear;

        public Node(char alpha){
            arr = new Node[26];
            val = alpha;
            eow = false;
            appear = 0;
        }
    }

    private Node root = new Node(' ');
    
    public void insert(String str){
       Node curr = root;
       for(int i=0;i<str.length();i++){
           int idx = str.charAt(i) - 'a';
           if(curr.arr[idx] == null){
               curr.arr[idx] = new Node(str.charAt(i));
            }
           curr = curr.arr[idx];
           curr.appear += 1;
       }
       curr.eow = true;
    }



    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs.length;i++){
            insert(strs[i]);
        }
        Arrays.sort(strs,Comparator.comparing(String::length));
        String s = strs[0];

        Node curr = root;
        String newStr = "";
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.arr[idx].appear == strs.length) newStr += Character.toString(s.charAt(i));
            curr = curr.arr[idx];
        }
        return newStr;
    }
}*/

//  maximum achievable number
/*
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x = 0;
        
        while(x<t){
            num+=1;
            x++;
        }
        return num+t;
    }
}*/
//valid parentheses
/*
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
           char curr = s.charAt(i);
           if(curr == '(') st.push(')');
           else if(curr == '[') st.push(']');
           else if(curr == '{' ) st.push('}');
           else if(st.isEmpty()) return false;
           else {
               if(curr == st.peek()) st.pop();
               else return false;
            }
           
        }
        return st.isEmpty();
    }
}*/

//increasing inorder search tree
/*
class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> al){
        if(root == null) return;
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
    //public static int idx = -1;
    public TreeNode build(TreeNode root,ArrayList<Integer> al){
      if(al.isEmpty()){
          return null;
      }
      TreeNode newNode = new TreeNode(al.remove(0));
      newNode.left = null;
      newNode.right = build(newNode.right, al);
      return newNode;
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        TreeNode rootNode = null;
        rootNode = build(rootNode,al);
        return rootNode;
    }
}*/

//linked list cycle
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        if( head == null || head.next == null) return false;
        while(head.next != null){
            if(hs.contains(head)) return true;
            hs.add(head);
            head = head.next;
        }
        return false;
    }
}*/
//add two numbers 
/*
class Solution {
    public int carry = 0;
    public ListNode build(ListNode l1,ListNode l2){
        if(l1==null && l2 == null && carry == 0) return null;
        int v1 = (l1 != null) ? l1.val : 0;
        int v2 = (l2 != null) ? l2.val : 0;
        int sum = v1 + v2 + carry;
        carry = sum/10;

        ListNode node = new ListNode(sum%10);
        if(l1 != null) l1 = l1.next;
        if(l2 != null) l2 = l2.next;
        node.next = build(l1,l2);
        return node;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = null;
        newNode = build(l1,l2);
        return newNode;
    }
}*/

//climbing stairs
/*
public class Main{
  public static int nWays(int s, int x){
    if(x==s){
      return 1;
    }
    if(x>s){
      return 0;
    }

    //int w1 = nWays(s,x+1);
    //int w2 = nWays(s,x+2);
    return nWays(s,x+1) + nWays(s, x+2);
  }

  public static void main(String args[]){
    System.out.print("Enter the number of steps : ");

    Scanner sc = new Scanner(System.in);
    int stairs = sc.nextInt(),x=0;
    x = nWays(stairs,x);
    System.out.println(x);


  }
}
//or
class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }
}

*/
//maximum depth of binary tree
class Solution {
   public int max = 0;
    public void find(TreeNode node,int d1){
        if(node == null){
            max = Math.max(max,d1);
            return;
        }else if(node != null){        
          d1++;
          find(node.left,d1);
          find(node.right,d1);
        }
    }
    public int maxDepth(TreeNode root) {
        int d = 0;
        find(root,d);
        return max;
    }
}
