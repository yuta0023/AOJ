#coding: utf-8

while(n = gets.to_i) != 0
  dev = gets.split.map(&:to_i)
  ave = dev.reduce(0.0){|sum,i| sum += i}/n
  puts (dev.reduce(0.0){|sum,i| sum += (i - ave)**2}/n)**0.5
end
