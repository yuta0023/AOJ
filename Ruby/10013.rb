# coding: utf-8

while true
  arr = gets.split(" ")
  h = arr[0].to_i
  w = arr[1].to_i

  break if h == 0 && w == 0
  for i in 1..h do
    for n in 1..w do
      if n == 1 || n == w || i == 1 || i == h
        print "#"
      else 
        print "."
      end
    end
    puts ""
  end
  puts ""
end
