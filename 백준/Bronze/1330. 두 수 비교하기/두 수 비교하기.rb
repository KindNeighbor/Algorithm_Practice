input = gets.chomp

a, b = input.split.map(&:to_i)

if a > b
  puts '>'
elsif a < b
  puts '<'
else
  puts '=='
end