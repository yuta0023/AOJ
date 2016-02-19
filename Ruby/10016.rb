# coding: utf-8

while true
  score = gets.split(" ")
  m = score[0].to_i
  f = score[1].to_i
  r = score[2].to_i

  sum = m + f

  if m == -1 && f == -1 && r == -1
    break
  elsif m == -1 || f == -1
    puts "F"
  elsif  sum >= 80
    puts "A"
  elsif sum  >=  65
    puts "B"
  elsif  sum >= 50 || (sum >= 30 && r >= 50)
    puts "C"
  elsif  sum >= 30
    puts "D"
  else 
    puts "F"
  end
end
