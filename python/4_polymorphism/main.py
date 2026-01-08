from abc import ABC, abstractmethod
class CafeEvent(ABC):
    def __init__(self, name: str):
        self.name = name
    @abstractmethod
    def perform(self):
        pass
    @abstractmethod
    def get_ticket_price(self) -> float:
        pass
    # Overloading via default args or manual
    def schedule(self, promo: str = None):
        if promo:
            print(f"Scheduling {self.name} with {promo}")
        else:
            print(f"Scheduling {self.name}")

class MusicEvent(CafeEvent):
    def __init__(self, name: str, artist: str):
        super().__init__(name)
        self.artist = artist

    def perform(self):
        print(f"{self.artist} rocking the stage!")

    def get_ticket_price(self) -> float:
        return 15.0

# Demo
events = [MusicEvent("Jazz Night", "Trio")]

for event in events:
    event.schedule("Social Media")
    event.perform()  # Runtime dispatch
    print(f"Price: ${event.get_ticket_price()}")

    if isinstance(event, MusicEvent):  # isinstance
        print("Volume up!")