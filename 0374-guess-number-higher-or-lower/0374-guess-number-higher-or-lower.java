/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start= 1, end= n, middle= start + (end-start)/2, number=0;
        while(start <= end){
            if(guess(middle)==0){
                return number=middle;
            }else if(guess(middle)==-1){
                number=middle;
                end=middle-1;
                middle=start + (end-start)/2;
            }else{
                start=middle+1;
                middle=start + (end-start)/2;
            }
        }
        return -1;
    }
}