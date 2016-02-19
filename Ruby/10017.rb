# coding: utf-8

while true
  data = gets.split(" ")
  n = data[0].to_i
  x = data[1].to_i
  break if n == 0 && x == 0
  cnt = 0
  for i in 1..n
    for j in i+1..n
      for k in j+1..n
        cnt += 1 if i+j+k == x
      end
    end
  end
    puts cnt
end
