# frozen_string_literal: true

print "Digite a quantidade de bolos por ovo: "
ovosBolo = gets.to_i
print "Digite a quantidade de ovos que você tem: "
qtdOvos = gets.to_i

qtdBolos = qtdOvos / ovosBolo

puts("Com #{qtdOvos} ovos é possível fazer #{qtdBolos} bolos")