# Shotgun game
# Class Reload - Reloads the gun

class Reload:
    def __init__(self, gun):
        self.gun = gun

    def reload(self):
        self.gun.reload()

    def __str__(self):
        return "Reload"
