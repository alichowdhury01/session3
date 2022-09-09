#Shotgun game
# Class Shoot - Shoots the gun

class Shoot:
    def __init__(self, gun):
        self.gun = gun

    def shoot(self):
        self.gun.shoot()

    def __str__(self):
        return "Shoot"