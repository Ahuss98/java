package io.nology.j2_methods;

public class Challenge {

    public Challenge() {
    }

    /**
     * A method to find the smallest number among three given integers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the smallest of the three numbers
     */
    public int findSmallestNumber(int num1, int num2, int num3) {
        return Math.min(num1 , Math.min(num2,num3));
    }

    /**
     * A method to check whether a string is a valid password
     * 
     * The password must:
     * have at least ten characters
     * consist of only letters and digits
     * contain at least two digits
     *
     * @param password the password string to be validated
     * @return true if the password is valid, otherwise false
     */
    public boolean isValidPassword(String password) {
        if(password.length() < 10){
            return false;
        }
        int digiCounter = 0;
        for( int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                digiCounter ++;
            } else if(!Character.isLetter(password.charAt(i))){
                return false;
            }
        }
        return digiCounter >= 2 ;
    }
}
