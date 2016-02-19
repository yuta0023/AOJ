# coding: utf-8

input = gets.split(" ")
#p 
a = input[0].to_i
b = input[1].to_i

area = a * b
length = 2*(a+b)
printf("%d %d\n", area, length)
