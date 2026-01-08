from Pastry import Pastry
from Customer import Customer

if __name__ == "__main__":
    # Create instances of Pastry
    croissant = Pastry("Croissant", 4.50, ["flour", "butter", "secret"])
    muffin = Pastry("Blueberry Muffin", 3.75, ["blueberries", "sugar"])

    # Create an instance of Customer
    alice = Customer("Alice")

    # Demonstrate interactions
    croissant.display_info()
    alice.order_pastry(croissant)

    # You can access public attributes directly
    print(f"\nAlice's name is publicly accessible: {alice.customer_name}")
    # The "private" price can still be accessed, but convention suggests not to
    print(f"The 'private' price of the muffin is: {muffin.price}") 