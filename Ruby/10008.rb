# coding: utf-8

input = gets.split(" ")
x = input[0].to_i
y = input[1].to_i

d = x / y
r = x % y
f = x / y.to_f

printf("%d %d %f\n",d, r, f)
