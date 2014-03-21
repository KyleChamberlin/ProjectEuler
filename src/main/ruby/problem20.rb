product = 1

(1...100).each do |number|
	product *= number
end

sum = 0

product.to_s.chars.map(&:to_i).each do |digit|
	sum += digit
end

puts sum