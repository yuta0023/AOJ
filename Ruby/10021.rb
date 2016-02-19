#coding: utf-8

n = gets.to_i
words = []
n.times{words << gets.chomp}
words.sort!
puts words[0]
