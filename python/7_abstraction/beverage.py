from abc import ABC, abstractmethod

class Beverage(ABC):
    def __init__(self, name: str):
        self.name = name

    @abstractmethod
    def prepare(self):
        pass

    def serve(self):
        print(f"Serving {self.name} in a cozy cup ☕")

class Coffee(Beverage):
    def prepare(self):
        print("Grinding beans...")
        print("Pulling espresso...")
        print("Steaming milk & art ❤️")

class Tea(Beverage):
    def prepare(self):
        print("Heating water...")
        print("Steeping...")
        print("Adding honey")

# Demo
latte = Coffee("Latte")
latte.prepare()
latte.serve()

tea = Tea("Herbal Tea")
tea.prepare()
tea.serve()