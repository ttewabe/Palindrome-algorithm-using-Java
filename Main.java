class Main {
        
  public static void main(String[] args) {
  
      String str = "Racecar", reverseStr = "";

    for (int i = (str.length() - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);//The charAt() method accesses each character of the string
    }
      
//The toLowerCase() method converts both str and reverseStr to lowercase
    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
      

// For Numerical values 
      
    int num = 1221, reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}