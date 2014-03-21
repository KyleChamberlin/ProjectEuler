require 'csv'

triNums = triangleNumbers
answer = 0
words = CSV.parse( open( "data/Problem42.words.txt " ), headers: false )

words[0].each do |word|
	if triNums.include?stringSum(word) then
		answer += 1
	end
end

puts answer




def triangleNumbers
	array = Array.new
	(1...200).each do |n|
		array << (n*(n-1)*0.5).to_i
	end
	return array
end

def stringSum(pString)
	sum = 0
	pString.chars.each do |char|
		sum += char.ord - 64
	end
	return sum
end

