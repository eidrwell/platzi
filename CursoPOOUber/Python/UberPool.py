from car import Car

class UberPool(Car):
    brand = str
    model =  str

    def __init__(self, license, driver, brand, model):
        super.__init__(license, driver)
        self.brad = brand
        self.model = model 