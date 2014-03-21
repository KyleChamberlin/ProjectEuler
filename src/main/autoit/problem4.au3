;~ Problem 4 from projectEuler.net 
;~ Posted 16 November 2001
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012
;~ Problem 4 is stated as :
;~ A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 X 99.
;~
;~ Find the largest palindrome made from the product of two 3-digit numbers.

#include <String.au3> ; include the String library so that I can use the _StringReverse Function to check if a number is palindromic.

$answer = 0 ; start answer out at nothing

for $i = 999 To 100 Step -1 ; Loop from 100 - 999 to cover the first multipland for all three digit possibilities.
	for $j = 999 To $i Step -1 ; Loop from 100 - 999 to cover the second multipland for all three digit possibilities.
		$product = $i * $j ; multiply the first number by the second.
		if($product > $answer) then ; if the current product is larger than the highest palindrome found so far check to see if it is palindromic, otherwise move to the next number.
			$forward = "" & $product ; convert the product to a string.
			$backward = _StringReverse($forward) ; store the reverse of the string as backward
			if($forward = $backward) then ; If forward and backward are the same, the product is a Palindrome. 
				$answer = $product ; store answer as product
			EndIf ; end of Palindrome check if statement
		EndIf ; end of size check
	Next ; increment the second multipland by the step of 1
Next ; increment the first multipland by the step of 1

MsgBox(0,"Answer","the answer is " & $answer) ; display the answer