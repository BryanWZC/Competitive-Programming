# MultipleOfThree

- If input itself is divisible by three, return input as it is. 
  - Considered as adding a "0" in front.
- Create an array of size greater than the input string by 1.
  - This array will hold all our string numbers
- Copy the input string array into the new array that has a greater length. Offset it by 1.
- Loop through the entire array(new one).
- Since we want to find the minimum, we have to make sure that the current digit is less than the next digit. This will be the condition for the while loop.
```java
Integer.parseInt(arrN[j]) < Integer.parseInt(arrN[j + 1])
```
- Another condition would be if the digit is at the last index. As by then, there will be no next number and the digit will be free to take on any number from 0-9.
```java
j == arrN.length - 1
```
- Check the `arrN` to see if the numbers when put together are divisible by 3.
  - It calls upon `checkDivisibleByThree` and for each digit, it multiplies it by 10, adds it to the next and after, gets the remainder from dividing by 3. This it to simulate division of long numbers, by going digit by digit.
- If divisible by 3, it prints the array as joined string.
- Else, it adds one to the current digit and compares the entire number again.
- When the digit is equal or greater than the next digit, it will swap places with the next digit and reset at "0". 
  - This is to show the digit moving a position right and trying combinations from 0 to the next digit to see if it is divisible by 3.