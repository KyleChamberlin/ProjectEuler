;~ Problem 7 from projectEuler.net 
;~ Posted 28 December 2001
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012
;~ Problem 7 is stated as :
;~ By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
;~											
;~ What is the 10,001st prime number?

$answer = 0 ; start answer out at nothing
$primes = ObjCreate("Scripting.Dictionary") ; create a dictionary to hold primes.
$primes.item(0)=2 ; add the first prime to my primes dictionary.
$currentPrime = 3 ; start at the next prime.


for $i = 1 To 9999 Step 1 ; Loop from 1 - 9999 because we are starting with the second prime and the index of $primes starts at 0.
	$primes.item($i) = $currentPrime ; add the current prime to the dictionary
	Do ; using a do ... until loop so my prime incrementing only happens in the loop.
		$currentPrime += 2 ; increment the $currentPrime by 2 because primes can't be even.
	Until (isPrime($currentPrime)) ; check if the $currentPrime is prime, if it isn't, do the loop again, if it is prime continue on after the loop.
Next ; increment $i and continue through the for loop again.

$answer = $currentPrime ; the last prime found is the 10,001st prime.

consoleWrite($answer) ; display the answer

Func isPrime($n) ; isPrime Function returns 1 (true) if $n is prime, and 0 (false) if $n is composite.
	$check = 1 ; begin by assuming the number is prime.
	$sqrt = Ceiling(Sqrt($n)) ; find the square root of the number (and round to the next integer)
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
			
	