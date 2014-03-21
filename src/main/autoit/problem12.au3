;~ Problem 12 from projectEuler.net 
;~ Posted 08 March 2002
;~ Solution by Kyle Chamberlin
;~ Solved 13 July 2012 (originally in JAVA, AutoIt Solution on 3 August 2012)
;~ Problem 12 is stated as :
;~ The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
;~								
;~ 								1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
;~  
;~ Let us list the factors of the first seven triangle numbers:
;~  
;~ 		 						 1: 1
;~ 								 3: 1,3
;~ 								 6: 1,2,3,6
;~ 								10: 1,2,5,10
;~ 								15: 1,3,5,15
;~ 								21: 1,3,7,21
;~ 								28: 1,2,4,7,14,28
;~  
;~ We can see that 28 is the first triangle number to have over five divisors.
;~   
;~ What is the value of the first triangle number to have over five hundred divisors?

$answer = 1 ; start answer at 1.
$n = 3
$Dn = 1
$count = 0
$primes = SievePrimes(100) 

while ( $count <= 500 )
	$n = $n + 1
	$n1 = $n
	if ( Mod($n1,2) = 0 ) Then 
		$n1 = $n1 / 2
	EndIf
	$Dn1 = 1
	for $i = 0 to UBound($primes) - 1 Step 1
		if ( $primes[$i] * $primes[$i] > $n1 ) Then 
			$Dn1 = $Dn1 *2
			ExitLoop
		EndIf
		$exp = 1
		while ( Mod($n1,$primes[$i]) = 0 )
			$exp += 1
			$n1 = $n1/$primes[$i]
		WEnd
		$Dn1 = $Dn1 * $exp
		if ( $n1 = 1 ) Then 
			ExitLoop
		EndIf
	Next
	$count = $Dn * $Dn1
	$Dn = $Dn1
WEnd

$answer = ( $n * ( $n - 1 ) ) / 2

consoleWrite($answer) ; display the answer

Func SievePrimes($limit)
	$halfLimit = $limit / 2 ; since I am discounting all even numbers I only need an array that is half the length.
	dim $primesBits[$halfLimit] ; declare my array of length halfLimit (1,000,000)
	$sqrtlimit = Ceiling(sqrt($limit)) ; calc the square root of our high point, I shouldn't need to check any numbers higher than this.
	$numofPrimes = 1
	for $i = 0 To $halfLimit -1 Step 1 ; loop through the declared array.
		$primesBits[$i] = 1 ; define every element to 1 or "True".
	Next ; continue to next element

	for $i = 3 to $sqrtlimit Step 2 ; itereate through odd number starting with 3, until you get to the sqrtlimit.
		if($primesBits[BitShift($i,1)]) Then ; if n = ($i-1)/2 {bitshift right to save space and skip evens) and the nth element of $primes is true (prime) then continue.
			for $j = $i * $i To $limit Step BitShift($i,-1) ; find all the multiples of $i up to the limit, starting at $i^2.
				$primesBits[BitShift($j,1)] = 0 ; for each multiple, mark that number as composite.
			Next ; continue to next multiple
		EndIf ; end of prime check
	Next ; itereate to next odd number.
	For $i in $primesBits
		if ($i) then $numofPrimes +=1
	Next
	
	dim $ret[$numofPrimes+1]
	$ret[0] = 2
	$cnt = 1
	for $i = 1 to $halfLimit -1 Step 1 ; now we will iterate through the $primes array.
		if $primesBits[$i] Then	; add if said element is true (prime) then add 2i +1 ( to account for the bitshift and removal of even numbers.
			$ret[$cnt] = 2*$i + 1 
			$cnt +=1
		EndIf
	Next ; continue to next element
	return $ret
EndFunc