#coding: utf-8
cord = []
'SHCD'.split('').each do |mark|
  1.upto(13) do |nm|
    cord << "#{mark} #{nm}"
  end
end
gets.to_i.times do
  cord.delete(gets.chomp)
end
puts cord