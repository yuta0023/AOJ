# coding: utf-8

while true
  arr = gets.split(" ")
  h = arr[0].to_i
  w = arr[1].to_i

  break if h == 0 && w == 0
  for i in 1..h do
    for n in 1..w do
      if n % 2 != 0 && i % 2 != 0 || i % 2 == 0 && n % 2 == 0
        print "#"
      else 
        print "."
      end
    end
    puts ""
  end
  puts ""
end
