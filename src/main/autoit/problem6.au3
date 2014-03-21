;~ Problem 6 from projectEuler.net 
;~ Posted 14 December 2001
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012
;~ Problem 6 is stated as :
;~ The sum of the squares of the first ten natural numbers is,
;~											1^2 + 2^2 + ... + 10^2 = 385
;~ The square of the sum of the first ten natural numbers is,
;~											(1 + 2 + ... + 10)^2 = 55^2 = 3025
;~ Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
;~											
;~ Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


$answer = 0 ; start answer out at nothing
$sqSum = 0 ; Holding variable for the Squared Sum
$sumSq = 0 ; Holding variable for the Sum of squares

for $i = 1 To 100 Step 1 ; Loop from 1 - 100
		$sqSum += $i ; add together 1 - 100 before squaring.
		$sumSq += $i*$i ; square $i then add to the sum of squares.
Next ; increment $i and continue through the for loop again.

$sqSum = $sqSum * $sqSum ; square the sum of 1-100 (5050)^2

$answer = $sqSum - $sumSq ; find the difference.

consoleWrite($answer) ; display the answer