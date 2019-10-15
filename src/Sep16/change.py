hundreds=0
fifties=0
twenties=0
tens=0
fives=0
ones=0
quarters=0
nickels=0
dimes=0 
pennies=0
amount=float(input("Enter amount to calculate: "))
if(amount>=100):
  hundreds=int(amount/100)
  amount=amount%100
if(amount>=50):
  fifties=int(amount/50)
  amount=amount%50
if(amount>=20):
  twenties=int(amount/20)
  amount=amount%20
if(amount>=10):
  tens=int(amount/10)
  amount=amount%10
if(amount>=5):
  fives=int(amount/5)
  amount=amount%5
if(amount>=1):
  once=int(amount)
  amount=amount-once
if(amount>=.25):
  quarters=int(amount/0.25)
  amount=amount-quarters*0.25

if(amount>=.10):
  dimes=int(amount/0.10)
  amount=amount-dimes*0.10
if(amount>=0.05):
  nickles=int(amount/0.05)
  amount=amount-nickles*0.05
if(amount>0.01):
  pennies=int(amount/0.01)

if(hundreds!=0):
  print("Hundreds : ",hundreds)
if(fifties!=0):
  print("fifties : ",fifties)
if(twenties!=0):
  print("twenties : ",twenties)
if(tens!=0):
  print("tens : ",tens)

if(fives!=0):
  print("fives : ",fives)

if(once!=0):
  print("once : ",once)

if(quarters!=0):
  print("quarters : ",quarters)

if(dimes!=0):
  print("dimes : ",dimes)

if(nickels!=0):
  print("nickles : ",nickels)


if(pennies!=0):
  print("pennies : ",pennies)

