#Shotgun game

# Class Block - A block of code

class Block:
    def __init__(self, code):
        self.code = code

    def execute(self):
        self.code.execute()

    def __str__(self):
        return "Block"