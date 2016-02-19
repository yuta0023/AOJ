#coding: utf-8
block = []
while true
  cmd,op = gets.chomp.split
  case cmd
    when "push"
      block.push op
    when "pop"
      puts block.pop
    when "quit"
      break
  end
end
