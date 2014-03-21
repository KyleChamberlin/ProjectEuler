;~ Problem 10 from projectEuler.net 
;~ Posted 08 February 2002
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012 (originally in JAVA, AutoIt Solution on 1 August 2012)
;~ Problem 10 is stated as :
;~ The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;~											
;~ Find the sum of all the primes below two million.


$primes = ObjCreate("Scripting.Dictionary") ; create a dictionary to hold primes.
$primes.item(0)=2 ; add the first prime to my primes dictionary.
$currentPrime = 3 ; start at the next prime.
$answer = 2 ; start answer at 2 to accout for the fact tath currentPrime starts at 3.


$i = 1
while ($currentPrime < 2000000) ; continue while current Prime is less than 2,000,000
	$primes.item($i) = $currentPrime ; add the current prime to the dictionary
	$answer += $currentPrime ; add the current prime to the sum 
	Do ; using a do ... until loop so my prime incrementing only happens in the loop.
		$currentPrime += 2 ; increment the $currentPrime by 2 because primes can't be even.
	Until (isPrime($currentPrime)) ; check if the $currentPrime is prime, if it isn't, do the loop again, if it is prime continue on after the loop.
	$i += 1 ; increment $i
WEnd ; end the while.

consoleWrite($answer) ; display the answer

Func isPrime($n) ; isPrime Function returns 1 (true) if $n is prime, and 0 (false) if $n is composite.
	$check = 1 ; begin by assuming the number is prime.
	$sqrt = Ceiling(Sqrt($n)); find the square root of the number (and round to the next integer)
	for $i in $primes ; loop through all the primes found thus far.
		$p = $primes.item($i) ; $p is the current prime to check.
		if $p > $sqrt then ExitLoop ; if prime is more than the sqrt of $n then $n must be prime, because no prime has a prime factor greater than it's sqrt.
		if (Mod($n,$primes.item($i)) = 0 ) then ; if $n is evenly divisable by any primes found thus far, $n is composite.
			$check = 0 ; since $n is composite, change the return value to 0
			ExitLoop ; There is no reason to continue checking if $n is composite, so exit the loop
		EndIf ; end of composite check if
	Next ; continue to the next prime in $primes.
	return $check ; return the value of check
EndFunc ; end of isPrime function
			
	