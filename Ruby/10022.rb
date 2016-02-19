#coding: utf-8

key = gets.chomp.downcase
#puts key
words = []
hit = 0
while (words = gets.chomp) != "END_OF_TEXT"
  words.downcase.split(" ").map do |item|
    hit += 1 if item == key
  end
end
puts hit
