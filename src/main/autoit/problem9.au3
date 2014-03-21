;~ Problem 9 from projectEuler.net 
;~ Posted 25 January 2002
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012
;~ Problem 9 is stated as :
;~ A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
;~ 								a^2 + b^2 = c^2
;~ For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

;~ There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;~ Find the product abc.

$answer = 0 ; start answer out at nothing

for $a = 1 To 1000 Step 1 ; Loop from 1 - 1000 so that we catch every substring.
	for $b = $a + 1 To (1000 - $a) Step 1 ; because b > a , as stated in the problem, I start $b at a +1, and continue until a+b =1000 which is too high, but should product much overhead
		$c = Sqrt($a*$a + $b*$b) ; set $c such that a^2 + b^2 = c^2 | c = sqrt(a^2 + b^2)
		if ( Mod($c,1) = 0 ) then ; check that $c is an integer
			if ( ($a + $b + $c) = 1000 ) then ; check that $c satisfies a + b + c = 1000
				$answer = $a*$b*$c ; this triple satisfies the answer.
				ExitLoop ; we have found the answer, so exit the loop
			EndIf ; end of a+b+c=1000 check
		EndIf ; end of integer check
	Next ; increment $b and continue through loop again.
	if $answer > 0 then ExitLoop ; if we have found the answer end the loop.
Next ; increment $a and continue through the for loop again.

consoleWrite($answer) ; display the answer
