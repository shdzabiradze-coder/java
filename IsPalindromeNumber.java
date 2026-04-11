void main() {
    isPalindrome(1221);
}
 int reverceInteger(int n){
    int sum = 0;
    while(n>0){
        sum =sum*10;
        sum = sum + n%10;
        n=n/10;

    }
    return sum;
}
void isPalindrome(int x){
    if (x==reverceInteger(x)){
        System.out.println(true);
    }else {
        System.out.println(false);
    }

}