void main() {
isPalindrome("ara");
}

public Object stringReverser(String word){


    String reversedString = new StringBuilder(word).reverse().toString();
    System.out.println(reversedString);
    return reversedString;
}
void isPalindrome(String palindromeWord){

    if(palindromeWord.equals(stringReverser(palindromeWord))){

        System.out.println("true");

    }else {
        System.out.println("false");
    }

}