from Pastry import Pastry

class Customer:
    """Represents a customer who can order pastries."""

    def __init__(self, customer_name: str):
        """Initializes the Customer object."""
        self.customer_name = customer_name

    def order_pastry(self, pastry: Pastry) -> None:
        """Simulates a customer ordering a specific pastry."""
        print(f"{self.customer_name} orders a {pastry.name}")
        # Accessing the price via the public property/getter
        print(f"That will be ${pastry.price:.2f}")