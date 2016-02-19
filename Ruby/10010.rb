# coding: utf-8
while true
  input = gets.split(" ")
  #p 
  a = input[0].to_i
  op = input[1]
  b = input[2].to_i

  case op
  when "?"
    break
  when "+"
    puts a + b
  when "-"
    puts a - b
  when "*"
    puts a * b
  when "/"
    puts a / b
  end
end