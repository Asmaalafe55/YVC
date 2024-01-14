def mas():
    x = float(input("What is your salary: "))
    tax = 0

    if 0 < x <= 4000:
        tax = 0
    elif 4000 < x <= 6000:
        tax = (x - 4000) * 0.1
    else:
        tax = 200 + (x - 6000) * 0.2

    print("This is your tax:", tax)

mas()
