# coding: utf-8
  i = 0
  num = gets.to_i
  arr = gets.split(" ")
  #p arr
  arr.reverse!
  while i < num
    print arr[i]
    print " " if i < num-1
    puts "" if i == num-1    
    i = i+1
  end
