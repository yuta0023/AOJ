#codng: utf-8

while n = gets
  a,b = n.split.map(&:to_i)
  puts (a+b).to_s.length
end
