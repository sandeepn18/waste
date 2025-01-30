import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solutions{
    public static void reverseString(String s){
        char[] chars = s.toCharArray();
        int l = 0; int r = chars.length-1;
        while(l<r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    String newString = new String(chars);
    System.out.println(newString);
    }

    public static void reverseTwoNumsWithoutTemp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " "  + b);
    }

    public static void countTheNumberOfWords(String s){
        HashMap<String, Integer> op = new HashMap<>();
        String[] st = s.split("\\s+");
        for(String word : st ){
            op.put(word, op.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String, Integer> entry : op.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());

        }
    }
    public static void checkPrime(int a){
        boolean res = true;
        if(a <=1){
            res = false;
        }
        for(int i=2; i<=Math.sqrt(a); i++){
            if (a%i == 0) {
                res = false;
            }
        }
        System.out.println(res);

    }

    public static void palindromeOrNot(String s){
        int l = 0;
        int r = s.length()-1;
        boolean res = true;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                res = false;
            }
            l++;
            r--;
        }
        System.out.println(res);
    }

    public static void countNumOfChars(String s){
        HashMap<Character, Integer> counts = new HashMap<>();
        for(char c : s.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : counts.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
            
        }

        for(Map.Entry<Character, Integer> entry : counts.entrySet()){
            if(entry.getValue()>=2){
                System.out.println("this character is duplicate" + " --> " + entry.getKey());
            }
        }
    }

    public static void secondhighestMinorMax(List<Integer> a){
        int firstValue = Integer.MIN_VALUE;
        int secondValue = Integer.MIN_VALUE;

        for(int i : a){
            if (i>firstValue){
                firstValue = i;
            } 
        }
        for(int j : a){
            if(j> secondValue && j< firstValue){
                secondValue = j;
            }
        }
        System.out.println(firstValue);
        System.out.println(secondValue);
 
    }

    public static void checkArmstrong(int a){
        int power = String.valueOf(a).length();
        int sum =0;
        int originalNum = a;
        while(a>0){
            int digit = a%10;
            sum += Math.pow(digit, power);
            a = a/10;
        }
        if (originalNum == sum){
            System.out.println("its an armstrong number");
        }
        else{
            System.out.println("its not an armstrong number");
        }

    }

    public static void indexOfNumsToAddUptoTarget(List<Integer> a, int tar){

    HashMap<Integer, Integer> maps= new HashMap<>();
    boolean found = false;
    for(int i=0; i<a.size(); i++){
        int c = tar - a.get(i);
        if (maps.containsKey(c)){
            System.out.println("Indices: " + maps.get(c) + ", " + i);
            found = true;
        }
        maps.put(a.get(i), i);
    }
    if (!found){
        System.out.println("no pairs found");
    }
    
    }

    public static void sortString(String s){
        String[] arr = s.split(",");
        Arrays.sort(arr);
        String newString = String.join(" ", arr );
        System.out.println(newString);
    }

    public static void goodString(String s){
        HashMap<Character, Integer> maps = new HashMap<>();
        for(char c : s.toCharArray()){
            maps.put(c, maps.getOrDefault(c, 0 )+1);
        }

        for(int count : maps.values()){
            if(count>1){
                System.out.println("this is not a good string");
                return;
            }
         }
        System.out.println("this is a good string ");

    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
                
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}



public class Main{
    public static void main(String[] args) {
        //Solutions.reverseString("sandeep");
        //Solutions.reverseTwoNumsWithoutTemp(5,2 );
       //Solutions.countTheNumberOfWords("hi i am sandeep i ");
       //Solutions.checkPrime(99);
       //Solutions.palindromeOrNot("sasasd");
       //Solutions.countNumOfChars("sandeep");
       List<Integer> lists = Arrays.asList(2,3,4,1,35,56,1,8,9);
       int[] nums = {6,4,2,18,5};
       //Solutions.secondhighestMinorMax(lists);
       //Solutions.checkArmstrong(158);
       //Solutions.indexOfNumsToAddUptoTarget(lists, 5);
       //Solutions.sortString("zebra, jack, mango, pets");
       //Solutions.goodString("sandep");
       Solutions.bubbleSort(nums);
        
        }
      
        
    }




