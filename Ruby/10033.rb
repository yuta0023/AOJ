#coding: utf-8
b=Hash.new{|b,n| b[n] = []}
gets
loop{
  cmd,p,c = gets.chomp.split
  case cmd
    when "push"
      b[p].push c
    when "pop"
      puts b[p].pop
    when "move"
      b[c].push b[p].pop
    when "quit"
      exit
  end
}
