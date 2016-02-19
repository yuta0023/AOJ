#coding: utf-8

while n = gets 
 a,b = n.split.map(&:to_i)
 ans1 = a.gcd(b)
 ans2 = a.lcm(b)
 puts "#{ans1} #{ans2}"
end
