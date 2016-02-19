# coding: utf-8
loop{
  input = gets.split(" ")
  x = input[0].to_i
  y = input[1].to_i
  break if x == 0 && y == 0
  if x > y
    tmp = x
    x = y
    y = tmp
  end
  printf("%d %d\n", x, y)
}
