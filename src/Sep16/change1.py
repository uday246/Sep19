amount=int(input("Enter the change amount as integer: "))
dolloar=amount//100
amount=amount % 100
quarters=amount//25
amount=amount % 25
dimes=amount//10
amount=amount % 10
nickels = amount//5
amount=amount % 5

if(dolloar!=0 and dolloar==1):
    print(dolloar," dolloar")
elif(dolloar!=0):
    print(dolloar," dolloars")

if(quarters!=0 and quarters==1):
    print(quarters," quarter")
elif(quarters!=0):
    print(quarters," quarters")

if(dimes!=0 and dimes==1):
    print(dimes," dime")
elif(dimes!=0):
    print(dimes," dimes")

if(nickels!=0 and nickels==1):
    print(nickels," nickel")
elif(nickels!=0):
    print(nickels," nickels")

if(amount!=0 and amount==1):
    print(amount," pennie")
elif(amount!=0):
    print(amount," pennies")

    
    
