def print_rectangle(r,c,sh,fil):
    for  i in range(0,r):
        for j in range(0,c):
            if(not fil):
                print(sh,end="")
            else:
                if i==0 or  i==r-1 or j==0 or j==c-1:
                    print(sh,end="")    
                else:
                    print(" ",end="")
        print()    

def make_rectangle():
    row=int(input("Enter rows: "))
    col=int(input("Enter cols: "))
    sym=(input("Enter symbol: "))
    fill=input("Hollow triangle or fill triangle, True or False: ")
    print_rectangle(row,col,sym,fill=="True")

make_rectangle();