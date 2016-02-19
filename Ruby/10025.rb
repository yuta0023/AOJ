#coding: utf-8
include Math
a,b,C = gets.split.map(&:to_f)
rad = C*Math::PI/180
c = Math.sqrt(a**2+b**2-2*a*b*Math.cos(rad))
S = (a*b*Math.sin(rad))*0.5
L = a+b+c
h = b*Math.sin(rad)
puts S
puts L
puts h
 
