#coding: utf-8

x1,y1,x2,y2 = gets.split.map(&:to_f)
puts Math::sqrt(((x2 - x1) ** 2) + ((y2 -y1) ** 2))

