
class Pastry:
    """Represents a pastry with a name, price, and ingredients."""

    def __init__(self, name: str, price: float, ingredients: list[str]):
        """Initializes the Pastry object."""
        self.name = name          # Public: anyone can access
        # Python uses a single leading underscore convention to indicate
        # that an attribute is private/protected, but it is not strictly enforced.
        self._price = price       
        self._ingredients = ingredients 

    def display_info(self) -> None:
        """Prints the pastry's basic information."""
        # Ingredients remain "hidden" (conventionally private) outside
        print(f"Pastry: {self.name} | Price: ${self._price:.2f}")

    @property
    def price(self) -> float:
        """Getter (using property decorator) for the private price field."""
        return self._price


