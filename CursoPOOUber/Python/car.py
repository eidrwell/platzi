from account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    passengenger = int

    def __init__(self, license, driver):
        self.lisence = license
        self.driver = driver