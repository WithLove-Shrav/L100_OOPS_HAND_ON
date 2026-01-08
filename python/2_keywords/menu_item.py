# menu_item.py
from abc import ABC, abstractmethod

class MenuItem(ABC):
    BASE_PRICE = 2.0  # convention for constant

    def __init__(self, name: str):
        self.name = name  # 'self' like 'this'

    @abstractmethod
    def get_price(self) -> float:
        pass

    def display(self):
        print(f"{self.name} - ${self.get_price()}")

class Pastry(MenuItem):
    def __init__(self, name: str, type_: str):
        super().__init__(name)  # super ctor/method
        self.type = type_

    def get_price(self) -> float:
        return MenuItem.BASE_PRICE + 2.5

class Cafe:
    total_items_sold = 0  # class variable (static-like)

    @classmethod
    def sell(cls, item: MenuItem):
        item.display()
        cls.total_items_sold += 1

# Demo - no 'new', just call
croissant = Pastry("Croissant", "Butter")
Cafe.sell(croissant)
print("Total sold:", Cafe.total_items_sold)