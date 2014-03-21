;~ Problem 3 from projectEuler.net 
;~ Posted 02 November 2001
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012
;~ Problem 3 is stated as :
;~ The prime factors of 13195 are 5, 7, 13 and 29.
;~
;~ What is the largest prime factor of the number 600851475143 ?
;~
;~ Method:
;~ 

$answer = 0 ; start answer out at zero
$numberToCheck = 600851475143 ; the number stated in the question to be checked, this number can be replaced by any number and this will work.

$temp = $numberToCheck ; good practice, I don't want to modify the numberToCheck, so I store the value in the variable $temp so that I can modify it.

$factor = 2 ; 
while $factor < sqrt($temp) ; check that the $factor is not larger than the square root of the current value of temp.
	while Mod($temp, $factor) = 0 ; while the current value of $temp is evenly divisable by the current factor do the following
		$temp = $temp/$factor ; divide the value of $temp by the value of $factor until it is no longer divisable by $factor
		$answer = $factor ; store $factor in $answer because it is currently the highest prime number that is an even factor of the original number.
	WEnd ; continue until the condition above "while( **condition** )" is met, in this case until $temp is no longer divisable by $factor evenly (i.e. $temp Mod $factor no longer is equal to 0)
	$factor += 1 ; increment the $factor by 1.		
WEnd ; continue until the condition above "while( **condition** )" is met, in this case until the next $factor to check is greater than the square root of $temp

if ($temp > $answer ) then ; the last step is to verify that the current value of answer is the highest prime number found, if $temp is larger that answer than $temp must also be prime, and therefore the highest prime.
	$answer = $temp ; Set $answer to the last value of $temp
EndIf

MsgBox(0,"Answer","the answer is " & $answer) ; display the answer