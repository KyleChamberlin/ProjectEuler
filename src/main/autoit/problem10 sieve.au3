;~ Problem 10 from projectEuler.net 
;~ Posted 08 February 2002
;~ Solution by Kyle Chamberlin
;~ Solved 12 July 2012 (originally in JAVA, AutoIt Solution on 1 August 2012)
;~ Problem 10 is stated as :
;~ The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;~											
;~ Find the sum of all the primes below two million.

$answer = 2 ; with 2 being the only even prime, it is an outlier, so I account for it by starting my sum at 2.

$fullLimit = 2000000 ; this is the highest number I need to add to.
$halfLimit = $fullLimit / 2 ; since I am discounting all even numbers I only need an array that is half the length.
dim $primes[$halfLimit] ; declare my array of length halfLimit (1,000,000)
$sqrtlimit = Ceiling(sqrt($fullLimit)) ; calc the square root of our high point, I shouldn't need to check any numbers higher than this.

for $i = 0 To $halfLimit -1 Step 1 ; loop through the declared array.
	$primes[$i] = 1 ; define every element to 1 or "True".
Next ; continue to next element

for $i = 3 to $sqrtlimit Step 2 ; itereate through odd number starting with 3, until you get to the sqrtlimit.
	if($primes[BitShift($i,1)]) Then ; if n = ($i-1)/2 {bitshift right to save space and skip evens) and the nth element of $primes is true (prime) then continue.
		for $j = $i * $i To $fullLimit Step BitShift($i,-1) ; find all the multiples of $i up to the limit, starting at $i^2.
			$primes[BitShift($j,1)] = 0 ; for each multiple, mark that number as composite.
		Next ; continue to next multiple
	EndIf ; end of prime check
Next ; itereate to next odd number.

for $i = 1 to $halfLimit -1 Step 1 ; no we will iterate through the $primes array.
	if $primes[$i] Then	$answer += 2*$i + 1 ; add if said element is true (prime) then add 2i +1 ( to account for the bitshift and removal of even numbers.
Next ; continue to next element

consoleWrite($answer) ; display the answer