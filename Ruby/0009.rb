#coding: utf-8
require "prime"
while n = gets
  a = n.to_i
  cnt = 0
  Prime.each(a) do
    cnt += 1
  end
  puts cnt
end
