class PastryItem:
    def __init__(self, name: str, price: float, initial_stock: int, secret_ingredients: list[str]):
        self.name = name
        self.price = price
        self._stock_level = initial_stock          # Protected (convention)
        self.__secret_ingredients = secret_ingredients  # Private (name mangling)

    def get_stock_level(self) -> int:
        return self._stock_level

    def add_stock(self, quantity: int) -> None:
        if quantity > 0:
            self._stock_level += quantity
            print(f"Added {quantity} to stock.")
        else:
            print("Invalid quantity!")

    def order(self, quantity: int) -> bool:
        if quantity > 0 and quantity <= self._stock_level:
            self._stock_level -= quantity
            print(f"Ordered {quantity} {self.name}(s). Remaining: {self._stock_level}")
            return True
        else:
            print("Not enough stock!")
            return False

# Demo
croissant = PastryItem("Croissant", 4.5, 20, ["butter", "secret"])
print("Stock:", croissant.get_stock_level())
croissant.order(5)
croissant.add_stock(10)
# Can't easily mess with croissant.__secret_ingredients