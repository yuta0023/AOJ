#coding: utf-8

while true
  sum = 0
  x = gets.split("").map{|item|sum+=item.to_i}
  break if sum == 0
  puts sum
end
