import math

def quadratic_roots(a, b, c):
    if a == 0:
        return "Error: 'a' must not be zero."

    discriminant = b**2 - 4*a*c

    if discriminant > 0:
        x1 = (-b + math.sqrt(discriminant)) / (2 * a)
        x2 = (-b - math.sqrt(discriminant)) / (2 * a)
        return f"Two real roots: x1 = {x1}, x2 = {x2}"

    elif discriminant == 0:
        x = -b / (2 * a)
        return f"One real root: x = {x}"

    else:
        return "No real roots exist."

if __name__ == "__main__":
    a = float(input("Enter coefficient a: "))
    b = float(input("Enter coefficient b: "))
    c = float(input("Enter coefficient c: "))

    result = quadratic_roots(a, b, c)
    print(result)