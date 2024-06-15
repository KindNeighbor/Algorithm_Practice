n = gets.to_i

numbers = gets.split.map(&:to_i)

min_value = numbers.min
max_value = numbers.max

puts "#{min_value} #{max_value}"