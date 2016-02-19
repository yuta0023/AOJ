#coding: utf-8

n = gets.to_i
taro = 0
hanako = 0
n.times do
  a,b = gets.chomp.split(" ")
  case 
  when a > b
    taro += 3
  when a < b
    hanako +=3
  when a == b
    taro += 1
    hanako += 1
  end
end
puts "#{taro} #{hanako}"
  
