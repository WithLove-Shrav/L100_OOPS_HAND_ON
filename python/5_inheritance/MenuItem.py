class MenuItem:
    def __init__(self, name: str, price: float):
        self.name = name
        self.price = price
    def display(self):
        print(f"{self.name} - ${self.price}")
class Pastry(MenuItem):  # Single
    def __init__(self, name: str, price: float, type_: str):
        super().__init__(name, price)
        self.type = type_
    def display(self):
        super().display()
        print(f"Type: {self.type}")
class Croissant(Pastry):  # Multilevel
    def __init__(self, name: str, price: float, butter_layers: int):
        super().__init__(name, price, "Flaky")
        self.butter_layers = butter_layers
    def display(self):
        super().display()
        print(f"Butter layers: {self.butter_layers}")
class Drink(MenuItem):  # Hierarchical
    def __init__(self, name: str, price: float, hot: bool):
        super().__init__(name, price)
        self.hot = hot
    def display(self):
        super().display()
        print(f"Served {'hot' if self.hot else 'cold'}")
#class Combo(Pastry, Drink):  # Multiple!
#    def __init__(self, name: str, price: float):
#        Pastry.__init__(self, name, price, "Combo")
#        Drink.__init__(self, name, price, False)  # Resolve manually if conflict
# Demo
menu = [
    Croissant("Butter Croissant", 4.5, 27),
    Drink("Latte", 5.0, True),
    #Combo("Pastry + Coffee", 8.0)
]
for item in menu:
    item.display()
    print("---")