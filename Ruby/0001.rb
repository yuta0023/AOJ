#coding: utf-8
mt = []
10.times do |i|
  mt[i]=gets.chomp.to_i
end
mt.sort!
3.times do |i|
  puts mt[9-i]
end
