#coding: utf-8

str = ""
while(input = gets)!=nil
  str += input.downcase
end
("a".."z").each do |c|
  puts "#{c} : #{str.count(c)}"
end
