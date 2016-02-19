#coding: utf-8
words = []
while (words = gets.chomp) != "-"
  gets.to_i.times do |i|
    words += words.slice!(0,gets.to_i)
  end
  puts words
end  
