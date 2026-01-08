# live_music_event.py
from datetime import datetime

class LiveMusicEvent:
    def __init__(self, artist: str, hour: int):  # Constructor
        self.artist = artist
        self.start_time = datetime.now()
        self.start_time = self.start_time.replace(hour=hour, minute=0, second=0)
        print(f"Event constructed: {artist} at {self.start_time.strftime('%H:%M')}")
        # Other tasks: prepare_stage()

    def __del__(self):  # Destructor
        print(f"Destructor called: Clearing stage after {self.artist}'s performance")
        # Cleanup: log attendance, release seats

class PastryBatch:
    def __init__(self, type_: str, quantity: int):
        self.type = type_
        self.quantity = quantity
        print(f"Fresh batch constructed: {quantity} {type_} pastries ready!")

    def __del__(self):
        print(f"Batch expired: Cleaning up remaining {self.type} pastries")

# Demo
event = LiveMusicEvent("Jazz Trio", 20)
batch = PastryBatch("Croissants", 50)
del event  # Force destructor (for demo)
# Normally at end of scope or GC