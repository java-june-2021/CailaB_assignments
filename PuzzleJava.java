import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args){
        //tests
        // int[] array1 = {3,5,1,2,7,9,8,13,25,32};
        // Object[] returnVal = returnSum(array1);
        // System.out.println(Arrays.toString(returnVal));
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // System.out.println(Arrays.toString(nameArray(names)));
        // nameArray(names);
        // alphabet(); //3 
        // Random a = new Random();
        // System.out.println(a.nextInt(45) + 55);
        // System.out.println(Arrays.toString(randomNumbers()));
        // randomNumbersSort();
        random5();
        System.out.println(Arrays.toString(randomStrings10()));

    }
    // //1 create an array with values = 3,5,1,2,7,9,8,13,25,32. print sum of numbers in array
    // // return an array that includes numbers greater than 10 = 13, 25, 32
    // public static Object[] returnSum(int[] arr){
    //     ArrayList<Integer> sumArr = new ArrayList<Integer>();
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++){
    //         sum += arr[i];
    //         if (arr[i] > 10) {
    //             sumArr.add(arr[i]);
    //         }
    //     }
    //     System.out.println(sum);
    //     return sumArr.toArray();
    // }
    //2 create an array = [Nancy, Ninichi, Fujibayashi, Momochi, Ishikawa]. Shuffle array and print name of each person. Return an array with names > 5 char.
    // public static Object[] nameArray(String[] arr){
    //     ArrayList<String> newArray = new ArrayList<String>();
    //     List<String> listNames = new ArrayList<String>();
    //     for (int j = 0; j < arr.length; j++){
    //         listNames.add(arr[j]);
    //     }
    //     Collections.shuffle(listNames);
    //     for (int k = 0; k < listNames.size(); k++){
    //         System.out.println(listNames.get(k));
    //         if (listNames.get(k).length() > 5){
    //             newArray.add(listNames.get(k));
    //         }
    //     }
    //     return newArray.toArray();
    // }
        
    // //3 create an array that contains the alphabet. shuttle and display last letter and first letter from the array. if first letter is a vowel, display a message
    // public static void alphabet(){
    //     ArrayList<Character> alphabet = new ArrayList<Character>();
    //     for (char cha = 'a'; cha <= 'z'; ++cha){
    //         alphabet.add(cha);
    //     }
    //     // System.out.println(alphabet);
    //     Collections.shuffle(alphabet);
    //     System.out.println(alphabet);
    //     System.out.println(alphabet.get(alphabet.size()-1));
    //     System.out.println(alphabet.get(0));
    //     if (alphabet.get(0) =='a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u'){
    //         System.out.println("And sometimes Y");
    //     }

    // }
    //4 Generate and return an array with 10 random numbers between 55 and 100.

    // public static int[] randomNumbers() {
    //     int[] randomArr = new int[10];
    //     Random a = new Random();
    //     for (int i = 0; i < randomArr.length; i++){
    //         randomArr[i] = a.nextInt(45) + 55;
    //     }
    //     return randomArr;
    // }
        // System.out.println(RandomNumbersArray.get(RandomNum));
    // 5 Generate and return array with 10 random numbers 55-100 sorted sm to lg. 
    // display min and max in array
    // public static Object[] randomNumbersSort(){
    //     int[] randomArr = randomNumbers();
    //     List<Integer> sortList = new ArrayList<Integer>();
    //     for (int i = 0; i < randomArr.length; i++){
    //         sortList.add(randomArr[i]);
    //     }
    //     Collections.sort(sortList);
    //     System.out.println(sortList);
    //     int max = sortList.get(0);
    //     for (int i = 1; i < sortList.size(); i++){
    //         if (sortList.get(i) > max){
    //             max = sortList.get(i);
    //         }
    //     }
    //     System.out.println("max: " + max);
    //     int min = sortList.get(0);
    //     for(int j = 0; j < sortList.size(); j++){
    //         if  (sortList.get(j) < min){
    //             min = sortList.get(j);
    //         }
    //     }
    //     System.out.println("min: " + min);

    //     return sortList.toArray();
    // }
    //6 create a random string that is 5 char long
    public static String random5(){
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String randomString = "";
        int length = 5;
        Random rand5 = new Random();
        
        char[] random5 = new char[length];
        for(int i = 0; i < length; i++){
            random5[i] = characters.charAt(rand5.nextInt(characters.length()));
        }
        for (int j = 0; j < random5.length; j++){
            randomString += random5[j];
        }
        return randomString;
    }
    //7 generate an array with 10 random strings that have 5 char.
    public static String[] randomStrings10(){
        String[] randomStrings10 = new String[10];
        for(int i = 0; i < 10; i++){
            randomStrings10[i] = random5();
        }
        return randomStrings10;
    }
}


