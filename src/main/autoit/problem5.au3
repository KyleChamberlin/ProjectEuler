;~ Problem 5 from projectEuler.net 
;~ Posted 30 November 2001
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012
;~ Problem 5 is stated as :
;~ 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;~
;~ What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

$answer = 0 ; start answer out at nothing

$i = 2520 ; start checking with 2520 since we know it is the lowest number that is divisable by 1-10 as per the statement of the problem.
while($answer=0) ; Loop until we set answer equal to $i.
	$i += 2520 ; increment our variable on each iteration of the loop. we will just check multiples of 2520.
	for $j = 19 To 11 Step -1 ; Loop from 19 - 11 to check the modulus of each number. We don't need to check 1-10, because we are starting with a multiple of 1-10. 20 is disivable by 4 & 5 so no need to check that one either.
		if(Mod($i,$j) <> 0) Then ExitLoop ; check for even divisiblity, if it is not evenly divisable, exit the for loop.
		if($j = 11) Then $answer = $i ; If the for loop hasn't exited, and $j is equal to 11, this is our answer.
	Next ; increment $j and continue through the foor loop again.
WEnd ; end of while loop.

consoleWrite($answer) ; display the answer